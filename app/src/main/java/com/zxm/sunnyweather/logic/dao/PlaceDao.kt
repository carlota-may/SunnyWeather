package com.zxm.sunnyweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.zxm.sunnyweather.SunnyWeatherApplication
import com.zxm.sunnyweather.logic.model.Place

object PlaceDao {
    private fun sharedPerferences() = SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)

    fun savePlace(place: Place) {
        val editor = sharedPerferences().edit { putString("place", Gson().toJson(place))
        }
    }

    fun getPlace(): Place {
        val placeJson = sharedPerferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPerferences().contains("place")
}
