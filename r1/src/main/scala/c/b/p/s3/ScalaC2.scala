package c.b.p.s3

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.Socket

import c.b.p.s4.Application

object ScalaC2 extends Application{
  def main(args: Array[String]): Unit = {


    start("socket"){
        val task = new Task
            task.i = 3
          task.t = ( i: Int) => i*2
      //out================================
      val client: Socket = info.asInstanceOf[Socket]
      val out = new ObjectOutputStream(client.getOutputStream)
      out.writeObject(task)
      out.flush()
      client.shutdownOutput()
      //in==================================
      val in = new ObjectInputStream(client.getInputStream)
      val unit: AnyRef = in.readObject()
      val i: Int = unit.asInstanceOf[Int]
      println(i)
      client.shutdownInput()
    }




  }
}
