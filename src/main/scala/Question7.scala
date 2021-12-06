class Question7 {
  def checkStringHappyOrNot(string: String): String = {
    var check = false
    if(string.isEmpty())
      return "The given string is null"
    for(i <- 1 to string.length - 1)
      if(string.charAt(i) == string.charAt(i - 1))
        check = true

    if(check == true)
      "Happy"
    else
      "Not Happay"
  }
  println(checkStringHappyOrNot("happy"))
  println(checkStringHappyOrNot("malayalam"))
  println(checkStringHappyOrNot(""))
}
