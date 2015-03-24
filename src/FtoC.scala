object FtoC extends App {
  def FtoC(v: Int): Int = Math.round((v.toFloat - 32)/9*5);
  val arr = scala.io.StdIn.readLine().split(" ").tail.map(_.toInt);
  println(arr.map(FtoC).mkString(" "))
}