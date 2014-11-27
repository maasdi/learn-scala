package basic

/**
 * CallByName
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object CallByName {

  def main(args: Array[String]) {
    show(time())
  }

  def time() = {
    println("Getting time in nanosecond")
    System.nanoTime()
  }

  def show(t : => Long) = {
    println("From inside show")
    println("Param : " + t)
  }

}
