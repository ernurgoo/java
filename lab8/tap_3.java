public class tap_3 extends javax.swing.JPanel{

    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        for(double x=-10;x<=10;x+=0.01){
            double y=-6*x*x+3*x;
            g.fillOval(300+(int)(x*20),300-(int)(y*20),2,2);
        }
    }

    public static void main(String[] args){
        javax.swing.JFrame f=new javax.swing.JFrame();
        f.add(new tap_3());
        f.setSize(600,600);
        f.setVisible(true);
    }
}