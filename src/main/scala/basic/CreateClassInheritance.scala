package basic

/**
 * CreateClassInheritance
 *
 * @author maasdianto
 *         create on 12/3/2014
 */
class Point(cx: Int, cy: Int) {
  var x: Int = cx
  var y: Int = cy

  def move(mx: Int, my: Int) {
    x = x + mx
    y = y + my
    println("x location : " + x)
    println("y location : " + y)
  }

}

class Location(cx: Int, cy:Int, cz: Int) extends Point(cx: Int, cy: Int) {
  var z: Int = cz

  def move(mx: Int, my: Int, mz: Int) {
    super.move(mx, my)
    z = z + mz
    println("z location : " + z)
  }
}

object CreateClassInheritance {
  def main(args: Array[String]) {
    var loc = new Location(1,1,1)
    loc.move(0,0,2)
  }
}
