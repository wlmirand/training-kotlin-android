package william.miranda.kotlintraining.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import william.miranda.kotlintraining.R

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("IPG", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("IPG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("IPG", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("IPG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("IPG", "onStop")
    }

    override fun onDestroy() {
        Log.d("IPG", "onDestroy")
        super.onDestroy()
    }
}