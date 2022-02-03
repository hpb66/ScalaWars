// https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/scala


class Meeting extends Display{
    def displayOutput(): Unit = {
        println(meeting("Anna:Wahl;Grace:Gates;James:Russell;Elizabeth:Rudd;Victoria:STAN;Jacob:Wahl;" +
          "Alex:Wahl;Antony:Gates;Alissa:Meta;Megan:Bell;Amandy:Stan;Anna:Steve"))
    }
    def meeting(s: String): String = {
        s.toUpperCase.split(";").toList.map{ names => 
            val nameList = names.split(":").toList
            (nameList(1), nameList(0))
        }.sortBy(_._2).sortBy(_._1).map{case(fname, lname) => s"($fname, $lname)"}.mkString("")
    }   
}