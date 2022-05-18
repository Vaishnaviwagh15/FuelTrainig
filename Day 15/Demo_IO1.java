import java.io.*;
public class Demo_IO1 {
    public static void main(String[] args)throws Exception {
       
        FileInputStream fin;
        fin=new FileInputStream("D:\\Documents\\New project\\Hello.txt");
        fin=new FileInputStream("D:\\Documents\\New project\\World.txt");
        StringBuffer sb;
        sb=new StringBuffer();
        int x;
        System.out.println(fin.available());

        do{
            x=fin.read();
            if(x!=-1){
                System.out.print((char)x);
            }
        }while(x!=-1);
        fin.close();
        System.out.println();
        
    }

}