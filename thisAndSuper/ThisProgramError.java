package thisAndSuper;

public class ThisProgramError {
    int x =100;

    public static void main(String... args) {
        ThisProgramError tp = new ThisProgramError();
        tp.get(20);
        tp.test(30);
    }
    void test(int x){
        ThisProgramError t = new ThisProgramError();
        t.get(10);
    }

    void get(int x){
        System.out.println(x); //20
        System.out.println(this.x);  //100
        System.out.println(this); // thisAndSuper.ThisProgramError@15aeb7ab
        System.out.println(x);
    }
}
