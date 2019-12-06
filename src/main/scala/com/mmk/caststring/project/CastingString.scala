package com.mmk.caststring.project

object CastingString extends App {
  def castStringToInteger(text: String): Option[Int] = {
    try {
      Some(text.toInt)
    } catch {
      case e: Exception => None
    }
  }
}
