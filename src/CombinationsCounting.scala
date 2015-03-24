object CombinationsCounting extends App with ReadArr {
  def fac(x: Int, acc: BigInt = 1): BigInt = 
    if (x == 0 || x == 1) acc
    else fac(x-1,acc*x)
  def c(n: Int, k: Int): BigInt = fac(n)/(fac(k)*fac(n-k))
  //def c2(n: Int, k: Int): Long =
  //	if (k == 0) 1
  //	else if (k <= 1) n
  //	else c2(n,k-1)*(n-k+1)/k
  val res = lst.map(arr => c(arr(0),arr(1)))
  println(res.mkString(" "))
}