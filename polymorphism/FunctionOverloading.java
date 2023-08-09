package polymorphism;

public class FunctionOverloading {
    static void base(){
        System.out.println("this is base class with zero argument..!");
    }
    static void base(int x ){
        System.out.println("this is base class with 1 argument..! "+x);
    }
    static void base(int x, int y ){
        System.out.println("this is base class with 2 argument..! "+ x +" and "+ y);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        FunctionOverloading.base();
        FunctionOverloading.base(10);
        FunctionOverloading.base(40, 50);
    }
}
