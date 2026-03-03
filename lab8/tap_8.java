public class tap_8 extends javax.swing.JPanel{

    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        for(double x=-10;x<=10;x+=0.01){
            if(x!=0){
                double y=1/x;
                g.fillOval(300+(int)(x*40),300-(int)(y*40),2,2);
            }
        }
    }

    public static void main(String[] args){
        javax.swing.JFrame f=new javax.swing.JFrame();
        f.add(new tap_8());
        f.setSize(600,600);
        f.setVisible(true);
    }
}