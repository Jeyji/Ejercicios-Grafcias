/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosgraficas;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Aorcado extends JFrame{
    public Aorcado(){
        add(new NewPanel());
    }  

    public static void main(String[] args) {
        Aorcado frame = new Aorcado();
        frame.setTitle("Aorcado");
        frame.setSize(700,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }      

    
}

class NewPanel extends JPanel implements ActionListener, MouseListener {        
    private Timer time;
    private int x,e,yo,tu,el,ella,we;
    private int lo, tg;
    int y = 104 ;
    int v = 302 ;
    int w = 36;
    int z = 36;
    String f1,f2,f3,f4,f5,f6,f7;
    String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
    private char min = may.charAt(27);
    @Override
    public void mouseClicked(MouseEvent e) {
        time.start();
        Point p = e.getPoint();
        if(getBounds().contains(p)){
            min = may.charAt(0);
        }else{
            v = v +38;
            if(getBounds().contains(p)){
                min = may.charAt(1);
            }else{
                v = v +38;
                if(getBounds().contains(p)){
                    min = may.charAt(2);
                }else{
                    v = v +38;
                    if(getBounds().contains(p)){
                        min = may.charAt(3);
                    }else{
                        v = v +38;
                        if(getBounds().contains(p)){
                            min = may.charAt(4);
                        }else{
                            v = v +38;
                            if(getBounds().contains(p)){
                                min = may.charAt(5);
                                }else{
                                    v = v +38;
                                    if(getBounds().contains(p)){
                                        min = may.charAt(6);
                                    }else{
                                        v = v +38;
                                        if(getBounds().contains(p)){
                                            min = may.charAt(7);
                                        }else{
                                            v = v +38;
                                            if(getBounds().contains(p)){
                                                min = may.charAt(8);
                                            }else{
                                                v = 302;
                                                y = y + 38;
                                                if(getBounds().contains(p)){
                                                    min = may.charAt(9);
                                                }else{
                                                    v = v +38;
                                                    if(getBounds().contains(p)){
                                                        min = may.charAt(10);
                                                    }else{
                                                        v = v +38;
                                                        if(getBounds().contains(p)){
                                                            min = may.charAt(11);
                                                        }else{
                                                            v = v +38;
                                                            if(getBounds().contains(p)){
                                                                min = may.charAt(12);
                                                            }else{
                                                                v = v +38;
                                                                if(getBounds().contains(p)){
                                                                    min = may.charAt(13);
                                                                }else{
                                                                    v = v +38;
                                                                    if(getBounds().contains(p)){
                                                                        min = may.charAt(14);
                                                                    }else{
                                                                        v = v +38;
                                                                        if(getBounds().contains(p)){
                                                                            min = may.charAt(15);
                                                                        }else{
                                                                            v = v +38;
                                                                            if(getBounds().contains(p)){
                                                                               min = may.charAt(16);
                                                                            }else{
                                                                                v = v +38;
                                                                                if(getBounds().contains(p)){
                                                                                    min = may.charAt(17);
                                                                                }else{
                                                                                    v = 302;
                                                                                    y = y + 38;
                                                                                    if(getBounds().contains(p)){
                                                                                        min = may.charAt(18);
                                                                                    }else{
                                                                                        v = v +38;
                                                                                        if(getBounds().contains(p)){
                                                                                            min = may.charAt(19);
                                                                                        }else{
                                                                                            v = v +38;
                                                                                            if(getBounds().contains(p)){
                                                                                                min = may.charAt(20);
                                                                                            }else{
                                                                                                v = v +38;
                                                                                                if(getBounds().contains(p)){
                                                                                                    min = may.charAt(21);
                                                                                                }else{
                                                                                                    v = v +38;
                                                                                                    if(getBounds().contains(p)){
                                                                                                       min = may.charAt(22);
                                                                                                    }else{
                                                                                                        v = v +38;
                                                                                                        if(getBounds().contains(p)){
                                                                                                            min = may.charAt(23);
                                                                                                        }else{
                                                                                                            v = v +38;
                                                                                                            if(getBounds().contains(p)){
                                                                                                                min = may.charAt(24);
                                                                                                            }else{
                                                                                                                v = v +38;
                                                                                                                if(getBounds().contains(p)){
                                                                                                                   min = may.charAt(25);
                                                                                                                }else{
                                                                                                                    v = v +38;
                                                                                                                    if(getBounds().contains(p)){
                                                                                                                        min = may.charAt(26);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }                                                                    
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                            }
                        }
                    }
                }
            }  
        }
        System.out.println(min);
        v = 302;
        y = 104;
        System.out.println(p);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
      
    @Override
    protected void paintComponent(Graphics g){
        String pal = "MALETA ";
        int con = 0;
        super.paintComponent(g);
        char ch[] = {min};
        String s1 = new String(ch);
        Image fondo = loadImage("fondo.png");
        g.drawImage(fondo, 0, 0, null);
        g.setColor(Color.white);
        for(int q=0; q<7; q++){
            if(min != pal.charAt(q)){
                con++;
            }else{
                lo=1;
                System.out.println("jkn ");
                System.out.println(pal.charAt(5));
                System.out.println("jol");
                tg++;
                if(tg==1){
                    f1=s1;
                    g.drawString(s1, 315+(q*42), 50 );
                    yo = q;
                }
                if(tg==2){
                    f2=s1;
                    g.drawString(f1, 315+(yo*42), 50 );
                    g.drawString(f2, 315+(q*42), 50 );
                    tu = q;
                }
                if(tg==3){
                    f3=s1;
                    g.drawString(f1, 315+(yo*42), 50 );
                    g.drawString(f2, 315+(tu*42), 50 );
                    g.drawString(f3, 315+(q*42), 50 );
                    el = q;
                }
                if(tg==4){
                    f4=s1;
                    g.drawString(f1, 315+(yo*42), 50 );
                    g.drawString(f2, 315+(tu*42), 50 );
                    g.drawString(f3, 315+(el*42), 50 );
                    g.drawString(f4, 315+(q*42), 50 );
                    ella = q;
                }
                if(tg==5){
                    f5=s1;
                    g.drawString(f1, 315+(yo*42), 50 );
                    g.drawString(f2, 315+(tu*42), 50 );
                    g.drawString(f3, 315+(el*42), 50 );
                    g.drawString(f4, 315+(ella*42), 50 );
                    g.drawString(f5, 315+(q*42), 50 );
                    we = q;
                }
                if(tg==6){
                    f6=s1;
                    g.drawString(f1, 315+(yo*42), 50 );
                    g.drawString(f2, 315+(tu*42), 50 );
                    g.drawString(f3, 315+(el*42), 50 );
                    g.drawString(f4, 315+(ella*42), 50 );
                    g.drawString(f5, 315+(we*42), 50 );
                    g.drawString(f6, 315+(q*42), 50 );
                    g.setColor(Color.BLUE);
                    g.drawString("¡GANASTE!", 400 , 250);
                    time.stop();
                }
            }
            if(lo>(0)){
                con = 0;                
            }
        }
        if (con > 0){
            e++;
            con = 0;
            
        }
        lo = 0;
        if (e==1){
            g.drawOval(187, 80, 40, 40);
        }  
        if (e==2){
            g.drawOval(187, 80, 40, 40);
            g.drawLine(207, 120, 207, 180);
        } 
        if (e==3){
            g.drawOval(187, 80, 40, 40);
            g.drawLine(207, 120, 207, 180);
            g.drawLine(177, 130, 207, 130);
        }
        if (e==4){
            g.drawOval(187, 80, 40, 40);
            g.drawLine(207, 120, 207, 180);
            g.drawLine(177, 130, 207, 130);
            g.drawLine(207, 130, 237, 130);
        }
        if (e==5){
            g.drawOval(187, 80, 40, 40);
            g.drawLine(207, 120, 207, 180);
            g.drawLine(177, 130, 207, 130);
            g.drawLine(207, 130, 237, 130);
            g.drawLine(207, 180, 177, 210);
        }
        if (e==6){
            g.drawOval(187, 80, 40, 40);
            g.drawLine(207, 120, 207, 180);
            g.drawLine(177, 130, 207, 130);
            g.drawLine(207, 130, 237, 130);
            g.drawLine(207, 180, 177, 210);
            g.drawLine(207, 180, 237, 210);
        }
        if (e>6){
            g.drawOval(187, 80, 40, 40);
            g.drawLine(207, 120, 207, 180);
            g.drawLine(177, 130, 207, 130);
            g.drawLine(207, 130, 237, 130);
            g.drawLine(207, 180, 177, 210);
            g.drawLine(207, 180, 237, 210);
            g.drawLine(170, 120, 244, 120);
            g.setColor(Color.RED);
            g.drawString("Perdiste, Intentale de nuevo", 330, 400);
        }
        g.setColor(Color.black);
        g.drawString("MALETA", 30, 380);
        time.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    public NewPanel() {
        time = new Timer(25, this);
        this.x = 10;
        this.addMouseListener(this);
        
    }
    @Override
    public Rectangle getBounds(){
        return new Rectangle(v, y, z, w);
    }
    
    public Image loadImage(String imageName){
        ImageIcon ii = new ImageIcon("fondo.png");
        Image image = ii.getImage();
        return image;
    }

}