
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;




public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonDetails,viewPersonDetails,updatePersonDetails,checkpackages,bookpackage,about,
            viewpackage,viewhotels,destinations,bookhotel,viewbookedhotel,payments,calculators,notepad,deletePersonDetails;
    
    
    Dashboard(String username){
       this.username = username; 
     //setBounds(0,0,1600,1000);
     setExtendedState(JFrame.MAXIMIZED_BOTH);
     setLayout(null);
     
     JPanel p1 = new JPanel();
     p1.setLayout(null);
     p1.setBackground(new Color(18,97,128));
     p1.setBounds(0,0,1600,65);
     add(p1);
     
     ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/66.png"));
     Image i2 = i1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
     ImageIcon i3 =new ImageIcon(i2);
     JLabel icon = new JLabel(i3);
     icon.setBounds(5,0,70,70);
     p1.add(icon);
     
     JLabel heading = new JLabel ("Dashboard");
     heading.setBounds(80,10,300,40);
     heading.setForeground(Color.WHITE);
     heading.setFont(new Font("Tahoma",Font.BOLD,30));
     p1.add(heading);
     
    JPanel p2 = new JPanel();
     p2.setLayout(null);
     p2.setBackground(new Color(18,97,128));
     p2.setBounds(0,65,300,900);
     add(p2);
     
    addPersonDetails = new JButton("Add Personal Details");
    addPersonDetails.setBounds(0,0,300,50);
    addPersonDetails.setBackground(new Color(18,97,128));
    addPersonDetails.setForeground(Color.WHITE);
    addPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
    addPersonDetails.setMargin(new Insets(0, 0, 0, 60));
    addPersonDetails.addActionListener(this);
    p2.add(addPersonDetails);
    
    updatePersonDetails = new JButton("Update Personal Details");
    updatePersonDetails.setBounds(0,50,300,50);
    updatePersonDetails.setBackground(new Color(18,97,128));
    updatePersonDetails.setForeground(Color.WHITE);
    updatePersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
    updatePersonDetails.setMargin(new Insets(0, 0, 0, 30));
    updatePersonDetails.addActionListener(this);
    p2.add(updatePersonDetails);
    
    viewPersonDetails = new JButton("View Details");
    viewPersonDetails.setBounds(0,100,300,50);
    viewPersonDetails.setBackground(new Color(18,97,128));
    viewPersonDetails.setForeground(Color.WHITE);
    viewPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
    viewPersonDetails.setMargin(new Insets(0, 0, 0, 130));
    viewPersonDetails.addActionListener(this);
    p2.add(viewPersonDetails);
    
    deletePersonDetails = new JButton("Delete Personal Details");
    deletePersonDetails.setBounds(0,150,300,50);
    deletePersonDetails.setBackground(new Color(18,97,128));
    deletePersonDetails.setForeground(Color.WHITE);
    deletePersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
    deletePersonDetails.setMargin(new Insets(0, 0, 0, 40));
    deletePersonDetails.addActionListener(this);
    p2.add(deletePersonDetails);
    
    checkpackages = new JButton("Check Packages");
    checkpackages.setBounds(0,200,300,50);
    checkpackages.setBackground(new Color(18,97,128));
    checkpackages.setForeground(Color.WHITE);
    checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
    checkpackages.setMargin(new Insets(0, 0, 0, 100));
    checkpackages.addActionListener(this);
    p2.add(checkpackages);
    
    bookpackage = new JButton("Book Package");
    bookpackage.setBounds(0,250,300,50);
    bookpackage.setBackground(new Color(18,97,128));
    bookpackage.setForeground(Color.WHITE);
    bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
    bookpackage.setMargin(new Insets(0, 0, 0, 120));
    bookpackage.addActionListener(this);
    p2.add(bookpackage);
    
    viewpackage = new JButton("View Package");
    viewpackage.setBounds(0,300,300,50);
    viewpackage.setBackground(new Color(18,97,128));
    viewpackage.setForeground(Color.WHITE);
    viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
    viewpackage.setMargin(new Insets(0, 0, 0, 110));
    viewpackage.addActionListener(this);
    p2.add(viewpackage);
    
    viewhotels = new JButton("View Hotels");
    viewhotels.setBounds(0,350,300,50);
    viewhotels.setBackground(new Color(18,97,128));
    viewhotels.setForeground(Color.WHITE);
    viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
    viewhotels.setMargin(new Insets(0, 0, 0, 120));
    viewhotels.addActionListener(this);
    p2.add(viewhotels);
    
    bookhotel = new JButton("Book Hotels");
    bookhotel.setBounds(0,400,300,50);
    bookhotel.setBackground(new Color(18,97,128));
    bookhotel.setForeground(Color.WHITE);
    bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
    bookhotel.setMargin(new Insets(0, 0, 0, 120));
    bookhotel.addActionListener(this);
    p2.add(bookhotel);
    
    viewbookedhotel = new JButton("View Booked Hotel");
    viewbookedhotel.setBounds(0,450,300,50);
    viewbookedhotel.setBackground(new Color(18,97,128));
    viewbookedhotel.setForeground(Color.WHITE);
    viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
    viewbookedhotel.setMargin(new Insets(0, 0, 0, 70));
    viewbookedhotel.addActionListener(this);
    p2.add(viewbookedhotel);
    
    destinations = new JButton("Destinations");
    destinations.setBounds(0,500,300,50);
    destinations.setBackground(new Color(18,97,128));
    destinations.setForeground(Color.WHITE);
    destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
    destinations.setMargin(new Insets(0, 0, 0, 120));
    destinations.addActionListener(this);
    p2.add(destinations);
    
    payments = new JButton("Payments");
    payments.setBounds(0,550,300,50);
    payments.setBackground(new Color(18,97,128));
    payments.setForeground(Color.WHITE);
    payments.setFont(new Font("Tahoma",Font.PLAIN,20));
    payments.setMargin(new Insets(0, 0, 0, 150));
    payments.addActionListener(this);
    p2.add(payments);
    
    calculators = new JButton("Calculator");
    calculators.setBounds(0,600,300,50);
    calculators.setBackground(new Color(18,97,128));
    calculators.setForeground(Color.WHITE);
    calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
    calculators.setMargin(new Insets(0, 0, 0, 140));
    calculators.addActionListener(this);
    p2.add(calculators);
    
    notepad = new JButton("Notepad");
    notepad.setBounds(0,650,300,50);
    notepad.setBackground(new Color(18,97,128));
    notepad.setForeground(Color.WHITE);
    notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
    notepad.setMargin(new Insets(0, 0, 0, 160));
    notepad.addActionListener(this);
    p2.add(notepad);
    
    about = new JButton("About");
    about.setBounds(0,700,300,50);
    about.setBackground(new Color(18,97,128));
    about.setForeground(Color.WHITE);
    about.setFont(new Font("Tahoma",Font.PLAIN,20));
    about.setMargin(new Insets(0, 0, 0, 170));
    about.addActionListener(this);
    p2.add(about);
    
     ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("icons/1.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
        ImageIcon i6 =new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
         JLabel text = new JLabel ("Make Your Tour Amazing With Us...");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Georgia",Font.ITALIC,35));
        image.add(text);
    
     setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
      if (ae.getSource() == addPersonDetails){
          new AddCustomer(username);
      
      }else if (ae.getSource() == viewPersonDetails){
         new ViewCustomer(username);
      }else if (ae.getSource() == updatePersonDetails){
         new UpdateCustomer(username);
      }else if (ae.getSource() == checkpackages){
         new CheckPackage();
      }else if (ae.getSource() == bookpackage){
         new BookPackage(username);
      }else if (ae.getSource() == viewpackage){
         new ViewPackage(username);
      }else if (ae.getSource() == viewhotels){
         new CheckHotels();
      }else if (ae.getSource() == destinations){
         new Destinations();
      }else if (ae.getSource() == bookhotel){
         new BookHotel(username);
      }else if (ae.getSource() == viewbookedhotel){
         new ViewBookedHotel(username);
      }else if (ae.getSource() == payments){
         new Payment();
      }else if (ae.getSource() == calculators){
         try{
          Runtime.getRuntime().exec("calc.exe");
         
         }catch(Exception e){
           e.printStackTrace();
         }
      }else if (ae.getSource() == notepad){
         try{
          Runtime.getRuntime().exec("notepad.exe");
         
         }catch(Exception e){
           e.printStackTrace();
         }
      }else if (ae.getSource() == about){
         new About();
      }else if (ae.getSource() == deletePersonDetails){
         new DeleteDetails(username);
      }
    }
    
    public static void main(String[] args){
     new Dashboard("");
    }
}
