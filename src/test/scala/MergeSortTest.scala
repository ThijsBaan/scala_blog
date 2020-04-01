import org.scalatest.FunSuite

class MergeSortTest extends FunSuite {
  test("Happy flow") {
    val unsorted = List(38, 27, 43, 3, 9, 82, 10)
    val expected = List(3, 9, 10, 27, 38, 43, 82)
    assert(MergeSort.mergeSort(unsorted).equals(expected))
  }

  test("Empty list") {
    assert(MergeSort.mergeSort(List()).isEmpty)
  }

  test("Already sorted list") {
    val unsorted = List(3, 9, 10, 27, 38, 43, 82)
    val expected = List(3, 9, 10, 27, 38, 43, 82)
    assert(MergeSort.mergeSort(unsorted).equals(expected))
  }

  test("List with same numbers") {
    val unsorted = List(3, 3, 3)
    val expected = List(3, 3, 3)
    assert(MergeSort.mergeSort(unsorted).equals(expected))
  }
}
