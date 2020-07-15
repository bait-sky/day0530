package c.b.p.s1

object Scala04 {
  def main(args: Array[String]): Unit = {

      // 1,样例类编译时，自动生成伴生对象和apply、unplay方法
      // 2，样例类默认生成了val，不可修改属性，除非显示声名var
      // 3,自动生成序列化。
      // 4，样例类还有其他方法，一般开发都使用它





  }
  //-----------------------------------------------------------
  //样例类
  case class Emp(val name: String, val age: Int)
}
