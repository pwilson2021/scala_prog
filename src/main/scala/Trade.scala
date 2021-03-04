import java.util.Date

class Trade (val id: String, val symbol: String, val quantity:Double, private var _price: Double, val date:String , val time:String ) {
  def price= _price
  def price_=(price: Double) = { if (price >= 0) _price = price }
  //def price_=(price: Double) = { if (price >= 0) _price = price }

  def value():Double = {
      quantity * price
  }

    override def toString: String = s"""
        A Trade has an id of $id,
        symbol $symbol with quantity $quantity a
        nd price of Ghc $price
      """
}

object Trade  {
    def main(args: Array[String]): Unit = {

    }
}
