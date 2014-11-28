package collections

/**
 * Summary
 *
 * @author maasdianto
 *         create on 11/28/2014
 */
object Summary {

  def main(args: Array[String]) {
    // list
    var list = List(1, 2, 3, 3)

    // set
    var set = Set(1,2,3)

    // map
    var map = Map(1 -> "One", 2 -> "Two", 3 -> "Three")

    // tuple
    var tuple = (1, "Other")

    // option
    var option = Some("Jrenn!!")

    // iterator
    var it = Iterator(1, 10, 5)
    while (it.hasNext) { println(it.next())}
  }

}
