package basic

/**
 * Functions
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
class Functions {

  def calculate(x: Int, y: Int): Int = {
    var num : Int = 0
    num = x * y
    return num
  }

}

object Runner {
  def main(args: Array[String]) {
    val obj = new Functions()
    println("Result " + obj.calculate(10, 3))
  }
}
