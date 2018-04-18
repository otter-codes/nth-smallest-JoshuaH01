

object NthSmallest extends App {

  def calculateSmallest(list: List[Int], n: Int): Int = {
   list.isEmpty match {

      case false =>
        val order = list.toSet.toList.sorted.reverse
        println(order)
        val nth = order(n-1)
        nth

      case true =>
        throw new IllegalArgumentException("list is empty")

      case _ =>
        throw new IndexOutOfBoundsException("No such element in list")

    }
  }
  println(calculateSmallest(List(1,2,3,4,5),10))
}



