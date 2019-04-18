package net.gtl.librarytest

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    public fun testFunc(){
        Log.e(this.javaClass.simpleName,"Testing this class")
    }
}