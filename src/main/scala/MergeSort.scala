object MergeSort {
  def mergeSort(numbers: List[Int]): List[Int] = {
    if (numbers.length <= 1) numbers
    else {
      val (left, right) = numbers.splitAt(numbers.length / 2)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  private def merge(left: List[Int], right: List[Int]): List[Int] =
    (left, right) match {
      case (_, Nil) => left
      case (Nil, _) => right
      case (leftHead :: leftTail, rightHead :: rightTail) =>
        if (leftHead < rightHead) leftHead :: merge(leftTail, right)
        else rightHead :: merge(left, rightTail)
    }
}
