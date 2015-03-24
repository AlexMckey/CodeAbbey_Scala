object DiceRoll extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  var lst = List[Float]();
  for (i <- 1 to cnt)
    lst = lst :+ readFloat();
  val res = lst.map(x => (x*6).toInt+1)
  println(res.mkString(" "))
}