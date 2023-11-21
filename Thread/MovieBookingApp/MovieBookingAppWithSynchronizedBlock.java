 package Thread.MovieBookingApp;

public class MovieBookingAppWithSynchronizedBlock extends Thread{
    static BookSeats bs;
    int seats;

    public static void main(String[] args) {
        bs = new BookSeats();
        MovieBookingAppWithSynchronizedBlock user1 = new MovieBookingAppWithSynchronizedBlock();
        user1.start();
        user1.seats=6;
        MovieBookingAppWithSynchronizedBlock user2 = new MovieBookingAppWithSynchronizedBlock();
        user2.start();
        user2.seats=5;
    }
    public void run(){
        bs.bookSeat(seats);
    }
}
class BookSeats{
    int total_seat=10;
    void bookSeat(int seats){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        synchronized (this) { // syncronized(object refrence expression)
            if (total_seat >= seats) {
                total_seat = total_seat - seats;
                System.out.println(Thread.currentThread().getName());
                System.out.println(seats + " Seats booked Successfully..! " + " Available Seats " + total_seat);
            } else {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Sorry! we are run out of seat");
                System.out.println("Available seats: " + total_seat);
            }
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}
