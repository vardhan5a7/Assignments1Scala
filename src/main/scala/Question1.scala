  class Question1 {
    def printFirstTwoCharacters(str: String): String = {

      if(str.isEmpty())
        return "The given string is null"
      if(str.length <= 1)
          str
      else
        str.substring(0,2) * 4
    }
    println(printFirstTwoCharacters("India"))
    println(printFirstTwoCharacters("scala"))
    println(printFirstTwoCharacters("DB"))
    println(printFirstTwoCharacters("s"))
    println(printFirstTwoCharacters(""))
  }


