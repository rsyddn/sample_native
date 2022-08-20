package com.example.sample_native

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    private lateinit var flutterButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        flutterButton = findViewById(R.id.btn_go_to_flutter)
        flutterButton.setOnClickListener {
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            )
        }
    }
}