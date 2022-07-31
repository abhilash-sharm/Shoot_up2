package com.example.shoot_up2

import com.google.gson.annotations.SerializedName


data class Data_Class_Responce(

    @SerializedName("count") val count: Int,
    @SerializedName("totalCount") val totalCount: Int,
    @SerializedName("page") val page: Int,
    @SerializedName("totalPages") val totalPages: Int,
    @SerializedName("lastItemIndex") val lastItemIndex: Int,
    @SerializedName("results") val results: List<Results>
)


data class Results(

    @SerializedName("_id") val _id: String,
    @SerializedName("author") val author: String,
    @SerializedName("content") val content: String,
    @SerializedName("tags") val tags: List<String>,
    @SerializedName("authorSlug") val authorSlug: String,
    @SerializedName("length") val length: Int,
    @SerializedName("dateAdded") val dateAdded: String,
    @SerializedName("dateModified") val dateModified: String
)