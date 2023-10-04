//package IO_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIOCopy {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc2.txt");
        FileOutputStream fos = new FileOutputStream("bcd.txt");

        int data;
        while((data=fis.read())!=-1){
            fos.write(data);
        }
        System.out.println("data copied successfully..!");
		fis.close();
		fos.close();
    }
	
}
