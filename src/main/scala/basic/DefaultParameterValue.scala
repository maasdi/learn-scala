package basic

/**
 * DefaultParameterValue
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object DefaultParameterValue {

  def main(args: Array[String]) {
    println(multiply())
    println(multiply(10))
    println(multiply(1,20))
  }

  def multiply(x: Int = 2, y: Int = 10) : Int = {
    var value: Int = 0
    value = x * y
    value
  }

}
