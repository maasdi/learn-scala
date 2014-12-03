package basic

import java.io.{IOException, FileNotFoundException, FileReader}

/**
 * CatchException
 *
 * @author maasdianto
 *         create on 12/3/2014
 */
object CatchException {

  def main(args: Array[String]) {
    try {
      val l = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => { println("File not found", ex) }
      case ex: IOException => {println("IOException")}
    } finally {
      println("Finally exit")
    }
  }
}
