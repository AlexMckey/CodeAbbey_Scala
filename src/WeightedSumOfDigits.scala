object WeightedSumOfDigits extends App {
  import scala.io.StdIn._;
  def wsd(s: String): Int = s.foldLeft((0,1))((acc,c) => (acc._1 + (c - '0')*acc._2, acc._2+1))._1;
  val cnt = readInt();
  val res = readLine().split(" ").map(wsd);
  println(res.mkString(" "));
}