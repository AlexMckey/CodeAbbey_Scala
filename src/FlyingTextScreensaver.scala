object FlyingTextScreensaver extends App {
  val s = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  val (w,h,l) = (s(0),s(1),s(2))
  def fly(cx: Int = 0, cy: Int = 0, dx: Int = 1, dy: Int = 1, i: Int = 101, acc: List[Int] = List()): List[Int] = {
		val ddx = if (cx == 0) 1 else if (cx == w - l) -1 else dx
		val ddy = if (cy == 0) 1 else if (cy == h-1) -1 else dy
		if (i == 0) acc
		else fly(cx+ddx,cy+ddy,ddx,ddy,i-1,acc:+cx:+cy)
	}
  println(fly().mkString(" "))
}