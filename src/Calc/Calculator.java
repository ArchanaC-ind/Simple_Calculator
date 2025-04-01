package Calc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
    public static void main(String[] args) {
    Calculator calc=new Calculator();
    }

    JFrame frame;
    JTextField textfield;

    JButton[] numButtom=new JButton[10];
    JButton[] fnButton=new JButton[8];

    JButton add, sub,multi,div,dec,eq,del,clr;
    JPanel panel;

    Font myFont=new Font("Ink Free",Font.ITALIC,25);
    double num1=0,num2=0,result=0;
    char op;

    Calculator(){
        frame=new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
