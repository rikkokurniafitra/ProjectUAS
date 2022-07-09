package com.example.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {

    @GET("/3/tv/popular?api_key=21aada851713c086f599c5043491bca2")
    fun getTvList(): Call<TvResponse>
}