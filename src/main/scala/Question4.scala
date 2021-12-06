class Question4  {
  def concatinateString(str: String): String = {
    if(str.isEmpty())
      return "The given sting is null"
    if(str.startsWith("if"))
      str
    else
      "if" + " " + str
  }
  println(concatinateString("you get errors then you feel pain"))
  println(concatinateString("if your code run you feel better"))
  println(concatinateString(""))
}
