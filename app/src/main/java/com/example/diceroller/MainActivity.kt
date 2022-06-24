package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
  var count: Int = 0
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val rollButton: Button = findViewById(R.id.button_wuerfel)
    val diceImage: ImageView = findViewById(R.id.image_Wuerfel)

    rollButton.setOnClickListener {
      rollTheDice(diceImage)
    }
  }


  fun rollTheDice(imageView: ImageView) {
    val rollResult: Int = (1..6).random()

    when (rollResult) {
      1 -> imageView.setImageResource(R.drawable.wuerfel1)
      2 -> imageView.setImageResource(R.drawable.wuerfel2)
      3 -> imageView.setImageResource(R.drawable.wuerfel3)
      4 -> imageView.setImageResource(R.drawable.wuerfel4)
      5 -> imageView.setImageResource(R.drawable.wuerfel5)
      6 -> imageView.setImageResource(R.drawable.wuerfel6)
    }
  }
}


