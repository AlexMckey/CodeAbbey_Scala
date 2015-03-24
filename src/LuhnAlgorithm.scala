object LuhnAlgorithm extends App with ReadStr {
  def luhn(number: String) = {
    (number.reverse.map(_ - '0').grouped(2).map(a => a(0)+a(1)*2%10+a(1)/5)).sum % 10
  }
  def fixEmpty(number: String): String = {
    Range(0,10).map(x => number.replace('?', (x+'0').toChar)).find(luhn(_) == 0).get
  }
  def fixSwap(number: String): String = {
    number.sliding(2).map(x => number.replaceFirst(x,x.reverse)).find(luhn(_) == 0).get
  }
  val res = lst.map(n => if (n.contains("?")) fixEmpty(n) else fixSwap(n))
  println(res.mkString(" "))
}