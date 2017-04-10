import com.example.Hello
import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {

  // SUT stands for System under test, usually the class you are testing.
  val SUT = Hello

  // getWelcomeMessage is the method we are testing.
  // After the should we explain what the test is testing.
  "getWelcomeMessage" should "return an Hello World when en is passed in" in {

    val language = "en"

    val result = SUT.getWelcomeMessage(language)

    result shouldBe Some("Hello World")
  }

  it should "return a value of Hola Mundo when es is passed in" in {

    val language = "es"

    val result = SUT.getWelcomeMessage(language)

    result shouldBe Some("Hola Mundo")
  }

  it should "return a value of None when an empty string is passed in" in {

    val language = ""

    val result = SUT.getWelcomeMessage(language)

    result shouldBe None
  }
}
