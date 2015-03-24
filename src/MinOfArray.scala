object MinOfTwo extends App with ReadArr {
  val res = lst.map(_.foldLeft(Int.MaxValue)(Math.min));
  Console.println(res.mkString(" "));
}