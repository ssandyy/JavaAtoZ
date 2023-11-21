package Thread.MovieBookingApp.Synchronization;

public class Shared {
    int x,y;

    public static void main(String[] args) {
        Shared s1 = new Shared();
        s1.show("ssandyy", 5);
    }

    synchronized void show(String s, int a){
        x=a;
        System.out.println("show method..! Starting " +s+ " " +a);
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Exit from Method..! "+s+ " "+a);
        }
    }
    
}
