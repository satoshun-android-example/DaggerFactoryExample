package com.github.satoshun.example

import javax.inject.Inject

data class ArticlePresenter @Inject constructor(
  private val service: ArticleService,
  private val name: String,
  private val i: Int
)

class ArticleService @Inject constructor()
