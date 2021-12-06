class Question2 {
  def removeIndexValue(str: String, indexValue: Int): String = {
      var res = ""
      if(str.isEmpty())
        return "The given string is null"
      if(str.length() <= 1)
        str
      else if(indexValue > str.length  - 1 )
        "index value greater then string length"
      else {
        for(i <- 0 to str.length - 1)
        {
            if(i != indexValue) {
              res += str.charAt(i)
            }
        }
        res
      }
  }
  println(removeIndexValue("scala", 2))
  println(removeIndexValue("scala", 1))
  println(removeIndexValue("scala", 0))
  println(removeIndexValue("scala", 3))
  println(removeIndexValue("scala", 7))
  println(removeIndexValue("", 3))
}
