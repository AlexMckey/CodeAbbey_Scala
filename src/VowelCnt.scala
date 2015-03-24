object VowelCnt extends App with ReadStr {
  val VowelChars = "aouiey";  
  val res = lst.map(_.foldLeft(0)((acc,c) => if (VowelChars.contains(c)) acc+1 else acc));
  println(res.mkString(" "));
}