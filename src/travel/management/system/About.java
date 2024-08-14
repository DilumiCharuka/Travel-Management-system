
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    
    About(){
      setBounds(600,200,500,550);
        getContentPane().setBackground(new Color(237,249,249));
        setLayout(null);
        
        JLabel l1 = new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(new Color(18,97,128));
        l1.setFont(new Font("Tahoma",Font.BOLD,24));
        add(l1);
        
        String s = "About Project \n"+"\n"+"The Travel and Tourism Management System is designed to cater to a diverse range of target audiences and intended users within the travel and tourism industry. These include:\n" +"\n"+
"• Travelers: travelers seeking to plan and book their own trips using the system's user-friendly interface.\n" + "\n"+
"• Administrator: Within the travel businesses, administrator responsible for managing bookings, customer interactions, and business operations.\n" + "\n"+
"• Hotel and Accommodation Providers: Hotels, resorts, and other lodging establishments seeking efficient management of reservations and guest services.\n" + "\n"+
"• Travel Planners: Individuals who plan and organize trips for clients, often providing custom itineraries and personalized travel experiences.\n" + "\n"+
"• Tour Providers: Organizations offering specialized tours such as adventure, eco-tourism, cultural experiences, and more.\n" + "\n"+
"• Travel Agencies: Small, medium, and large travel agencies that offer a wide array of travel services, such as accommodations, tours, and packages.\n" + "\n"+
"The system's flexibility and customizable features make it suitable for a wide range of users, from individuals planning personal trips to professionals managing complex travel arrangements.";
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        area.setBackground(Color.WHITE);
        add(area);
        
     JButton back = new JButton("Back");
     back.setBounds(200,420,100,25);
     back.setBackground(new Color(18,97,128));
     back.setFont(new Font("Tahoma",Font.PLAIN,16));
     back.setForeground(Color.WHITE);
     back.addActionListener(this);
     add(back);
     
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
      setVisible(false);
    }
   
    public static void main(String[] args){
      new About();
    }
    
}
