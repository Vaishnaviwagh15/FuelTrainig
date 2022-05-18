/**
 * ()
 * 
 */
public class Demo3 {
    public static void main(String[] args) {

        StringBuffer sb;
        sb = new StringBuffer("V");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        sb.setCharAt(0,'k');
        System.out.println(sb);
        
 /*/append()
        sb.append(10);
        sb.append(5.6);
        sb.append("SH");*/

        System.out.println(sb);

//sb.deleteCharAt(0);
//delete
        //sb.delete(1, 7);
        System.out.println(sb);

        StringBuffer sb1;
        sb1=new StringBuffer("ONLY  JAVA");

        System.out.println(sb1);
        sb1.insert(5, "LIKE");
        System.out.println(sb1);
        sb1.reverse();
        
        System.out.println(sb1);
        String s3=sb1.toString();
        sb.reverse();
        
         System.out.println(sb);
        
    }

}
