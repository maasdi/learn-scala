package collections

/**
 * CreateOptions
 *
 * @author maasdianto
 *         create on 11/28/2014
 */
object CreateOptions {

  def main(args: Array[String]) {
    var map = Map("france" -> "Paris", "japan" -> "Tokyo", "indonesia" -> "Jakarta")
    println(show(map.get("indonesia")))
    println(show(map.get("us")))

    var a: Option[String] = Some("Apple")
    var b: Option[String] = None
    println(a.getOrElse("Empty"))
    println(b.getOrElse("Empty"))

  }

  def show(x: Option[String]) = x match {
    case Some(x) => x
    case None => "?"
  }

}
