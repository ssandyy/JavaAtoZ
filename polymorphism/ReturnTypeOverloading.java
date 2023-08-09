package polymorphism;
// Returntype of function do not play any role in case of function overloading


public class ReturnTypeOverloading {
    static void show(char a){
        System.out.println("no returntype");
    }

//    char void show(char a){
//        System.out.println("no returntype");
//        return 'z';
//    }


    static int show(int z){
        System.out.println("with returntype ");
        return z;
    }
    static void show(){
        System.out.println("No-return..!");
    }

    public static void main(String[] args) {
        show('c');
        int a =show(10);
        System.out.println(a);
    }
}
