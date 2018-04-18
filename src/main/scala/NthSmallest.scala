object NthSmallest extends App {

  def calculateSmallest(list: List[Int], n: Int): Int = {
match list {

      case f => list.nonEmpty
        val order = list.toSet.toList.sorted.reverse
        println(order)
        val nth = order(n)
        nth

      case b => list.isEmpty
        throw new IllegalArgumentException("list is empty")

      case _ =>
        throw new IllegalArgumentException("No such element in list")

  }
  println(calculateSmallest(List(0,1,1,2,3,4,5,6,7,8,9), 2))
}



