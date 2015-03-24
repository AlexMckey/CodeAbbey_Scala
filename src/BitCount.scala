object BitCount extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  val arr = readLine().split(" ").map(_.toInt);
  val res = arr.map(_.toBinaryString.count(_ == '1'))
  println(res.mkString(" "))
}