package basic

/**
 * Closure
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object Closure {

  val factor = 5
  val multiplier = (i:Int) => i * factor

  def main(args: Array[String]) {

    println(multiplier(3))
    println(multiplier(2))

  }

}
