public class tap_7 extends javax.swing.JPanel{

    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        for(double x=-10;x<=10;x+=0.01){
            double y=Math.cos(x-1)+Math.abs(x);
            g.fillOval(300+(int)(x*20),300-(int)(y*20),2,2);
        }
    }

    public static void main(String[] args){
        javax.swing.JFrame f=new javax.swing.JFrame();
        f.add(new tap_7());
        f.setSize(600,600);
        f.setVisible(true);
    }
}