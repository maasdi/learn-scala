package basic

import java.util.Date

/**
 * PartialFunctions
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object PartialFunctions {

  def main(args: Array[String]) {
    val date = new Date()

    val logPartial = log(date, _: String)
    println(logPartial("Message 1"))
    println(logPartial("Message 2"))
    Thread.sleep(1000)
    println(logPartial("Message 3"))
  }

  def log(date: Date, message: String) = {
    date + " --- " + message
  }

}
