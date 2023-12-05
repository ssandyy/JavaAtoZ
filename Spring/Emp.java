package Spring;

public class Emp {
    private String name;
    private int age;
    Emp(){
        System.out.println("Default Constructor");
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age; 
    }
    public String getName(){
        System.out.println("your name is "+name);
    }
    public int getAge(){
        System.out.println("your age is "+age);
    }
}
