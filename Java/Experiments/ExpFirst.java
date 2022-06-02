package Java.Experiments;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class ExpFirst extends Applet implements KeyListner{
    String mssg = "";
    public void init() {
        addKeyListener(this);
    }

    public void keyReleased(KeyEvent k) {
        showStatus("Key Released");
        repaint();
    }

    public void keyReleased(KeyEvent k) {
        showStatus("Key Typed");
        repaint();
    }

    public void keyReleased(KeyEvent k) {
        showStatus("Key Pressed");
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(mssg, 10, 10);
    }
}

/*
<applet code="ExpFirst" height="400" width="400">
</applet>
*/