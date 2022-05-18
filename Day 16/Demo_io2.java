// DataOutputStream
import java.io.*;
public class Demo_io2 {
    public static void main(String[] args)throws Exception {
               
        FileOutputStream fout;
        fout=new FileOutputStream("C:\\JAVA Traing\\io3.txt");
        DataOutputStream dout;
        dout=new DataOutputStream(fout);
        dout.writeInt(115);
        dout.writeBoolean(true);
        dout.writeDouble(1.332);
       dout.close();
    }

}
