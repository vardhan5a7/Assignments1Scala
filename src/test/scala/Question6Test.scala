import org.scalatest.funsuite.AnyFunSuite

class Question6Test extends AnyFunSuite{
  val question6 = new Question6

  test(testName = "check the range of two integers "){
    assert(question6.checkRangeTwoIntegers(20,60) == true)
    assert(question6.checkRangeTwoIntegers(21, 50) == false)
    assert(question6.checkRangeTwoIntegers(20, 45) == false)
  }
}
