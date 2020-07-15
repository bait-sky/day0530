package c.b.p.s2

object Scala03 {
  def main(args: Array[String]): Unit = {

    val list = List( 1 , 2 , List( 3 , 4 ) )

    val list3: List[Any] = list.flatMap(a => {
      a match {
        case d: List[_] => d
        case y => List(y)

      }

    })
    println(list3)








    val list1: List[Any] = list.flatMap(x => {
      if (x.isInstanceOf[List[_]]) {
        x.asInstanceOf[List[Int]]

      } else {
        List(x)
      }

    })
    println(list1)


  }
}
//


//      if (x.isInstanceOf[Int]) {
//        List(x)
//      } else {
//        val list2: List[Int] = x.asInstanceOf[List[Int]]
//        list2
//      }
//
//    })
//    println(list1)
//


