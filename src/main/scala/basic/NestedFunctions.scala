package basic

/**
 * NestedFunctions
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object NestedFunctions {

  def main(args: Array[String]) {
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
    println(factorial(4))
  }

  def factorial(x: Int): Int = {
    def fact(i: Int, acc: Int): Int = {
      if (i <= 1) {
        acc
      } else {
        fact(i - 1, i * acc)
      }
    }
    fact(x, 1)
  }

}
