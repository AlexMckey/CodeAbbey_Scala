object QuickSort extends App {
  import scala.io.StdIn._;
  val cnt = readInt();
  var arr = readLine().split(" ").map(_.toInt);
  def part(a: Array[Int], l: Int, r: Int): Int = {
		var lt = l
		var rt = r
		var dir = "left"
		val pivot = a(l)
		while (lt < rt) {
			if (dir == "left")
				if (a(rt) > pivot) rt -= 1
				else {
					a(lt) = a(rt)
					lt += 1
					dir = "right"
				}
			else
				if (a(lt) < pivot) lt += 1
				else {
					a(rt) = a(lt)
					rt -= 1
					dir = "left"
				}
		}
		a(lt) = pivot
		lt
	}                                         //> part: (a: Array[Int], l: Int, r: Int)Int
	
	def quicksort(a: Array[Int], l: Int, r: Int) {
		val p_pos = part(a,l,r)
		print(s"$l-$r ")
		if (p_pos-l > 1) quicksort(a,l,p_pos-1)
		if (r-p_pos > 1) quicksort(a,p_pos+1,r)
	}
	quicksort(arr,0,cnt-1)
}