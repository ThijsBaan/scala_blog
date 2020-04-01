import org.scalatest.FunSuite

class QuickSortTest extends FunSuite {
  test("Happy flow") {
    val ut = Array(38, 27, 43, 3, 9, 82, 10)
    val expected = Array(3, 9, 10, 27, 38, 43, 82)

    QuickSort.quickSort(ut, 0, ut.length - 1)

    assert(ut.sameElements(expected))
  }

  test("Empty array") {
    val ut = Array[Int]()
    QuickSort.quickSort(ut, 0, ut.length - 1)
    assert(ut.isEmpty)
  }

  test("Already sorted array") {
    val ut = Array(38, 27, 43, 3, 9, 82, 10)
    val expected = Array(3, 9, 10, 27, 38, 43, 82)

    QuickSort.quickSort(ut, 0, ut.length - 1)

    assert(ut.sameElements(expected))
  }

  test("Array with same numbers") {
    val ut = Array(3, 3, 3)
    val expected = Array(3, 3, 3)

    QuickSort.quickSort(ut, 0, ut.length - 1)
    assert(ut.sameElements(expected))

  }
}
