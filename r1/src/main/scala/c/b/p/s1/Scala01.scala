package c.b.p.s1

object Scala01 {
  def main(args: Array[String]): Unit = {

//    var a: Int = 10
//    var b: Int = 20
//    var operator: Char = '+'
//    var result = operator match {
//      case '+' => a + b
//      case '-' => a - b
//      case '*' => a * b
//      case '/' => a / b
//      case _ => "illegal"
//    }
//    println(result)

    // 1,如果不存在default，并且没有匹配上其他case，则会报错
    // 2，default不能放在第一行，否则，只执行default。




//    def f1 () = {
//      def f2 ( i : Int ) = {
//        i*2
//      }
//      f2 _
//    }
//
//    println( f1()(6) )

//    def  f1( i : Int )  = {
//      def f2 ( k : Int ) : Int = {
//        i * k
//      }
//      f2 _
//    }
//
//    println( f1(2)(6))

//    def t1(i: Int)( implicit j: Int = 0) = {
//      i + j
//    }
//
//    println( t1( 5 )(5) )


//    def f( x : => String ) = {
//            x
//    }
//
//    val str: String = f {
//
//      if (5 > 2) {
//        "大"
//      } else {
//        "小"
//      }
//    }
//    println(str)

     def  f1() = {
      println("xxxxxx")

    }

       lazy val a = f1()
      println("-----------")
      println(a)

  }
}
