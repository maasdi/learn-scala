package collections

object CreateMap {
  def main(args: Array[String]) {
    var map: Map[String, Int] = Map()
    map += ("london" -> 1)
    map += ("indonesia" -> 2)
    map += ("japan" -> 3)

    println(map)

    var apps = Map(1 -> "e-Insurance", 2 -> "RCM")
    println()
    println(apps)
    println("Keys : " + apps.keys)
    println("Values : " + apps.values)

    // print value
    map.keys.foreach(i => println(i + " : " + map(i)))

    map = map + ("china" -> 2)
    println(map)
  }
}