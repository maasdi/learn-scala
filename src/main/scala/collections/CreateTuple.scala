package collections

/**
 * CreateTuple
 *
 * @author maasdianto
 *         create on 11/28/2014
 */
object CreateTuple {

  def main(args: Array[String]) {
    var t = (1, 2, "John")
    println(t._1)
    println(t._2)
    println(t._3)

    println()
    var position = Tuple2(100232, 1230033)
    position.productIterator.foreach(i => println(i))
  }

}
