package udp.src.org;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UpdDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(8000);
        byte []buff=new byte[100];
        DatagramPacket packet=new DatagramPacket(buff,100);
        socket.receive(packet);//接收传来的数据包
        System.out.println(new String(packet.getData()));

        String s="Me too";
        //packet含有传来的对方的地址和端口
        DatagramPacket packet1=new DatagramPacket(s.getBytes(),s.length(),packet.getAddress(),packet.getPort());
        socket.send(packet1);
        socket.close();

    }
}
