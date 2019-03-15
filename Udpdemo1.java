package udp.src.org;

import java.io.IOException;
import java.net.*;

public class Udpdemo1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket();
        String s="I LOVE YOU";
        //把数据进行封装，封装到数据包中
        // InetAddress.getByName("localhost"),8000要发送的主机名和端口号
        DatagramPacket packet=new DatagramPacket(s.getBytes(),s.length(), InetAddress.getByName("localhost"),8000);
        socket.send(packet);//发送


        byte []buff=new byte[100];
        DatagramPacket packet1=new DatagramPacket(buff,100);
        socket.receive(packet1);//接收
        System.out.println(new String(packet1.getData()));
        socket.close();
    }
}
