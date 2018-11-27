package io.qnips.parcelize

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("model", ParcelizeModel("Foo", 42))
        startActivity(intent)
    }
}
