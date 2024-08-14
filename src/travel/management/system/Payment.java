
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener {
    
    JButton pay,back;
    
    Payment(){
       setBounds(500,200,800,600);
       setLayout(null);
       
     ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/y/45.png"));
     Image i2 = i1.getImage().getScaledInstance(800,600, Image.SCALE_DEFAULT);
     ImageIcon i3 =new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(0,0,800,600);
     add(image);
     
     pay = new JButton("Pay");
     pay.setBounds(420,20,80,40);
     pay.setBackground(new Color(18,97,128));
     pay.setFont(new Font("Tahoma",Font.PLAIN,16));
     pay.setForeground(Color.WHITE);
     pay.addActionListener(this);
     image.add(pay);
     
     back = new JButton("Back");
     back.setBounds(520,20,80,40);
     back.setBackground(new Color(18,97,128));
     back.setFont(new Font("Tahoma",Font.PLAIN,16));
     back.setForeground(Color.WHITE);
     back.addActionListener(this);
     image.add(back);
     
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       if (ae.getSource() == pay){
         setVisible(false);
         new Paytm();
       }else{
         setVisible(false);
       }
    
   
    }

  public static void main(String[] args){
    new Payment();  
  }  
}

