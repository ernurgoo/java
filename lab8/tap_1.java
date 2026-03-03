import javax.swing.*;
import java.awt.*;

public class tap_1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(double k=0.1;k<=1;k+=0.1){
            for(int x=-100;x<=100;x++){
                int y=(int)(k*x);
                g.fillOval(300+x,300-y,2,2);
            }
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame("Graph");
        f.add(new tap_1());
        f.setSize(600,600);
        f.setVisible(true);
    }
}