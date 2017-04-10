import com.example.Partridge
import org.scalatest._

class PartridgeSpec extends FlatSpec with Matchers {

  // SUT stands for System under test, usually the class you are testing.
  val SUT = new Partridge()

  "speak" should "return 'Lynn, I've pierced my foot on a spike!!'" in {

    val result = SUT.speak(List(""))

    result shouldBe "Lynn, I've pierced my foot on a spike!!"
  }

  it should "return Mine's a Pint! when Partridge or PearTree or Chat or Dan or Toblerone or Lynn or " +
    "AlphaPapa or Nomad is said." in {

    val phrases = List("Partridge")

    val result = SUT.speak(phrases)

    result shouldBe "Mine's a Pint!"
  }

  it should "return Mine's a Pint! when Partridge or PearTree or Chat or Dan or Toblerone or Lynn or " +
    "AlphaPapa or Nomad is said and a non phrase is said also" in {

    val phrases = List("Partridge", "random")

    val result = SUT.speak(phrases)

    result shouldBe "Mine's a Pint!"
  }

  it should "return Mine's a Pint!! when two phrases are said" in {

    val phrases = List("Partridge", "PearTree")

    val result = SUT.speak(phrases)

    result shouldBe "Mine's a Pint!!"
  }

  it should "return Mine's a Pint!! when the same phrase is said twice" in {

    val phrases = List("Partridge", "Partridge")

    val result = SUT.speak(phrases)

    result shouldBe "Mine's a Pint!!"
  }

  it should "return Mine's a Pint!!! when the phrase is said twice and another phrase is said" in {

    val phrases = List("Partridge", "Partridge", "PearTree")

    val result = SUT.speak(phrases)

    result shouldBe "Mine's a Pint!!!"
  }

  it should "return Mine's a Pint!!!!!!!! when all phrases are said once each" in {

    val phrases = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

    val result = SUT.speak(phrases)

    result shouldBe "Mine's a Pint!!!!!!!!"
  }
}
