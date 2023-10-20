public class ShallowCloning {
    int j;
    ShallowCloning(int j) { //constructor
        this.j = j;
    }
}
    class Dog implements Cloneable{
        ShallowCloning s; // instance variable
        int i;  // instance variable
        Dog(ShallowCloning s, int i){
            this.s=s;
            this.i=i;
        }
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
class ShallowCloningDemo{
    public static void main(String[] args) throws CloneNotSupportedException{
        ShallowCloning s = new ShallowCloning(20);
        Dog d1 = new Dog(s, 10);
        System.out.println(d1.i+".........."+d1.s.j);
        Dog d2 = (Dog)d1.clone();
        d2.i = 888;
        d2.s.j=999;
        System.out.println(d1.i+"-----------------"+d1.s.j);

    }
}
