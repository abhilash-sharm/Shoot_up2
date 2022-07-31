package com.moteemaids.extension

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

fun Fragment.diasplay_toast(message:String?)
{

    Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
}
fun Activity.diasplay_toast(message:String?)
{
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}
fun Context.diasplay_toast(message:String?)
{
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}
fun ImageView.load(url: String) {
    Glide.with(this)
        .load(url)
        .into(this)
}