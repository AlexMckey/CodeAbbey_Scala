object TestWS {
	def luhn(number: String) = {
    (number.reverse.map(_ - '0').grouped(2).map(a => a(0)+a(1)*2%10+a(1)/5)).sum % 10
  }                                               //> luhn: (number: String)Int
  def fixEmpty(number: String): String = {
    Range(0,10).map(x => number.replace('?', (x+'0').toChar)).find(luhn(_) == 0).getOrElse(number)
  }                                               //> fixEmpty: (number: String)String
  def fixSwap(number: String): String = {
    number.sliding(2).map(x => number.replaceFirst(x,x.reverse)).toList.find(luhn(_) == 0).get
  }                                               //> fixSwap: (number: String)String
  luhn("9110595755078349")                        //> res0: Int = 0
  luhn("9115095755078394")                        //> res1: Int = 0
  fixEmpty("978445?871573389")                    //> res2: String = 9784456871573389
  val i = "1463791635293606"                      //> i  : String = 1463791635293606
  val w = "1463791365293606"                      //> w  : String = 1463791365293606
  val q = fixSwap("1463791635293606")             //> q  : String = 1463791632593606
  luhn(i)                                         //> res3: Int = 6
  luhn(w)                                         //> res4: Int = 0
  luhn(q)                                         //> res5: Int = 0
  "1463791635293606".sliding(2).map(x => "1463791635293606".replaceFirst(x,x.reverse)).filter(luhn(_) == 0).toList
                                                  //> res6: List[String] = List(1463791632593606, 1463791635296306)
}