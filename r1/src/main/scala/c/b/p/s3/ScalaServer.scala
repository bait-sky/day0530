package c.b.p.s3

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.{ServerSocket, Socket}

import c.b.p.s4.Application

object ScalaServer extends Application{
  def main(args: Array[String]): Unit = {

    start("server"){
      val socket: ServerSocket = info.asInstanceOf[ServerSocket]
      while (true){
          new Thread( new Runnable {
            override def run(): Unit = {
              val clinet: Socket = socket.accept()
              val in = new ObjectInputStream(clinet.getInputStream)
              val o: AnyRef = in.readObject()
              val task: Task = o.asInstanceOf[Task]
              val i: Int = task.f()
              clinet.shutdownInput()
              //--------------------------------------------------
              val out = new ObjectOutputStream(clinet.getOutputStream)
                out.writeObject(i)
              out.flush()
              clinet.shutdownOutput()
            }
          }).start()



      }

    }




  }
}
