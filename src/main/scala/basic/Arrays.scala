package basic

import java.util

/**
 * Arrays
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
object Arrays {

  def main(args: Array[String]) {
    var cars: Array[String] = new Array[String](3)
    cars(0) = "Mazda"
    cars(1) = "Toyota"
    cars(2) = "Honda"

    for (car <- cars) {
      println(car)
    }

    var colors = Array("Red", "Blue", "Black")
    for (color <- colors) {
      println(color)
    }

    var scores = Array(8, 10, 2)
    // get total
    var total = 0
    for (i <- 0 to (scores.length - 1)) {
      total += scores(i)
    }
    println("Total : " + total)

    // get highest
    var max = scores(0)
    for (i <- 1 to(scores.length - 1)){
      if (scores(i) > max) max = scores(i)
    }
    println("Highest : " + max)
  }


}
