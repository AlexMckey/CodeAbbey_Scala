object AverageOfAnArray extends App with ReadArr {
  val res = lst.map(a => Math.round(a.take(a.length).sum/(a.length.toFloat-1)))
  println(res.mkString(" "))
}