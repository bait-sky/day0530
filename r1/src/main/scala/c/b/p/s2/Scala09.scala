package c.b.p.s2

object Scala09 {
  def main(args: Array[String]): Unit = {

//    val list = List(1,2,3,"a",5,6)
//
//   val s =   list.collect{
//        case i : Int => i*2
//      }
//
//println(s)

//    val s= list.map{
//
//      case int: Int => int*2
//      case _ =>
//    }
//
//    println(s)
    val list = List(1,2,3,"a",5,6)
    val f : PartialFunction[ Any , Any ] = {
      case int: Int => int*2
      case s : String => s
    }

    println(list.collect(f))


  }
}
