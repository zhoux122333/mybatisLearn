package socket

import java.io.DataInputStream
import java.net.ServerSocket
import java.net.Socket
import kotlin.concurrent.thread

fun startService(){
    val serverSocket = ServerSocket(6666)
    println("--开启服务器，监听端口 --")

    //监听端口，等待客户端连接
    while (true){
        println("--等待客户端连接--")
        val socket: Socket = serverSocket.accept()
        println("得到客户端连接：$socket")
        startReader(socket)
    }
}
fun startReader(socket: Socket){
    thread {
        var reader: DataInputStream
        run {
            reader = DataInputStream(socket.getInputStream())
            while (true){
                println("等待客户端输入")
                //读取数据
                val msg = reader.readUTF()
                println("获取到客户端的信息：$msg")
            }
        }
    }
}

fun main(args: Array<String>) {
    startService()
}