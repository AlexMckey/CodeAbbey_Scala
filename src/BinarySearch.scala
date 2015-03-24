object BinarySearch extends App {
  import scala.io.StdIn._;
  import Math._;
  val (max,min) = (100D,0D);
  val cnt = readInt();
  var lst = List[Array[Double]]();
  for (i <- 1 to cnt)
  {
    val v = readLine().split(" ").map(_.toDouble);
    lst = lst :+ v;
  }
  def ur(x: Double, a: Double, b: Double, c: Double, d: Double): Double = 
    a*x + b*sqrt(x*x*x) - c*exp(-x/50) - d;
  def binSearch(x: Double, arg: Array[Double], m: Double = max, n: Double = min): Double = {
    val (a,b,c,d) = (arg(0),arg(1),arg(2),arg(3));
    val r = ur(x,a,b,c,d);
    if (abs(r) <= 0.0000001) x
    else if (r >= 0) binSearch((n+x)/2,arg,x,n)
    else binSearch((m+x)/2,arg,m,x)
  }
  val res = lst.map(binSearch((max+min)/2,_))
  println(res.mkString(" "))
}