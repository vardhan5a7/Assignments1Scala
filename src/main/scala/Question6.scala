class Question6 {
  def checkRangeTwoIntegers(xValue: Int, yValue: Int): Boolean = {
      if(xValue <= 20 && yValue >= 50)
          true
      else
          false
  }
  println(checkRangeTwoIntegers(20, 60))
  println(checkRangeTwoIntegers(21, 50))
  println(checkRangeTwoIntegers(20, 45))
}
