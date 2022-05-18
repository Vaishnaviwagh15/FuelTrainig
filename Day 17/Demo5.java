//RandomAccessFile
import java.io.*;
public class Demo5 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile ob;
        ob = new RandomAccessFile("C:\\JAVA Traing\\test2.txt", "rw");

        ob.seek(7);
        ob.seek(0.000);
        int x;
        do {
            x = ob.read();
            if (x != -1) {
                System.out.print((char) x);
            }
        } while (x != -1);
        ob.close();
        System.out.println();

    }
}
