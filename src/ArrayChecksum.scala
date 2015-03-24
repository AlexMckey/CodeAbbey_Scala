object ArrayChecksum extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  val lst = readLine().split(" ").toList.map(_.toLong);
  val res = lst.foldLeft(0L)((acc,v) => (acc + v) * 113 % 10000007);
  println(res);
}