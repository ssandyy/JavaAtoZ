public class DeepCloning {
    int j;
    DeepCloning(int j){
        this.j=j;
    }
}
class Test implements Cloneable {
    DeepCloning dc;
    int i;
    Test(DeepCloning dc, int i){
        this.dc=dc;
        this.i=i;
    }
    public Object clone() throws CloneNotSupportedException{
        DeepCloning d = new DeepCloning(dc.j); //point to j as we have to triger the deep cloning/ independent cloning
        Test t = new Test(d,i);
        return t;
    }
}
class DeepCloningDemo{
    public static void main(String[] args) throws CloneNotSupportedException {
    DeepCloning dc = new DeepCloning(10); // j=10
    Test t1 = new Test(dc,20);
    System.out.println(t1.i+"---------------"+t1.dc.j);
    Test t2 = (Test)t1.clone();
    t2.i=8888;
    t2.dc.j=9999;
    System.out.println(t2.i+"-------------"+t2.dc.j);
    }
}