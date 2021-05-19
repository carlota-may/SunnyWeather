package com.zxm.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

data class RealtimeResponse(val result: Result, val status: String) {

    data class Result(val realtime: Realtime)

    data class Realtime(
            @SerializedName("air_quality")
            val airQuality: AirQuality,
            val skycon: String,
            val temperature: Float
    )

    data class AirQuality(val aqi: Aqi)

    data class Aqi(val chn: Float)
}
