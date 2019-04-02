package com.github.satoshun.example

import dagger.BindsInstance
import dagger.Component

@Component
interface AppFactory {
  val presenter: ArticlePresenter

  @Component.Factory
  interface Factory {
    fun create(@BindsInstance i: Int): AppFactory
  }

//  @Component.Builder
//  interface Builder {
//    @BindsInstance fun bindInt(i: Int): Builder
//    fun build(): AppFactory
//  }
}
