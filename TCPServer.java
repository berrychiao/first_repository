import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException, IOException {
        ServerSocket ss = new ServerSocket(8888);

        while(true){
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            int len=0;
            byte[] bytes = new byte[10];
            StringBuffer buffer = new StringBuffer();
            while ((len = is.read(bytes))!=-1){
                buffer.append(new String(bytes,0,len));
            }

            System.out.println("I have received "+buffer.toString());
            os.write(("Message from Server is: "+buffer.toString()).getBytes());

            is.close();
            os.close();
            socket.close();
            if("end".equals(buffer.toString())){
                break;
            }

        }
        ss.close();
    }
}