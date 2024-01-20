package IO_Streams;
//this is via Scanner class approch

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyDynamicallyScanner{
    public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException,FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter source file: ");
		String srcfile =sc.nextLine();
		System.out.print("Enter destination file: ");
		String destFile = sc.nextLine();
        FileInputStream fis = new FileInputStream(srcfile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int data;
        while((data=fis.read())!=-1){
            fos.write(data);
        }
        System.out.println("data copied successfully..!");
		fis.close();
		fos.close();
    }
	
}