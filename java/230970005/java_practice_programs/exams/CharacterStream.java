import java.io.BufferedReader;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class CharacterStream {
    public static void main(String[] args) throws Exception {
        RandomAccessFile r=new RandomAccessFile("client.txt", "rw");
        r.seek(r.length());
        int c;
        r.write(65);
    }
}
