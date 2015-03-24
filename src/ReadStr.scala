trait ReadStr {
  import scala.io.StdIn._;
  val cnt = readInt();
  var lst = List[String]();
  for (i <- 1 to cnt)
  {
    val v = readLine();
    lst = lst :+ v;
  }
}