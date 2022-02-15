package ru.vidos.doubleactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ru.vidos.doubleactivity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySecondBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_second)

        Log.d(LOG_TAG, "SecondActivity: onCreate()")

        val count = intent.getIntExtra(EXTRA_NUMBER, 0)
        binding.count = (count * count).toString()
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "SecondActivity: onStart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_TAG, "SecondActivity: onSaveInstanceState")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(LOG_TAG, "SecondActivity: onRestoreInstanceState")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "SecondActivity: onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "SecondActivity: onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "SecondActivity: onResume ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "SecondActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "SecondActivity: onDestroy")
    }
}