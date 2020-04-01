println("hello world")

val numbers = Array(1, 48, 7, 98, 5)
for (i <- 0 to 4) {
  println(numbers(i))
}

for (i <- 0 to 4
     if (numbers(i) < 42 || numbers(i) > 50) && numbers(i) != 1) {
  println(numbers(i)) // 1, 7, 5
}

List(1, 48, 7, 98, 5) match {
  case Nil => println("empty list")
  case (head :: tail) =>
    println(head)
    println(tail)
}

List() match {
  case Nil => println("empty list")
  case (head :: tail) =>
    println(head)
    println(tail)
}

def myName(name: String): String = {
  "Mijn naam is " + name
}
println(myName("Thijs"))

