package com.asadbek.asyntask

import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyAsyncTask().execute()

    }
    inner class MyAsyncTask:AsyncTask<Void?,Void?,Void?>(){
        @Deprecated("Deprecated in Java")
        override fun onPreExecute() {
            Toast.makeText(this@MainActivity, "OnPreExecute", Toast.LENGTH_SHORT).show()
            super.onPreExecute()
        }
        @Deprecated("Deprecated in Java")
        override fun doInBackground(vararg params: Void?): Void? {
            Toast.makeText(this@MainActivity, "doInBackground", Toast.LENGTH_SHORT).show()
            return null
        }

        @Deprecated("Deprecated in Java")
        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            Toast.makeText(this@MainActivity, "OnPostExecute", Toast.LENGTH_SHORT).show()
        }

    }
}
















