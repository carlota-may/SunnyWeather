package com.zxm.sunnyweather.logic.network

import com.zxm.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

internal interface PlaceService {
    @GET("v2/place?token=\${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlace(@Query("query") query: String): Call<PlaceResponse>
}
