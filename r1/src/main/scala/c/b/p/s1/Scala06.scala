package c.b.p.s1

object Scala06 {
  def main(args: Array[String]): Unit = {
    //异常
    // 1,类似模式匹配
    // 2，使用case 设置多个异常
    // 3，按照顺序case匹配，一般会把范围小的放在前面
    // 4，Scala不存在编译和运行异常，没有throw关键字。

    try {
      val i = 0
      val j = 10/i
    }catch {

      case exception: ArithmeticException =>{
        exception.printStackTrace()
      }
      case exception: Exception =>{
        exception.printStackTrace()
      }

    }finally {

    }






  }
}
