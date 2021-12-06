import org.scalatest.funsuite.AnyFunSuite

class Question7Test extends AnyFunSuite{
  val question7 = new Question7

  test(testName = "check the given string is happy or not happy string"){
    assert(question7.checkStringHappyOrNot("happy") == "Happy")
    assert(question7.checkStringHappyOrNot("malayalam") == "Not Happay")
    assert(question7.checkStringHappyOrNot("") == "The given string is null")
  }
}
