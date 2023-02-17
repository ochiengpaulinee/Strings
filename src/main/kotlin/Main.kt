fun main() {
    val stmt = details(name = "Jane", age = "14")
    println(stmt)
    var txt = "headteacher"
    println("The length of the txt String:" + txt.length);
    var name = "Brenda"
    var name2 = "Vicky"
    if (name.equals(name2)) {
        println("Thats me!")
    } else {
        println("I don't know who that is")
        var campus="akirachix"
        println(charArrayOf(campus[0],campus[2],campus[3]))
    }

}
  fun details(name:String, age:String):String {
      val stmt = "Hi, my name is $name and I am $age years old"
      return (stmt)
  }
