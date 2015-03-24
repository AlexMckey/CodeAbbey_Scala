object SumsInLoop extends App {
  import scala.io.StdIn._;
  val l = readInt();
  var as = List[Array[Int]]();
  for (i <- 1 to l)
    as = as :+ readLine().split(" ").map(_.toInt);
  Console.println(as.map(_.sum).mkString(" "));
}