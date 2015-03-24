object JosephusProblem extends App {
  val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  val (m,n) = (arr(0),arr(1));
  def loop(lst: List[Int], idx: Int = 1): Int =
    if (lst.length <= 1) lst.head
    else {
      loop(lst.zip(Range(idx,idx+lst.length)).filterNot(x => x._2 % n == 0).unzip._1,idx+lst.length)
    }
  println(loop(Range(1,m+1).toList))
  //
  //def js(n: Int, k: Int): Int =
	//	if (n == 1) 0
	//	else (js(n-1,k) + k) % n          //> js: (n: Int, k: Int)Int
	//println(js(m,n)+1)
}