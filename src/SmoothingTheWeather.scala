object SmoothingTheWeather extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  val lst = readLine().split(" ").map(_.toDouble).toList;
  val res = lst.head +: lst.sliding(3).toList.map(_.sum/3) :+ lst.last
  println(res.mkString(" "))
}