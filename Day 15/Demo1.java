/**
 * substring()
 * endsWith()
 * startsWith()
 */
 
public class Demo1 {
    public static void main(String[] args) {
        String s1 = "Hello Vaishu";
        String s2 = s1.substring(2);
        System.out.println(s2);
        s2 = s1.substring(2, 8);
        System.out.println(s2);
        
        // *************************
        
        System.out.println(s1.startsWith("v"));
        System.out.println(s1.startsWith("Hello"));
        System.out.println(s1.startsWith("hello"));
        System.out.println(s1.endsWith("Hello"));
        System.out.println(s1.endsWith("am"));
        System.out.println(s1.endsWith("vai"));
    }

}
