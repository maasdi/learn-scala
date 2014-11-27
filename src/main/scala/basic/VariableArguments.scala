package basic

/**
 * VariableArguments
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object VariableArguments {

  def main(args: Array[String]) {
    favorite("My favorite colors", "Red", "Blue", "Orange")
  }

  def favorite(label: String, colors: String*): Unit = {
    println(label)
    for (color <- colors) {
      println(color)
    }
  }
}
