package Thread;

import javax.swing.*;
import java.util.TimerTask;

class Task extends TimerTask{
    int count = 1;
    public void run(){
        JFrame f = new JFrame();
        f.setSize(400, 4000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        count++;
    }
}
public class TaskSchedulling {
    public static void main(String[] args) {
//        Timer t = new Timer(2000);
        int delay=3000;// delay for 3 sec
        int period = 1000;// repeat every sec
       // t.scheduleAtFixedRate(new Task(),delay,period);
    }
}
