package io.qnips.parcelize

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        intent?.extras?.getParcelable<ParcelizeModel>("dataModel")?.let {
            Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
