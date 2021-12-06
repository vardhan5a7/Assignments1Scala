import org.scalatest.funsuite.AnyFunSuite

class Question3Test extends AnyFunSuite{
   val question3 = new Question3

   test(testName = "add given string last character first and last"){
     assert(question3.addCharacterFrantRear("scala") == "ascalaa")
     assert(question3.addCharacterFrantRear("v")== "v")
     assert(question3.addCharacterFrantRear(("")) == "The given string is null")
   }
}
