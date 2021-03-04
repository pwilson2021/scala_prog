
object functionalScala extends App {
      println(mathFunc("add", 4, 5))
      println(mathFunc("subtract", 5, 4))
      println(mathFunc("power", 5, 4))


      def mathFunc(operator: String, x: Int, y:Int): Int = {
         if (operator == "add") {
           add(x, y)
         } else if(operator == "subtract") {
           subtract(x, y)
         } else if(operator == "power") {
           power(x, y)
         } else {
           println("The methods add, subtract & power")
           0
         }
      }

      def add(x:Int , y:Int ): Int = {
          x + y
      }

      def subtract(x:Int , y:Int): Int = {
          x - y
      }

      def power(x:Int, y:Int): Int = {
          scala.math.pow(x, y).toInt
      }
}
