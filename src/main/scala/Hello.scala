/**
 * Hello
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object Hello {
  var text: String = "text"
  def main (args: Array[String]) {
    println("Scala Hello " + text)
    text = "update"
    println("Scala Hello " + text)
  }
}
