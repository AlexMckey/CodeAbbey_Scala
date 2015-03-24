object PrimeNumbersGeneration extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  val idx = readLine().split(" ").map(_.toInt);
  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile(j => j * j <= i).forall(i % _ > 0))
  val res = idx.map(i => ps(i-1))
  println(res.mkString(" "))
}