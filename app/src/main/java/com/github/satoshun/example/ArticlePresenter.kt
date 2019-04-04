package com.github.satoshun.example

import javax.inject.Inject

class ArticlePresenter @Inject constructor(
  private val service: ArticleService,
  private val name: String,
  private val age: Int
)

class ArticleService @Inject constructor()
