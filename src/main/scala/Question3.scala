class Question3 {
  def addCharacterFrantRear(string: String): String = {
    if(string.isEmpty())
      return "The given string is null"
    if(string.length <= 1)
      string
    else
      string.charAt(string.length - 1) +: string :+ string.charAt(string.length - 1)
  }
  println(addCharacterFrantRear("scala"))
  println(addCharacterFrantRear("v"))
  println(addCharacterFrantRear(""))
}
