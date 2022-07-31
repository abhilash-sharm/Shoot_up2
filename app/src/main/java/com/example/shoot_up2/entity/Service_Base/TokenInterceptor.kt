package com.moteemaids.entity.Service_Base

import android.content.Context
import com.moteemaids.Utils.SavedPrefManager
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class TokenInterceptor(var mContext: Context?) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        //rewrite the request to add bearer token
        val UserToken = SavedPrefManager.getStringPreferences(mContext, SavedPrefManager.TOKEN)!!

        val newRequest: Request = chain.request().newBuilder()
            .header("token", UserToken
            )
            .build()

        return chain.proceed(newRequest)
    }
}