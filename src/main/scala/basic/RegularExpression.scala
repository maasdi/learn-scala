package basic

import scala.util.matching.Regex

/**
 * RegularExpression
 *
 * @author maasdianto
 *         create on 12/3/2014
 */
object RegularExpression {

  def main(args: Array[String]) {
    val pattern = new Regex("(S|s)cala")
    val text = "Hi scala, are you scalable ?"
    println(pattern.findFirstIn(text))
    println((pattern findAllIn text).mkString(","))
    println(pattern replaceFirstIn(text,"Java"))
  }

}
