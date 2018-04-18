

object NthSmallest extends App {

  def calculateSmallest(list: List[Int], n: Int): Int = {
   list.isEmpty match {

      case false => if (list.length >= n) {
        val order = list.toSet.toList.sorted.reverse
        println(order)
        val nth = order(n-1)
        nth} else {
        throw new IndexOutOfBoundsException("Not that many items in the list")}

      case true =>
        throw new IllegalArgumentException("list is empty")
    }
  }
  println(calculateSmallest(List(1,2,3,4,5),10))
}



