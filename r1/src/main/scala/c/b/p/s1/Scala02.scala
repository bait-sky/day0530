package c.b.p.s1

object Scala02 {
  def main(args: Array[String]): Unit = {

    //匹配常量
    def describe(x: Any) =  {

    val result = x match{
      case 5 => "Int five"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
    }

      println(result)
  }

  describe( 5 )

    //---------------------------------------------------------
    // 匹配类型
    // 1，类型匹配不考虑泛型，注意，数组的那个int不是泛型，而是int数据，所以数组必须一样
    //    才可以匹配到。其他集合不需要泛型一样。
    // 2,底层是if判断类型，而不是泛型。
    def describe1(x: Any) = x match {
      case i: Int => "Int"
      case s: String => "String hello"
      case m: List[_] => "List"
      case c: Array[Int] => "Array[Int]"
      case someThing  => "something else " + someThing //就是case_ ,取个名字。
    }

    println( describe1( Array("4") ))

  //----------------------------------------------------------------------
    // 匹配数组
    for (arr <- Array(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1),
      Array("hello", 90))) { // 对一个数组集合进行遍历

      val result = arr match {
        case Array(0) => "0" //匹配Array(0) 这个数组
        case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
        case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
        case _ => "something else"
      }
      println("result = " + result)
    }

//--------------------------------------------------------------
val list: List[Int] = List(1)

    list match {
      case first :: second :: rest => println(first + "-" + second + "-" + rest)
      case a => println("something else")
    }
//-----------------------------------------------------------
    for (tuple <- Array((0, 1), (1, 0), (1, 1), (1, 0, 2))) {
      val result = tuple match {
        case (0, _) => "0 ..." //是第一个元素是0的元组
        case (y, 0) => "" + y + "0" // 匹配后一个元素是0的对偶元组
        case (a, b) => "" + a + " " + b
        case _ => "something else" //默认
      }
      println(result)
    }

//------------------------------------------------------------------





  }
}
