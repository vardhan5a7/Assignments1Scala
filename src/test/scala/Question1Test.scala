import org.scalatest.funsuite.AnyFunSuite

class Question1Test extends AnyFunSuite{
  val question1 = new Question1

  test(testName = "check the valid string are not "){
    assert(question1.printFirstTwoCharacters("India") == "InInInIn")
    assert(question1.printFirstTwoCharacters("scala") == "scscscsc")
    assert(question1.printFirstTwoCharacters("s") == "s")
    assert(question1.printFirstTwoCharacters("DB") == "DBDBDBDB")
    assert(question1.printFirstTwoCharacters("") == "The given string is null")
  }

}
