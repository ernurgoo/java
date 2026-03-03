import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab10_6 extends JPanel {

    int x,y;

    public lab10_6(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(x,y,10,10);
        g.drawString("("+x+","+y+")",x,y);
    }

    public static void main(String[] args){
        JFrame f=new JFrame("Есеп 6");
        f.add(new lab10_6());
        f.setSize(400,300);
        f.setVisible(true);
    }
}