package com.example

class Partridge {

  private val phrases = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

  def speak(words: List[String]): String = {

    // We should rarely use var's in scala, however they are okay to use in methods.
    var numOfPhrases = 0


    // Scala's equivalent to a foreach
    for (word <- words) {
      for (phrase <- phrases) {
        if (word == phrase) numOfPhrases += 1
      }
    }

    // A bit more scala 'e' with lambdas
//    words.foreach{ word =>
//      phrases.foreach{ phrase =>
//        if (word == phrase) {
//          numOfPhrases += 1
//        }
//      }
//    }

    // Scala - functionally
    //    val numOfPhrases = words.count(word => phrases.contains(word))

    if (numOfPhrases > 0) "Mine's a Pint" + ("!" * numOfPhrases)
    else "Lynn, I've pierced my foot on a spike!!"
  }
}
