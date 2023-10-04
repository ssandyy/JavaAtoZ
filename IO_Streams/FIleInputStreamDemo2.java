import java.io.*;


class FIleInputStreamDemo2{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("abc2.txt");
		int data;
		
		while((data = fis.read())!=-1){
			System.out.println("data: "+data+ "\t"+(char)data);
		}
		fis.close();
	}
}