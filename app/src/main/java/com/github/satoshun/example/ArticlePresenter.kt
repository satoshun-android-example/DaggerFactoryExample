package com.github.satoshun.example

import javax.inject.Inject

class ArticlePresenter @Inject constructor(
  private val service: ArticleService
)

class ArticleService @Inject constructor()
