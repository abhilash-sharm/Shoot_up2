package com.moteemaids.entity.Service_Base


import android.content.Context
import com.example.shoot_up2.Data_Class_Responce
import com.moteemaids.entity.ApiCallBack

class ServiceManager(var mContext: Context?) {

    private val accessToken: String? = null

    companion object {

        private var mServiceManager: ServiceManager? = null
        fun getInstance(context: Context?): ServiceManager? {
            if (mServiceManager == null) {
                mServiceManager = ServiceManager(context)
            }
            return mServiceManager
        }
    }

    // List Api
    fun list(callBack: ApiCallBack<Data_Class_Responce>) {
        mContext?.let { Remotedatasource.current(it, true)!!.getlist() }!!.enqueue(callBack)
    }

}