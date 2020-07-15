package c.b.p.s1

object Scala07 {
  def main(args: Array[String]): Unit = {

    //java基本数据存在精度的转换和截取，Scala中没有基本数据概念，
    //编译时会自动调用Java的逻辑代码来转换，称为隐式转换。
    //两个类型不存在关系，编译器编译时尝试找到对应的转换方法，进行转换。也称为二次编译
    // 有时可以给编译器指定一个规则，让本来错误的逻辑，编译器可以查找到这个规则，
    // 自动使用规则进行操作。需要给规则加关键字implicit

    implicit  def test( d: Double) = {
      d.toInt
    }
    val b : Byte = 2
    val a : Double = b
    val i : Int = a

    println(i)

    //功能扩展


  }
}
