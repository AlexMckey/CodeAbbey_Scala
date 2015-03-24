object SumInLoop extends App {
  import scala.io.StdIn._;
  val a = readInt();
  val b = readLine();
  var r = b.split(" ").map(_.toInt).sum;
  System.out.println(r);
}