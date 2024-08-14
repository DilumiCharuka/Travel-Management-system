
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
   
    
    JButton next;
    
    Splash(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(200,100);
        setBounds(0,0,1650,1000);
        
        JLabel text = new JLabel ("Make Your Tour Amazing With Us...");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Georgia",Font.ITALIC,35));
        add(text);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/1.jpg")); 
       Image i2 = i1.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel (i3);
       
       add(image);
        
     next = new JButton("Next");
     next.setBackground(new Color(237,249,249));
     next.setForeground(Color.BLACK);
     next.setBounds(900,390,100,25);
     next.setBorder(BorderFactory.createEmptyBorder());
     next.addActionListener(this);
     image.add(next);
       
       
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae){
      if (ae.getSource() == next){
          new Login();
      }
   
    
     
    }
     public static void main(String[] args){
        Splash frame = new Splash();
        
        int x = 1;
        for (int i = 1; i <= 500; x+=7, i+=6){
        frame.setLocation(750-(x+i)/2,400-(i/2));
        frame.setSize(x+i,i);
        try{
            Thread.sleep(10);
        }catch (Exception e){}
        
        }
    }
}
