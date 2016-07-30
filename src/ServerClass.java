import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Al on 30.07.2016.
 */
public class ServerClass {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(8081);
            Socket socket;
            while(true){
                System.out.println("Server is waiting..");
                socket = server.accept();
                System.out.println("Get Connection");
                BufferedReader buffReader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                String s;
                System.out.println("server got this:");
                while((s = buffReader.readLine()) != null){
                    System.out.println(s);
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
