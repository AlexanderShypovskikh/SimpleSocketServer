import java.io.*;
import java.net.Socket;

/**
 * Created by Al on 30.07.2016.
 */
public class ClientsClass {

    public static void main(String[] args) {
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
       String s;
        try {
            while(!(s = buffer.readLine()).equals("bye")){
                try(Socket socket = new Socket("127.0.0.1", 8081);
                    BufferedWriter bufWriter = new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream()));
                ){
                   bufWriter.write(s);
                    bufWriter.flush();
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
