package com.zxm.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(
        val places: List<Place>,
        val query: String,
        val status: String
)

data class Place(
        @SerializedName("formatted_address") val formattedAddress: String,
        val id: String,
        val location: Location,
        val name: String,
        @SerializedName("place_id") val placeId: String
)

data class Location(
        val lat: Double,
        val lng: Double
)
