object BubbleSort extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  var arr = readLine().split(" ").map(_.toInt);
  var chng = false;
  var swp = 0;
  var pass = 0;
  do {
    chng = false;
    for (i <- 1 to cnt-1) {
      if (arr(i-1) > arr(i)) {
        chng = true;
        val tmp = arr(i)
        arr(i) = arr(i-1)
        arr(i-1) = tmp
        swp += 1;
      }
    }
    pass += 1
  } while (chng)
  println(pass.toString + " " + swp)
}