object SortWithIndexes extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  val lst = readLine().split(" ").map(_.toInt).toList;
  val res = lst.zipWithIndex.sortBy(_._1).unzip._2.map(_+1)
  println(res.mkString(" "))
}