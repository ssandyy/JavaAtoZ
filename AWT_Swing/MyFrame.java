package AWT_Swing;

import java.awt.*;

public class MyFrame extends Frame {
//    Frame f;
//    MyFrame(String s) {
//        //super(s);
//        Frame f = new Frame(s);
//        f.setSize(400, 400);
//        f.setVisible(true);
//
//    }
    MyFrame(String s) {
        super(s);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MyFrame("FF");
    }
}
