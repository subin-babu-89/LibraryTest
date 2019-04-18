package net.gtl.libtest

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class LibTest : AppCompatActivity() {

    abstract fun testlog(message:String)

    fun logginMessage() = "Library test success"
}