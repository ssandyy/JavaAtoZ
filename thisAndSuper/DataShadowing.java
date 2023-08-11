package thisAndSuper;

public class DataShadowing {
    int x=9;
    public static void main(String[] args) {
        DataShadowing t = new DataShadowing();
        t.Test(20, t);
    }

    void Test(int x, DataShadowing z){
        System.out.println(x);  // will get value from object arg call
        System.out.println(z.x);  // will get value from class level
    }
}