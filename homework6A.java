import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;


public class homework6A extends JPanel {
   private JTextField field1, field2;
   private JButton okay;
   private JLabel resultLabel;
   public static void main(String[] args)
   { JFrame frame = new JFrame("Sum Product");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      homework6A panel = new homework6A();
      frame.getContentPane().add(panel);
      
      frame.pack();
      frame.setVisible(true);
   }
   public homework6A(){
      
            
      field1 = new JTextField();
      field2 = new JTextField();
      field1.setColumns(1);
      field2.setColumns(1);
      resultLabel= new JLabel();
      resultLabel.setText("Enter two numbers to find the sum and product.");
      okay = new JButton("Okay");
      okay.addActionListener(new TempListener());
      add(field1);
      add(field2);
      add(resultLabel);
      add(okay);
   }
   
  
   
   public class TempListener implements ActionListener{
      public void actionPerformed(ActionEvent event){
        // int first, second, sum, product;
      
      
         int first = Integer.parseInt(field1.getText()); 
         int second = Integer.parseInt(field2.getText());
         int sum = first + second;
         int product = first * second;
         
         resultLabel.setText("The sum is " + sum + ". The product is " + product + ".");
      
      
      }
   }
   
}