import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws IOException, IOException {
        Scanner sc=new Scanner(System.in);
        InetAddress ip=InetAddress.getByAddress(new byte[]{127,0,0,1});
//本机的8888端口号提供服务器程序，客户端和服务器端建立通信连接
        Socket socket=new Socket(ip,8888);
//System.out.println(socket);
//得到此次连接的输入、输出流
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
//1 客户端写数据
        String line=sc.nextLine(); //读一行数据
        os.write(line.getBytes()); //写到服务器端
        socket.shutdownOutput(); //写出结束
//2 客户端接收数据，显示
        int len=0;
        byte[] bytes=new byte[10];
        StringBuffer buffer=new StringBuffer();
        while((len=is.read(bytes))!=-1){
            buffer.append(new String(bytes,0,len));
        }
//显示
        System.out.println("Client has received:"+buffer.toString());
//关闭输入、输出流
        is.close();
        os.close();
//关闭通信连接
        socket.close();
    }
}