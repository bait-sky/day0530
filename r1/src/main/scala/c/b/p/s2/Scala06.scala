package c.b.p.s2

object Scala06 {
  def main(args: Array[String]): Unit = {

//    for( a <- Array( (0,1), (1,1), (2,2), (3,4,5)   ) ){
//
//     val ss= a match {
//        case ( 0, a ) => 0 +" "+a
//        case ( 1,b ) => 1 +" "+b
//        case (a,b) =>  "" + a + " " + b
//        case _ => "00000"
//      }
//      println(ss)
//
//    }

      val user = User("zhangsan",18)

  val se =  user match {
      case User("lisi",18) => "yse"
      case _ => "no"
    }
  println(se)

  }
  class User(val name : String , val age : Int){


  }
object User{
  def apply(name: String, age: Int): User = new User(name, age)

  def unapply(arg: User): Option[(String, Int)] = {

    Some(arg.name , arg.age)

  }
}



}
