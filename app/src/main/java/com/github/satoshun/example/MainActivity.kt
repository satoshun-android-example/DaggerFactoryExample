package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  //  @Inject lateinit var presenter: ArticlePresenter
  lateinit var presenter: ArticlePresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    presenter = DaggerAppFactory.factory().create(10).presenter
//    presenter = DaggerAppFactory.builder().bindInt(10).build().presenter

    inject()
  }
}
