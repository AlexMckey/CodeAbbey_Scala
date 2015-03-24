object CollatzSequence extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  var lst = readLine().split(" ").map(_.toInt);
  def cs(x: Int): Int = if (x % 2 == 0) x / 2 else 3 * x + 1;
  def CScnt(x: Int, acc: Int = 0): Int = if (x == 1) acc else CScnt(cs(x),acc+1);
  val res = lst.toList.map(CScnt(_));
  println(res.mkString(" "));
}