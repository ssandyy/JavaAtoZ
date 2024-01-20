package IO_Streams;

import java.io.*;

public class FIleInputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("bcd.txt");
        int data = fis.read();
        System.out.println("data: " +data); // data: 97   because read() use to fetch data 1byte at atime in binary for here 'a' ascii code is 97
		System.out.println("Data: "+(char)data); // upcasting of binary into char
        fis.close();
    }
}
