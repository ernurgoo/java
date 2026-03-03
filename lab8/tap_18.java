import javax.swing.*;
import java.awt.*;

public class tap_18 extends JPanel {

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(double x=-10;x<=10;x+=0.01){
            double y = x/(x*x + 3*x + 1);
            g.fillOval(300+(int)(x*40),300-(int)(y*200),2,2);
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame("Tap_18");
        f.add(new tap_18());
        f.setSize(600,600);
        f.setVisible(true);
    }
}