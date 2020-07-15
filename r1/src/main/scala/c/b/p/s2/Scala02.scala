package c.b.p.s2

object Scala02 {
  def main(args: Array[String]): Unit = {

    var a: Int = 10
    var b: Int = 20
    var operator: Char = '-'

    val result: Any = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }

    println(result)

    def test(x : Any) = {
      val value: Any = x match {
        case 5 => "int"
        case "S" => "String"
        case false => 0
        case _ => null

      }
      value

    }

  println(test(false))

    def f(x : Any) = x match {

      case _: Int => "int"
      case _: String => "string"
      case _: Array[Int] =>"Array"
      case _:List[_] => "list"
      case _ => 0
    }

    println(  f(Array(1,2,3))  )



  }
}
