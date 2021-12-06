class Question5 {
  def checkNearestValueTo100(firstValue: Int, secoundValue: Int): Int = {

    //if Both are equal return 0
    if(firstValue == secoundValue)
        0
    //if both values less then 100 find the nearest value to 100
    else if(firstValue <= 100 && secoundValue <= 100)
      if(Math.abs(firstValue) > Math.abs(secoundValue))
         Math.abs(firstValue)
       else
         Math.abs(secoundValue)
    //if one of the value greater then 100 using given below validations
    else
      {
        var first  = Math.abs(firstValue) - 100
        var secound = Math.abs(secoundValue) - 100
        if(first <= 0 || secound <= 0) {
          first = -first
          secound = -secound
        }
        if(first < secound)
          Math.abs(firstValue)
        else
          Math.abs(secoundValue)
      }

  }
  println(checkNearestValueTo100(20, 30))
  println(checkNearestValueTo100(70, 10))
  println(checkNearestValueTo100(77, 77))
  println(checkNearestValueTo100(50, 120))
  println(checkNearestValueTo100(120,150))
}
