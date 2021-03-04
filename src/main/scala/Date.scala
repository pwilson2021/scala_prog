import java.text.SimpleDateFormat

object Date {
  def main(args: Array[String]): Unit = {
    dateFunc("25/11/21")
  }

  def dateFunc(date: String): Unit =  {
    val inputFormat = new SimpleDateFormat("dd/MM/yy")
    val outputFormat = new SimpleDateFormat("MMMMM yyyy")
    var myList = date.split("/")
    var remainder = myList(0).toInt % 10
    var day: String = ""

    (remainder) match {
      case 1 =>
          day = s"""${myList(0)}st"""
      case 2 =>
        day = s"""${myList(0)}nd"""
      case 3 =>
        day = s"""${myList(0)}rd"""
      case _ =>
        day = s"""${myList(0)}th"""
    }

    val formattedDate = outputFormat.format(inputFormat.parse(date))

    println(day+" "+formattedDate)
  }
}
