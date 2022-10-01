package com.akinayhan.coroutinesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun endlessLoop(){
            var counter = 0
            while (counter<100000){
                println("Counter" + counter)
                counter++
            }
        }

        CoroutineScope(Dispatchers.IO).launch {
            val answer = doNetworkCall()
            withContext(Dispatchers.Main) {
                Log.v("TEST", answer)
            }
            endlessLoop()
        }

    }
    suspend fun doNetworkCall(): String {
        delay(2000L)
        return "Network Answer Called"
    }
}