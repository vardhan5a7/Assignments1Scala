import org.scalatest.funsuite.AnyFunSuite

class Question7Test extends AnyFunSuite{
  val question7 = new Question7

  test(testName = "check the given string is happy or not happy string"){
    assert(question7.checkStringHappyOrNot("happy",2) == "Happy")
    assert(question7.checkStringHappyOrNot("malayalam", 3) == "Not Happy")
    assert(question7.checkStringHappyOrNot("", 7) == "The given string is null")
    assert(question7.checkStringHappyOrNot("developer", 17) == "choose correct index value")
  }
}
