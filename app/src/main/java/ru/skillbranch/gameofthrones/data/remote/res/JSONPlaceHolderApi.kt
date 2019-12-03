package ru.skillbranch.gameofthrones.data.remote.res

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JSONPlaceHolderApi {

    @GET("/houses/{id}")
    fun getHouse(@Path("id") id: Int): Call<HouseRes>

    @GET("/houses")
    fun getHouses(): Call<List<HouseRes>>

}