object ArrayCounters extends App {
  import scala.io.StdIn._;
  val _ = readLine();
  val lst = readLine().split(" ").map(_.toInt);
  val res = lst.toList.groupBy(i => i).map({case (i,l) => (i,l.length)}).toList.sorted;
  println(res.map(_._2).mkString(" "));
}