object InsertSort {
  def insertSort(numbers: List[Int]): List[Int] = {
    if (numbers.isEmpty) List()
    else insert(numbers.head, insertSort(numbers.tail))
  }

  private def insert(head: Int, body: List[Int]): List[Int] =
    body match {
      case Nil => List(head)
      case bodyHead :: bodyTail =>
        if (head <= bodyHead) head :: body
        else bodyHead :: insert(head, bodyTail)
    }
}
