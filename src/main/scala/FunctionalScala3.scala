object FunctionalScala3  {
  def main(args: Array[String]): Unit = {
//    var list = Seq(1,2,3,4,5,6,7)
//    val list2 = Seq(1,2,3,4,5,6,7)
//    remove(list2, 2)

    randomLottery()
  }

  def remove(coll: Seq[Int], idx: Int): Unit = {
    coll.filter(x => x != coll(idx)) //toList //foreach(x => println(x))
  }

  def randomLottery(): Unit = {
    val r = scala.util.Random
    var u = Set[Int]()

    while(u.size < 6) {
      var rand = r.between(0, 50)
      //if (rand != 0) u += rand
    }

    u  foreach(x => println(x))
  }



}
