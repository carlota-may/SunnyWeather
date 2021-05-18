package com.zxm.sunnyweather.logic

import androidx.lifecycle.liveData
import com.zxm.sunnyweather.logic.model.Place
import com.zxm.sunnyweather.logic.network.SunnyWeatherNetWork
import kotlinx.coroutines.Dispatchers

object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetWork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val palces = placeResponse.places
                Result.success(palces)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}
