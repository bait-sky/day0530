package c.b.p.s1

import c.b.p.s1.Scala03.User

object Scala03 {
  def main(args: Array[String]): Unit = {

    //匹配对象
      val user1 = new User("lisi" , 18)
      val user2 = User("zhangsan",25 )
    val result = user2 match {
      case User("zhangsan", 25) => "yes"
      case _ => "no"
    }
println(result)
  }

  class User(val name: String, val age: Int)
  object User{
    def apply(name: String, age: Int): User = new User(name, age)

    def unapply(user: User): Option[(String, Int)] = {
      if (user == null)
        None
      else
        Some(user.name, user.age)

    }

  }


}
