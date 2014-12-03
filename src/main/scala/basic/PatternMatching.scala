package basic

/**
 * PatternMatching
 *
 * @author maasdianto
 *         create on 12/3/2014
 */
object PatternMatching {

  def main(args: Array[String]) {
    println(matching(1))
    println(matching("a"))

    var arnold = new Person(name = "Arnold", age = 20)
    var rasty = new Person(name = "Rasty A.", age = 28)
    var alice = new Person(name = "ALice Chow", age = 32)

    for (x <- List(arnold, rasty, alice))
      x match {
        case Person("Arnold", 20) => println("Hi Arnold")
        case Person(name, age) => println("Name : " + name + ", age : " + age)
      }
  }

  def matching(x: Any) = x match {
    case 1 => "first"
    case "a" => "character a"
    case y: Int => "int"
    case _ => "any"
  }

  case class Person(name: String, age: Int)

}
