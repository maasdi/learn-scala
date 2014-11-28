package collections

/**
 * CreateSet
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/28/2014
 */
object CreateSet {

  def main(args: Array[String]) {

    var s: Set[Int] = Set(1, 3, 5, 7)
    var s2: Set[Int] = Set(1, 3, 10, 6)
    var cols = Set("a", "b", "c")

    println("Head : " + s.head)
    println("Tail : " + s.tail)
    println()
    println("Head : " + cols.head)
    println("Tail : " + cols.tail)
    println()
    println("Join : " + (s ++ s2))
    println()
    println("Intersect : " + (s & s2))

  }

}
