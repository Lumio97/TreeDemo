package com.example.tree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemList.adapter = TreeAdapter(listOf(
        "one",
        "two",
        "three",
        "four",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three",
            "three"


        ))
    }
}
