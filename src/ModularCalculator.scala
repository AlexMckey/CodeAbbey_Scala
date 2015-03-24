object ModularCalculator extends App {
  import scala.io.StdIn._;
  var b = true;
  var res = readLong();
  def opn(o: String): (Long,Long)=>Long = o match {
    case "+" => _+_
    case "*" => _*_
    case _   => _%_
  }
  do {
    val a = readLine().split(" ");
    val (op,v) = (a(0),a(1).toLong);
    b = op != "%";
    res = opn(op)(res,v)
    //println(s"op: $op val: $v res: $res")
  } while (b);
  println(res);
}