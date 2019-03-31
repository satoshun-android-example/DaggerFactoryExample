package com.github.satoshun.example

fun MainActivity.inject() = DaggerAppComponent.create().inject(this)
