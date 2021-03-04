case class CaseTrade (val id: String, val symbol: String, val quantity:Double,
                 private var _price: Double, val date:String , val time:String )

object CaseTrade {
  def main(args: Array[String]): Unit = {
    val trade = CaseTrade("APPL", "APPL", 10.0, 15.0, "21/05/21", "25:00")
    println(trade.toString)
    println(trade.equals())
    println(trade.hashCode())

  }
  def apply(id: String, symbol: String, quantity: Double, _price: Double, date: String, time: String):
      CaseTrade = new CaseTrade(id, symbol, quantity, _price, date, time)
}