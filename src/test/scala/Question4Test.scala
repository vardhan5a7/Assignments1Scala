import org.scalatest.funsuite.AnyFunSuite

class Question4Test extends AnyFunSuite{
  val question4 = new Question4

  test(testName = "check the given string starting with if or not"){
    assert(question4.concatinateString("if your code run you feel better") == "if your code run you feel better")
    assert(question4.concatinateString("you get errors then you feel pain") == "if you get errors then you feel pain")
    assert(question4.concatinateString("") == "The given sting is null")
  }

}
