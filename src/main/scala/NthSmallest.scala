object NthSmallest extends App {


  def calculateSmallest(list: List[Int], n: Int): Int = {
    if (list.nonEmpty) {

      list.indexOf(1)

    } else {

      0


      /*  val divided = list.map(x  => x / n) //= new val NList.head
    println(divided)
    divided.head*/
    }
  }
    println(calculateSmallest(List(0,1,2), 1))

  }

