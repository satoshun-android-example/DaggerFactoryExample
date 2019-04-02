package com.github.satoshun.example

import javax.inject.Inject

class ArticlePresenter @Inject constructor(
  private val service: ArticleService,
  private val i: Int
)

class ArticleService @Inject constructor()
