import org.scalatest._

class NthSmallestSpec extends WordSpec with MustMatchers {

  "NthSmallest" when {
    "calculateSmallest is called" should {
      "return a number from the list" in {
        NthSmallest.calculateSmallest(Nil, 0) mustEqual 0
      }
    }
  }


  "calculateSmallest is called" should {
    "return a specified number from the list" in {
      NthSmallest.calculateSmallest(List(0,1,2), 1) mustEqual 1
      }
    }
  }

