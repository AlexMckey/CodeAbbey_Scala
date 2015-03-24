object SelectionSort extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  var arr = readLine().split(" ").map(_.toInt);
  var res = List[Int]();
  for (i <- cnt-1 to 1 by -1) {
    var maxi = 0
    for (j <- 1 to i) 
      if (arr(maxi) < arr(j)) maxi = j
    var t = arr(maxi)
    arr(maxi) = arr(i)
    arr(i) = t
    res = maxi :: res
  }
  println(res.reverse.mkString(" "))
}