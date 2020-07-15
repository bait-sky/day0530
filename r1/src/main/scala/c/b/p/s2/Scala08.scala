package c.b.p.s2



object Scala08 {
  def main(args: Array[String]): Unit = {

//    val re =  List( 1,2 ,3,4,5) match { case List( a, b , c) => List( a , b,c )  }
//
//    println( re )
//      val ( a ,b ) = ( 1,2)
//     println(a + " " + b)

//    val   re = User("lisi" , 18 ) match { case User( name ,age  ) => User( name ,age )}
//        val User( name , age  ) =  User("lisi" , 18 )
//    println( name , age  )
//

//    val map =  Map( "a" ->( "aa" , 1) )
//
// map.foreach{ case ( k1 ,(k2,v)) => { println(v) } }

//   val a =  Map(  ("a",1),("b",2),("c",3),("d",4)       )
//
//  val map1 =  a.map{  case ( a, b ) => ( a, b*2)  }
//    println(map1)

//    val list = List( 1,2,3,4,5   )
//    val s = list.map( i =>
//      i match {
//        case x => x*2
//      }
//
//    )
//
//    println(s)

  val list = List( ("a",1),("b",2),("c",3),("d",4)   )
    val s =list.map(

      x => x match {
        case ( a ,b) => ( a,b*2 )
      }

    )
    println(s)

    val list1 = List( ("a",1),("b",2),("c",3),("d",4)   )
    val d = list1.map{
      case ( k ,v) => ( k,v*2 )
    }

    println(d)


    val User( name ,age ) = User( "lisi" , 18)
    println(name ,age)

  }
  case class User(name:String, age :Int)

}
