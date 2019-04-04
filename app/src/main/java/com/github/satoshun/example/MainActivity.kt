package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  //  @Inject lateinit var presenter: ArticlePresenter
  private lateinit var presenter: ArticlePresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    val component = DaggerAppComponent.factory().create(
      AppModule("sato"),
      10
    )

//    val component = DaggerAppComponent
//      .builder()
//      .setAppModule(AppModule("sato"))
//      .bindInt(10)
//      .build()

    presenter = component.presenter
    println(presenter)

//    inject()
  }
}
