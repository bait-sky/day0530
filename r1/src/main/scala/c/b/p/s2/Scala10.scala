package c.b.p.s2

object Scala10 {
  def main(args: Array[String]): Unit = {

//    implicit def f (int: Int) ={
//      int.toShort
//    }

//    def g( i:Int) = (j : Int) =>i*j

//
//
//    val b : Byte = 10
//    val i : Int = b
//    val d : Double = i
//    val s : Short = i

    implicit def f(user: User) = {
      new P
    }
//    implicit def d(user: User) = {
//      new P
//    }


    val user = new User
    user.t()
    user.u()



  }

  class P{
    def u() ={
      println("uuuu")
    }
  }

  class User{
    def t ()  = {
      println("sss")
    }

  }
}
