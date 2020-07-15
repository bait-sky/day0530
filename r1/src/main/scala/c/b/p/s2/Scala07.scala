package c.b.p.s2

object Scala07 {
  def main(args: Array[String]): Unit = {

    val user = User("lisi",19)
    val s = user match {
      case User("lisi",19) => "yes"
      case _ => "no"
    }
    println(s)





  }
  case class User( name : String , age : Int ){

  }


}
