package basic

/**
 * MultiArrays
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object MultiArrays {

  def main(args: Array[String]) {
    val table = Array.ofDim[Int](3,3)

    // set value
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        table(i)(j) = j
      }
    }

    // print value
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(table(i)(j) + " ")
      }
      println()
    }
  }

}
