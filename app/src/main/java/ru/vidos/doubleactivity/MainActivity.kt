package ru.vidos.doubleactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ru.vidos.doubleactivity.databinding.ActivityMainBinding

const val LOG_TAG = "myLogs"
const val EXTRA_NUMBER = "number"

class MainActivity : AppCompatActivity() {

    private var count = 0

    /**
     * Called when the activity is first created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this

        Log.d(LOG_TAG, "MainActivity: onCreate")

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(EXTRA_NUMBER) + 1
            binding.count = count.toString()
        } else {
            binding.count = count.toString()
        }

    }

    /**
     * Starts a new activity on button click.
     */
    fun newActivity() {
        Log.d(LOG_TAG, "MainActivity: buttonClick")
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra(EXTRA_NUMBER, count)
        }
        startActivity(intent)
    }

    /**
     * When the activity enters the Started state,
     * the system invokes this callback. The onStart() call
     * makes the activity visible to the user, as the app
     * prepares for the activity to enter the foreground
     * and become interactive. For example, this method is where
     * the app initializes the code that maintains the UI.
     */
    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "MainActivity: onStart")
    }

    /**
     * Invoked when the activity may be temporarily destroyed,
     * save the instance state here.
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_TAG, "MainActivity: onSaveInstanceState")

        outState.putInt(EXTRA_NUMBER, count)
    }

    /**
     * This callback is called only when there is a saved instance
     * that is previously saved by using onSaveInstanceState().
     * We restore some state in onCreate(), while we can optionally restore
     * other state here, possibly usable after onStart() has completed.
     * The savedInstanceState Bundle is same as the one used in onCreate().
     */
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(LOG_TAG, "MainActivity: onRestoreInstanceState")
    }

    /**
     * The system calls this method as the first indication
     * that the user is leaving the activity
     * (though it does not always mean the activity is being destroyed);
     * it indicates that the activity is no longer in the foreground
     * (though it may still be visible if the user is in multi-window mode).
     */
    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "MainActivity: onPause")
    }

    /**
     * Called after onStop() when the current activity is being
     * re-displayed to the user (the user has navigated back to it).
     * It will be followed by onStart() and then onResume().
     */
    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "MainActivity: onRestart")
    }

    /**
     * When the activity enters the Resumed state,
     * it comes to the foreground, and then the system invokes
     * the onResume() callback. This is the state in which the app
     * interacts with the user. The app stays in this state until
     * something happens to take focus away from the app.
     * Such an event might be, for instance, receiving a phone call,
     * the user’s navigating to another activity,
     * or the device screen’s turning off.
     */
    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "MainActivity: onResume ")
    }

    /**
     * When the activity is no longer visible to the user,
     * it has entered the Stopped state, and the system invokes
     * the onStop() callback. This may occur, for example,
     * when a newly launched activity covers the entire screen.
     * The system may also call onStop() when the activity has finished running,
     * and is about to be terminated.
     */
    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "MainActivity: onStop")
    }

    /**
     * Called before the activity is destroyed.
     * The system invokes this callback either because:
     * the activity is finishing (due to the user completely
     * dismissing the activity or due to finish() being called on the activity),
     * or the system is temporarily destroying the activity
     * due to a configuration change (such as device rotation or multi-window mode)
     */
    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "MainActivity: onDestroy")
    }
}