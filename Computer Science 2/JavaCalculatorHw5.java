//Sarah Montrose
//898715
//4-24-18
//HW5

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JavaCalculatorHw5 extends JFrame 
{

        private JButton Num1;
        private JButton Num2;
        private JButton Num3;
        private JButton Num4;
        private JButton Num5;
        private JButton Num6;
        private JButton Num7;
        private JButton Num8;
        private JButton Num9;
        private JButton Num0;
        private JButton jbtEqual;
        private JButton jbtAdd;
        private JButton jbtSubtract;
        private JButton jbtMultiply;
        private JButton jbtDivide;
        private JButton jbtSolve;
        private double Number1;
        private double Number2;
        private int c;
        private JTextField jtfResult;
        String display = "";

    public JavaCalculatorHw5() 
    {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 4));
        p1.add(Num1 = new JButton("1"));
        p1.add(Num2 = new JButton("2"));
        p1.add(Num3 = new JButton("3"));
        p1.add(Num4 = new JButton("4"));
        p1.add(Num5 = new JButton("5"));
        p1.add(Num6 = new JButton("6"));
        p1.add(Num7 = new JButton("7"));
        p1.add(Num8 = new JButton("8"));
        p1.add(Num9 = new JButton("9"));
        p1.add(Num0 = new JButton("0"));
        

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(10, 5));
        p3.add(jbtAdd = new JButton("+"));
        p3.add(jbtSubtract = new JButton("-"));
        p3.add(jbtMultiply = new JButton("*"));
        p3.add(jbtDivide = new JButton("/"));
        p3.add(jbtSolve = new JButton("="));

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.SOUTH);
        p.add(p3, BorderLayout.EAST);


        add(p);

        Num1.addActionListener(new ListenToOne());
        Num2.addActionListener(new ListenToTwo());
        Num3.addActionListener(new ListenToThree());
        Num4.addActionListener(new ListenToFour());
        Num5.addActionListener(new ListenToFive());
        Num6.addActionListener(new ListenToSix());
        Num7.addActionListener(new ListenToSeven());
        Num8.addActionListener(new ListenToEight());
        Num9.addActionListener(new ListenToNine());
        Num0.addActionListener(new ListenToZero());

        jbtAdd.addActionListener(new ListenToAdd());
        jbtSubtract.addActionListener(new ListenToSubtract());
        jbtMultiply.addActionListener(new ListenToMultiply());
        jbtDivide.addActionListener(new ListenToDivide());
        jbtSolve.addActionListener(new ListenToSolve());
    } 

    class ListenToOne implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "1");
        }
    }
    class ListenToTwo implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "2");
        }
    }
    class ListenToThree implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "3");
        }
    }
    class ListenToFour implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "4");
        }
    }
    class ListenToFive implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "5");
        }
    }
    class ListenToSix implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "6");
        }
    }
    class ListenToSeven implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "7");
        }
    }
    class ListenToEight implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "8");
        }
    }
    class ListenToNine implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "9");
        }
    }
    class ListenToZero implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            display = jtfResult.getText();
            jtfResult.setText(display + "0");
        }
    }

    class ListenToAdd implements ActionListener 
    {
         public void actionPerformed(ActionEvent e) 
         {
            Number1 = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            c =1;

         }
    }
    class ListenToSubtract implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            Number1 = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            c=2;
        }
    }
    class ListenToMultiply implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            Number1 = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            c=3;
        }
    }
    class ListenToDivide implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            Number1 = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            c=4;
        }
    }
    class ListenToSolve implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            Number2 = Double.parseDouble(jtfResult.getText());
            double i=0.0;
            if(c==1){
                  i = Number1+Number2;
                  jtfResult.setText(Double.toString(i));}
           
           else if(c==2){
                i = Number1-Number2;
                jtfResult.setText(Double.toString(i));}

           else if(c==4)
           {
                  i = Number1/Number2;
                  jtfResult.setText(Double.toString(i));
           }
            
            else if(c==3)
            {
                  i = Number1*Number2;
                  jtfResult.setText(Double.toString(i));
            }   
        }
    }

    public static void main(String[] args) 
    {
        JavaCalculatorHw5 calc = new JavaCalculatorHw5();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

}
