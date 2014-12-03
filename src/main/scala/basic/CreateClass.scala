package basic

/**
 * CreateClass
 *
 * @author maasdianto
 *         create on 12/3/2014
 */
class Poin(cx: Int, cy: Int) {

  var x: Int = cx
  var y: Int = cy

  def move(mx: Int, my: Int) {
    x = x + mx
    y = y + my
    println("x location : " + x)
    println("y location : " + y)
  }

}

object CreateClass {
  def main(args: Array[String]) {
    var point = new Poin(0, 0)
    point.move(1,0)
    point.move(0,10)
  }
}
