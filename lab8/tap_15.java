import javax.swing.*;
import java.awt.*;

public class tap_15 extends JPanel {

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(double x=-10;x<=10;x+=0.01){
            double y = x/(3*x*x + 2*x + 1);
            g.fillOval(300+(int)(x*40),300-(int)(y*200),2,2);
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame("Tap_15");
        f.add(new tap_15());
        f.setSize(600,600);
        f.setVisible(true);
    }
}