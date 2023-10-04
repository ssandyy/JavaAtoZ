import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc2.txt");
        int data = fis.read();
        System.out.println("data: " +data); // data: 97   because read() use to fetch data 1byte at atime in binary for here 'a' ascii code is 97
		System.out.println("Data: "+(char)data); // upcasting of binary into char
        fis.close();
    }
}