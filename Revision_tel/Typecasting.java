package Revision_tel;

public class Typecasting {
    public static void main(String[] args) {
        byte a = 127;
        int b = 77;
        
        
        //a = b;  //Type mismatch: cannot convert from int to byte
        a = (byte)b; // downcasting o/P : 77
        System.out.println(a);

        b = a; // but we can convert from byte to int   upcasting o/P : 127
        System.out.println(b);
        
       
    }
    

}
