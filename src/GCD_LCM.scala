object GCD_LCM extends App with ReadArr {
  def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b,a%b)
  val res = lst.map(a => (gcd(a(0),a(1)) + " " + a(0)*a(1)/gcd(a(0),a(1))))
  println(res.mkString("(",") (",")"))
}