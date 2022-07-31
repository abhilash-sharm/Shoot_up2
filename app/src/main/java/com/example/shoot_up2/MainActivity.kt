package com.example.shoot_up2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoot_up2.Adaptor.Data_Adapter
import com.moteemaids.entity.ApiCallBack
import com.moteemaids.entity.Service_Base.ApiResponseListener
import com.moteemaids.entity.Service_Base.ServiceManager
import com.moteemaids.extension.androidextention
import com.moteemaids.extension.diasplay_toast
import java.util.ArrayList

class MainActivity : AppCompatActivity(),  ApiResponseListener<Data_Class_Responce>  {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Data_Adapter
    var mContext: Context = this


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.Recycler)
        listAddressApi()

    }

    private fun  listAddressApi() {
        if (androidextention.isOnline(mContext)) {
            androidextention.showProgressDialog(mContext)
            val serviceManager = ServiceManager(mContext)

            val callBack: ApiCallBack<Data_Class_Responce> =
                ApiCallBack<Data_Class_Responce>(this, "Api", mContext)

            try {

                serviceManager.list(callBack)

            } catch (e: Exception) {
                e.printStackTrace()
            }
        } else {

            diasplay_toast("Please check your internet connection!")
        }
    }

    override fun onApiSuccess(response: Data_Class_Responce?, apiName: String?) {
        diasplay_toast("Success")
        if (response != null) {
            var List = response.results as ArrayList<Results>
            Adaptor(List)
        }
    }

    override fun onApiErrorBody(response: String, apiName: String?) {
        diasplay_toast("Error")

    }

    override fun onApiFailure(failureMessage: String?, apiName: String?) {
        diasplay_toast("Failure")

    }

    private fun Adaptor(List: ArrayList<Results>) {
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = Data_Adapter(this, List)
        recyclerView.adapter = adapter
    }
}