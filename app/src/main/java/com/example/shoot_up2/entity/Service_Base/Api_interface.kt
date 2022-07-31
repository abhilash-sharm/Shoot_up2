package com.moteemaids.entity.Service_Base


import com.example.shoot_up2.Data_Class_Responce
import retrofit2.Call
import retrofit2.http.*


interface Api_interface {
    @GET("/quotes")
    fun getlist(): Call<Data_Class_Responce>?

}
