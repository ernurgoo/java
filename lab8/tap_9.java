public class tap_9 extends javax.swing.JPanel{

    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        for(double x=-10;x<=10;x+=0.01){
            if(x!=2){
                double y=(x+3)/(x-2);
                g.fillOval(300+(int)(x*30),300-(int)(y*30),2,2);
            }
        }
    }

    public static void main(String[] args){
        javax.swing.JFrame f=new javax.swing.JFrame();
        f.add(new tap_9());
        f.setSize(600,600);
        f.setVisible(true);
    }
}