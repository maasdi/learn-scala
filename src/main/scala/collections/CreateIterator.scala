package collections

/**
 * CreateIterator
 *
 * @author maasdianto
 *         create on 11/28/2014
 */
object CreateIterator {

  def main(args: Array[String]) {
    var i = Iterator(1,10,2)

    while (i.hasNext) {
      println(i.next())
    }
  }
}
