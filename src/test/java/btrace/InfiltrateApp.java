package btrace;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by skirge on 05.05.17.
 */
public class InfiltrateApp {

    public static void main(String[] args) throws IOException {
        System.out.println("test");
        Runtime.getRuntime().exec("touch /tmp/SULLEY");
        new FileInputStream("/tmp/SULLEY");
        Socket s = new Socket("www.onet.pl",80);
        OutputStream sstream = s.getOutputStream();
        sstream.write("GET / HTTP/1.1\r\nHost:onet.pl\r\n\r\n".getBytes());
        sstream.flush();
        int in = s.getInputStream().read();
    }

}
