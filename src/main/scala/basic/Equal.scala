package basic

/**
 * Equal
 *
 * @author maasdianto
 *         create on 12/3/2014
 */
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isNotEqual(x)
}

trait Compare {
  def compare(x1: Line):Boolean = {
    this.isInstanceOf[Line] && this.asInstanceOf[Line].x == x1.x
  }
}

class Line(cx:Int, cy:Int) extends Equal with Compare {
  var x:Int = cx
  var y:Int = cy

  override def isEqual(obj: Any): Boolean = {
    obj.isInstanceOf[Line] && obj.asInstanceOf[Line].x == x
  }
}

object Test {
  def main(args: Array[String]) {
    var p1 = new Line(1,1)
    var p2 = new Line(2,2)
    var p3 = new Line(1,2)

    println(p1.isEqual(Nil))
    println(p1.isEqual(p2))
    println(p3.isEqual(p1))
    println(p3.compare(p1))

  }
}
