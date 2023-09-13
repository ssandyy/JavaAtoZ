package AWT_Swing;
import java.awt.*;
public class MyFrame2 {
    Frame f;
    TextField tf;
    Button b1;

    MyFrame2(String s){
        f=new Frame(s);

        tf=new TextField();
        tf.setBounds(40,40,100,30);
        f.add(tf);

        b1=new Button("Submit");
        b1.setBounds(40, 100, 60, 45);
        f.add(b1);

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame2(" Frame 2 ");
    }
}
