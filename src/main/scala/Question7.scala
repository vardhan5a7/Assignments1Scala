class Question7 {
  def checkStringHappyOrNot(string: String, indexValue: Int): String = {
    var check = false
    if(string.isEmpty())
      return "The given string is null"
    if(indexValue > string.length)
      return "choose correct index value"
    if(indexValue >= 0 && indexValue <= string.length)
      if(string.charAt(indexValue) == string.charAt(indexValue - 1))
         "Happy"
      else if(string.charAt(indexValue) == string.charAt(indexValue + 1))
        "Happy"
      else
        "Not Happy"
    else
      "Both conditions fail"
  }
  println(checkStringHappyOrNot("happy", 2))
  println(checkStringHappyOrNot("malayalam", 3))
  println(checkStringHappyOrNot("" , 7))
  println(checkStringHappyOrNot("developer", 17))
}
