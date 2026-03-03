import javax.swing.*;
import java.awt.*;

public class tap_2 extends JPanel {

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(double x=-10;x<=10;x+=0.01){
            double y=3*x*x;
            g.fillOval(300+(int)(x*20),300-(int)(y*20),2,2);
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame();
        f.add(new tap_2());
        f.setSize(600,600);
        f.setVisible(true);
    }
}