object MedOf3 extends App with ReadArr {
  def med(a: Int, b: Int, c: Int): Int = 
    if (a > b) 
      if (b > c) b else
        if (a > c) c else a
    else
      if (b < c) b else
        if (a > c) a else c;
  val res = lst.map(x => med(x(0),x(1),x(2)));
  println(res.mkString(" "));
}