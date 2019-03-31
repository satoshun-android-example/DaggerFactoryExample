package com.github.satoshun.example.androidx.recommendation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recommendation.app.ContentRecommendation

class RecommendationActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.recommendation_activity_main)

    val r = ContentRecommendation
      .Builder()
      .build()
  }
}
