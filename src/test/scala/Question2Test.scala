import org.scalatest.funsuite.AnyFunSuite

class Question2Test extends AnyFunSuite{
    val question2 = new Question2

    test(testName = "Remove index value given string "){
      assert(question2.removeIndexValue("scala", 2) == "scla")
      assert(question2.removeIndexValue("scala", 1) == "sala")
      assert(question2.removeIndexValue("scala", 0) == "cala")
      assert(question2.removeIndexValue("scala", 3) == "scaa")
      assert(question2.removeIndexValue("s", 1) == "s")
      assert(question2.removeIndexValue("", 3) == "The given string is null")
      assert(question2.removeIndexValue("scala", 5) == "index value greater then string length")
    }
}
