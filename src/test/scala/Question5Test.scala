import org.scalatest.funsuite.AnyFunSuite

class Question5Test extends AnyFunSuite{

  val question5 = new Question5
  test(testName = "check two given integer value nearest to 100"){
    assert(question5.checkNearestValueTo100(20, 30) == 30)
    assert(question5.checkNearestValueTo100(70, 30) == 70)
    assert(question5.checkNearestValueTo100(77, 77) == 0)
    assert(question5.checkNearestValueTo100(50, 120) == 120)
    assert(question5.checkNearestValueTo100(120,150) == 120)
    assert(question5.checkNearestValueTo100(-120, 150) == 120)
    assert(question5.checkNearestValueTo100(-40, -60) == 60)
  }
}
