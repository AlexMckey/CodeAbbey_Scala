trait ReadArr {
  import scala.io.StdIn._;
  val cnt = readInt();
  var lst = List[Array[Int]]();
  for (i <- 1 to cnt)
  {
    val v = readLine().split(" ").map(_.toInt);
    lst = lst :+ v;
  }
}