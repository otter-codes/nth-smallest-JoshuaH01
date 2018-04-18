import org.scalatest._

class NthSmallestSpec extends WordSpec with MustMatchers {

  "NthSmallest" when {

    "calculateSmallest is called" should {
      "return a number from the list" in {
        NthSmallest.calculateSmallest(List(0, 1, 2), 1) mustEqual 1
      }
    }

    "calculateSmallest is called" should {
      "return a specified number from the list" in {
        NthSmallest.calculateSmallest(List(1,2,3,4,5,6,7,8,9), 3) mustEqual 6
      }
    }

        "calculateSmallest is called" should {
          "throw an error when element is not in the list" in {
            val caught = intercept[IllegalArgumentException] {
              NthSmallest.calculateSmallest(List(1,2,3,4,5,6,7,8,9), 3)
            }
            assert(caught.getMessage == "No such element in list")
          }
      }
    }
  }

