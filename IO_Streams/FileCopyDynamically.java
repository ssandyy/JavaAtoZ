//package IO_Streams;
//after compilation run 'java FileCopyDynamically  namefile1.txt namefile2.txt'

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopyDynamically{
    public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException,FileNotFoundException {
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);

        int data;
        while((data=fis.read())!=-1){
            fos.write(data);
        }
        System.out.println("data copied successfully..!");
		fis.close();
		fos.close();
    }
	
}