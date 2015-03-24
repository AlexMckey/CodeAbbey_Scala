object BMI extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  var lst = List[(Int,Float)]();
  for (i <- 1 to cnt)
  {
    val v = readLine().split(" ");
    lst = lst :+ (v(0).toInt,v(1).toFloat);
  }
  def dmi(weight : Int, height: Float) = 
  {
    weight / (height * height) match {
      case x if x < 18.5 => "under"
      case x if x < 25.0 => "normal"
      case x if x < 30   => "over"
      case _             => "obese"
    }
  }
  val res = lst.map(x => dmi(x._1,x._2));
  println(res.mkString(" "));
}