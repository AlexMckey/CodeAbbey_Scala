object BubbleInArray extends App {
  import scala.io.StdIn._;
  var arr = readLine().split(" ").dropRight(1).map(_.toInt);
  var swp = 0;
  for (i <- 1 to arr.length-1) {
    if (arr(i-1) > arr(i)) {
      val tmp = arr(i)
      arr(i) = arr(i-1)
       arr(i-1) = tmp
      swp += 1;
    }
  }
  val res = arr.foldLeft(0L)((acc,v) => (acc + v) * 113 % 10000007);
  println(swp.toString + " " + res)
}