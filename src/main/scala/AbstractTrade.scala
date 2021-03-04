abstract class AbstractTrade
  (val id: String, val symbol: String, val quantity: Double, val date: String, val time: String, var price: Double){
  def value(): Double
  def isExecutable(): Boolean
  def _price(): Double
  def price_(): Unit

  override def toString = s"AbstractTrade($isExecutable)"
}
