package c.b.p.s2

object Scala12 {
  def main(args: Array[String]): Unit = {

//    def uer(name : String )( implicit passwd : String ) = {
//      println(
//        s"""
//          |name = $name
//          |passwd = $passwd
//          |""".stripMargin)
//    }
//
//    implicit val passwd : String = "000000"
//
//    uer( "lisi")("585555")

//    implicit def t(user: User) = {
//      new P
//    }
      import c.b.p.s1.Scala08._

      val user = new User
      user.f()
      user.p()


  }



  class  User{

    def f() = {
      println("ffff")
    }

  }
}
