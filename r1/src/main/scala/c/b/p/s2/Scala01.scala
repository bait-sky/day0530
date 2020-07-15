package c.b.p.s2

object Scala01 {
  def main(args: Array[String]): Unit = {

  val i : Int = 152
    val result: Int = i match {

      case 5 => 5
      case 10 => 10
      case 15 => 15
      case _ => 0
    }
    println(result)

val list = List (1,2,3)


    def f(x : Any) = {

//      val value: Any = x match {
//
//        case _: Int => 5
//        case _: List[String] => "list"
//        case _:Array[Int] => "array"
//        case _:User => "user"
//        case _ => 0
//      }
//      value
      if( x.isInstanceOf[Int]){
        "int"
      }else if(x.isInstanceOf[Array[Int]]){
        "array"
      }else if(x.isInstanceOf[List[String]]){
        "list"
      }else if(x.isInstanceOf[User]){
        "user"
      }else{
        "0"
      }





  }

    val array = Array(1,2,3)
    val user1 = new User
    println( f(user1))


  }

  class User{

  }

}
