package Thread.MovieBookingApp;

public class MovieBookingAppWithSynchronizedMethod  extends Thread{
        static BookSeat bs;
        int seats;

        public static void main(String[] args) {
            bs=new BookSeat();
            MovieBookingAppWithSynchronizedMethod user1 = new MovieBookingAppWithSynchronizedMethod();
            user1.start();
            user1.seats=6;
            MovieBookingAppWithSynchronizedMethod user2 = new MovieBookingAppWithSynchronizedMethod();
            user2.start();
            user2.seats=5;
        }
        public void run(){
            bs.bookSeat(seats);
        }
    }
    class BookSeat{
        int total_seat=10;
        synchronized void bookSeat(int seats){
            if (total_seat>=seats) {
                total_seat=total_seat-seats;
                System.out.println(Thread.currentThread().getName());
                System.out.println(seats+" Seats booked Successfully..! "+" Available Seats "+total_seat);
            }else {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Sorry! we are run out of seat");
                System.out.println("Available seats: "+total_seat);
            }
        }
    }
