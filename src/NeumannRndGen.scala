object NeumannRndGen extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  val arr = readLine().split(" ").map(_.toInt);
  def nrgCnt(num: Int): Int = {
    def nrgLoop(lst: List[Int] = List(num)): List[Int] = {
      val n = lst.head * lst.head / 100 % 10000
      if (lst.contains(n)) lst 
      else nrgLoop(n::lst)
    }
    nrgLoop().length;
  }
  val res = arr.map(nrgCnt(_));
  println(res.mkString(" "))
}