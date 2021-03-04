import Array._

object Hello {
  def main(args: Array[String]): Unit = {
    //println("Hello")
    //convertTemp(34.0)
    convertDate("02/03/21")
  }

  def convertTemp(c: Double ): Unit = {
    var f = (c * 9 / 5) + 32
    println(f)
  }

  def convertDate(dateString: String): Unit = {
    var months = Map(
      "01" -> "January",
      "02" -> "February",
      "03" -> "March",
      "04" -> "April",
      "05" -> "May",
      "06" -> "June",
      "07" -> "July",
      "08" -> "August",
      "09" -> "September",
      "10" -> "October",
      "11" -> "November",
      "12" -> "December"
    )
    var days = Map(
      "01" -> "1st"
    )
    var myList = dateString.split("/")

    //var day = myList(0) % 10


//    for (x <- myList) {
//      println(x)
//    }
  }
}
