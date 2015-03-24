object FibonacciSequence extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  var lst = for (i <- 1 to cnt) yield BigInt(readLine())
  //def fibFrom(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibFrom(b,a + b)
  //val fibs1000 = fibFrom(BigInt(0),BigInt(1)).take(1000).toList
  def fib (cnt: Int, low: BigInt=0, high: BigInt=1, sofar: List[BigInt]=Nil): List[BigInt] = {
  	if (cnt == 0) (low :: sofar).reverse else fib (cnt - 1, high, low + high, low :: sofar) }
  val fibs1000 = fib(1000)
  val res = lst map fibs1000.indexOf
  println(res.mkString(" "))
}