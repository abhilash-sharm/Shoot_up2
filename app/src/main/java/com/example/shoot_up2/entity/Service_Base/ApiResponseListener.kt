package com.moteemaids.entity.Service_Base

import okhttp3.Response
import okhttp3.ResponseBody


interface  ApiResponseListener<T> {

    fun onApiSuccess(response: T?, apiName: String?)
    fun onApiErrorBody(response: String, apiName: String?)
    fun onApiFailure(failureMessage: String?, apiName: String?)
}