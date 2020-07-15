package c.b.p.s1

import c.b.p.s2.Scala12.User

object Scala08 {

  implicit class P( user: User ){
    def p(): Unit ={
      println("pppp")
    }
  }

  def t() = {

  }

}
