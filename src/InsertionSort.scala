object InsertionSort extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  var arr = readLine().split(" ").map(_.toInt);
  var res = List[Int]();
  for (i <- 1 until cnt) {
    val item = arr(i)
    var iHole = i
    var shift = 0
    while (iHole > 0 && arr(iHole - 1) > item) {
      arr(iHole) = arr(iHole - 1)
      iHole = iHole - 1
      shift += 1
    }
    arr(iHole) = item
    res = res :+ shift
  }
  println(res.mkString(" "))
}