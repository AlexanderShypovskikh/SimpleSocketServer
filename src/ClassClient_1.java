import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Al on 30.07.2016.
 */
public class ClassClient_1 {

    public static void main(String[] args) {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            while(!(s = buff.readLine()).equals("bye")){
                System.out.println(s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
