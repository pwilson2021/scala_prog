//class Transaction( id: String, symbol: String,
//                   quantity: Double, date: String,  time: String) extends EquityTrades(id, symbol, quantity, date, time) with FeePayable with Taxable {
//
//    def amount(value: Double = super.value()): Double = {
//      (value + fee) * tax
//    }
//}
