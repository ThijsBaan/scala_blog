object QuickSort {
  def quickSort(numbers: Array[Int], low: Int, high: Int) {
    if (low < high) {
      val pi = partition(numbers, low, high)
      quickSort(numbers, low, pi - 1)
      quickSort(numbers, pi + 1, high)
    }
  }

  private def partition(numbers: Array[Int], low: Int, high: Int): Int = {
    val pivot = high
    var i = low
    for (
      j <- low to high
      if numbers(j) < numbers(pivot)
    ) {
      swap(numbers, i, j)
      i += 1
    }

    swap(numbers, i, pivot)
    i
  }

  private def swap(numbers: Array[Int], pos1: Int, pos2: Int) {
    val stash = numbers(pos1)
    numbers(pos1) = numbers(pos2)
    numbers(pos2) = stash
  }
}
