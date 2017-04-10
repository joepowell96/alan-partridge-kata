package com.example

object Hello {

  def getWelcomeMessage(lang: String): Option[String] = {

    lang match {
      case "en" => Some("Hello World")
      case "es" => Some("Hola Mundo")
      case _ => None
    }
  }
}
