object ModuloAndTimeDifference extends App with ReadArr {
  def calcDiff(arr: Array[Int]): List[Int] = {
    val d1 = arr(0)*60*60*24 + arr(1)*60*60 + arr(2)*60 + arr(3)
    val d2 = arr(4)*60*60*24 + arr(5)*60*60 + arr(6)*60 + arr(7)
    var dd = d2 - d1
    List(dd / 60 / 60 / 24, dd / 60 / 60 % 24, dd / 60 % 60, dd % 60)
  }
  val res = lst.map(calcDiff).map(_.mkString(" "))
  println(res.mkString("(",") (",")"))
}