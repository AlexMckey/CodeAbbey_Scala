object Rounding extends App with ReadArr {
  val res = lst.map(arr => Math.round(arr(0).toFloat / arr(1)));
  println(res.mkString(" "));
}