object MinMaxInArr extends App {
  import Math._;
  val lst = scala.io.StdIn.readLine().split(" ").map(_.toInt);
  val res = lst.foldLeft((Int.MaxValue,Int.MinValue))({case ((mi,ma),v) => (min(mi, v), max(ma, v))});
  println(s"${res._2} ${res._1}");
}