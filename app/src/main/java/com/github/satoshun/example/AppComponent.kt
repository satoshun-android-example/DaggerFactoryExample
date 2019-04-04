package com.github.satoshun.example

import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {
  val presenter: ArticlePresenter

  @Component.Factory
  interface Factory {
    fun create(
      app: AppModule,
      @BindsInstance age: Int
    ): AppComponent
  }

//  @Component.Builder
//  interface Builder {
//    fun setAppModule(module: AppModule): Builder
//    @BindsInstance fun bindInt(i: Int): Builder
//    fun build(): AppComponent
//  }
}

fun AppComponent.Factory.createPresenter(
  name: String,
  age: Int
): ArticlePresenter {
  return create(AppModule(name), age).presenter
}

@Module
class AppModule(private val name: String) {
  @Provides fun provideName() = name
}
