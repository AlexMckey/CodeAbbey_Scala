object TestWS {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(135); 
	def luhn(number: String) = {
    (number.reverse.map(_ - '0').grouped(2).map(a => a(0)+a(1)*2%10+a(1)/5)).sum % 10
  };System.out.println("""luhn: (number: String)Int""");$skip(146); 
  def fixEmpty(number: String): String = {
    Range(0,10).map(x => number.replace('?', (x+'0').toChar)).find(luhn(_) == 0).getOrElse(number)
  };System.out.println("""fixEmpty: (number: String)String""");$skip(141); 
  def fixSwap(number: String): String = {
    number.sliding(2).map(x => number.replaceFirst(x,x.reverse)).toList.find(luhn(_) == 0).get
  };System.out.println("""fixSwap: (number: String)String""");$skip(27); val res$0 = 
  luhn("9110595755078349");System.out.println("""res0: Int = """ + $show(res$0));$skip(27); val res$1 = 
  luhn("9115095755078394");System.out.println("""res1: Int = """ + $show(res$1));$skip(31); val res$2 = 
  fixEmpty("978445?871573389");System.out.println("""res2: String = """ + $show(res$2));$skip(29); 
  val i = "1463791635293606";System.out.println("""i  : String = """ + $show(i ));$skip(29); 
  val w = "1463791365293606";System.out.println("""w  : String = """ + $show(w ));$skip(38); 
  val q = fixSwap("1463791635293606");System.out.println("""q  : String = """ + $show(q ));$skip(10); val res$3 = 
  luhn(i);System.out.println("""res3: Int = """ + $show(res$3));$skip(10); val res$4 = 
  luhn(w);System.out.println("""res4: Int = """ + $show(res$4));$skip(10); val res$5 = 
  luhn(q);System.out.println("""res5: Int = """ + $show(res$5));$skip(115); val res$6 = 
  "1463791635293606".sliding(2).map(x => "1463791635293606".replaceFirst(x,x.reverse)).filter(luhn(_) == 0).toList;System.out.println("""res6: List[String] = """ + $show(res$6))}
}
