object SumOfDigits extends App with ReadArr {
    def sod(num: Int, acc: Int = 0): Int = 
      num match {
        case x if x < 10 => acc + x
        case _ => sod(num/10, acc+num%10)
      }
    val res = lst.map(q => sod(q(0)*q(1)+q(2)));
    println(res.mkString(" "));
}