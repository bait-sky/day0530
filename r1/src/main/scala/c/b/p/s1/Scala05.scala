package c.b.p.s1

object Scala05 {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,5,"a")
    val list1: List[Any] = list.filter( _.isInstanceOf[Int] )
    val ints: List[Int] = list1.map( a => a.asInstanceOf[Int]*2 )

    val (x, y) = (1, 2)
    println(s"x=$x,y=$y")

    val Array(first, second, _*) = Array(1, 7, 2, 9)
    println(s"first=$first,second=$second")

    val Person(name, age) = Person("zhangsan", 16)
    println(s"name=$name,age=$age")

  }
  case class Person(name: String, age: Int)
}
