package c.b.p.s4

import java.net.{ServerSocket, Socket}

class Application {

  var info : Any = null;

  def start (string: String="JDBC"  )( f : => Unit ) = {

    //开始
    if( string == "server"){
      info = new ServerSocket(9999)
    }else if(string =="socket") {
      info = new Socket("localhost",9999)
    }
      try {
        f

    }catch {
      case exception: Exception => println("错误")
    }

    if(string == "socket"){
      val socket: Socket = info.asInstanceOf[Socket]
      socket.close()


    }else if(string == "server"){
      val server: ServerSocket = info.asInstanceOf[ServerSocket]
      server.close()
    }






    //结束

  }

}
