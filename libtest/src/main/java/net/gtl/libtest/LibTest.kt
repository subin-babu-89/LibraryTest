package net.gtl.libtest

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class LibTest : AppCompatActivity() {

    fun testlog(message:String){
        Log.e(this.localClassName,message)
    }
}