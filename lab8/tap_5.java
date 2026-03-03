public class tap_5 extends javax.swing.JPanel{

    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        for(double x=-3;x<=3;x+=0.01){
            double y=Math.pow(x,5);
            g.fillOval(300+(int)(x*40),300-(int)(y*5),2,2);
        }
    }

    public static void main(String[] args){
        javax.swing.JFrame f=new javax.swing.JFrame();
        f.add(new tap_5());
        f.setSize(600,600);
        f.setVisible(true);
    }
}