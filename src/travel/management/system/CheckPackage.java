
package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {
    
    CheckPackage(){
      setBounds(450,200,900,600);
      
      String[] package1 = {"Gold Package", "7 Days & 8 Nights","Full Day City Tour","Daily Buffet","Welcome Drinks on Arrival","Guide","Book Now","RS.30,000/=","R.jfif"};
      String[] package2 = {"Silver Package", "6 Days & 7 Nights","Full Day City Tour","Daily Buffet","Free Clubbing","Guide","Book Now","Rs.35,000/=","T.jpg"};
      String[] package3 = {"Bronze Package", "5 Days & 6 Nights","Full Day City Tour","Daily Buffet","Welcome Drinks on Arrival","Horse Riding","Book Now","Rs.40,000/=","S.jpg"};
      
      
      JTabbedPane tab = new JTabbedPane();
      JPanel p1 = createPackage(package1);
      tab.addTab("Package 01",null,p1);
      
      JPanel p2 = createPackage(package2);
      tab.addTab("Package 02",null,p2);
      
      JPanel p3 = createPackage(package3);
      tab.addTab("Package 03",null,p3);
      
      add(tab);
      
      
      setVisible(true);
      
    
    }
    
    public JPanel createPackage(String[] pack){
      JPanel p1 = new JPanel();
      p1.setLayout(null);
      p1.setBackground(new Color(237,249,249));
      
      JLabel l1 = new JLabel(pack[0]);
      l1.setBounds(50,5,300,30);
      l1.setFont(new Font("Ariel",Font.PLAIN,30));
      p1.add(l1);
      
      JLabel l2 = new JLabel(pack[1]);
      l2.setBounds(30,60,300,30);
      l2.setFont(new Font("Tahoma",Font.PLAIN,20));
      p1.add(l2);
      
      JLabel l3 = new JLabel(pack[2]);
      l3.setBounds(30,110,300,30);
      l3.setFont(new Font("Tahoma",Font.PLAIN,20));
      p1.add(l3);
      
      JLabel l4 = new JLabel(pack[3]);
      l4.setBounds(30,160,300,30);
      l4.setFont(new Font("Tahoma",Font.PLAIN,20));
      p1.add(l4);
      
      JLabel l5 = new JLabel(pack[4]);
      l5.setBounds(30,210,300,30);
      l5.setFont(new Font("Tahoma",Font.PLAIN,20));
      p1.add(l5);
      
      JLabel l6 = new JLabel(pack[5]);
      l6.setBounds(30,260,300,30);
      l6.setFont(new Font("Tahoma",Font.PLAIN,20));
      p1.add(l6);
      
      JLabel l7 = new JLabel(pack[6]);
      l7.setBounds(60,320,300,30);
      l7.setForeground(new Color(62,71,114));
      l7.setFont(new Font("Ariel",Font.BOLD,20));
      p1.add(l7);
      
      JLabel l8 = new JLabel(pack[7]);
      l8.setBounds(700,370,300,30);
      l8.setForeground(Color.BLACK);
      l8.setFont(new Font("Ariel",Font.BOLD,20));
      p1.add(l8);
      
      ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[8]));
      Image i2 = i1.getImage().getScaledInstance(500,300, Image.SCALE_DEFAULT);
      ImageIcon i3 =new ImageIcon(i2);
      JLabel l9 = new JLabel(i3);
      l9.setBounds(350,20,500,300);
      p1.add(l9);
      
      return p1;
    }
    
    public static void main(String[] args){
    new CheckPackage();
    }
    
}
