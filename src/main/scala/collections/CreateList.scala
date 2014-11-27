package collections

/**
 * List
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object CreateList {

  def main(args: Array[String]) {
    // List of String
    val clients: List[String] = List("Formis", "One International", "Uberfusion")

    // Empty list
    val empty: List[Nothing] = List()

    // Two dimension list
    val table: List[List[Int]] = List(
      List(0, 1, 2, 4),
      List(0, 2, 3),
      List(0, 3, 4)
    )

    println("Head : " + clients.head)
    println("Tail : " + clients.tail)
    println()
    println("Head : " + table.head)
    println("Tail : " + table.tail)
  }

}
