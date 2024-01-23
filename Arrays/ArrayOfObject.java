package Arrays;

class Students{
    String name;
    int roll;
    int age;
    
}
public class ArrayOfObject {
    public static void main(String[] args) {
        
        Students s1 = new Students();
        s1.name="sandeep";
        s1.roll=101;
        s1.age=20;
    
       
        Students s2 = new Students();
        s2.name="rahul";
        s2.roll=102;
        s2.age=55;

        Students s3 = new Students();
        s3.name="suraj";
        s3.roll=192;
        s3.age=63;

        // Lets create Array of above created objects

        Students std[] = new Students[3];   // same as --> int a[] = new int[5];
        std[0]=s1;
        std[1]=s2;
        std[2]=s3;

        for(Students s:std ){
            System.out.println("Name: "+s.name);
            System.out.println("Roll: "+s.roll);
            System.out.println("Age: "+s.age);
            System.out.println();
        }
        
    }
   
    
}
