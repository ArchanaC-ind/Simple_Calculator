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

    JButton[] numButton=new JButton[10];
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


        textfield=new JTextField();
        textfield.setBounds(30,25,350,55);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        add=new JButton("+");
        sub =new JButton("-");
        multi=new JButton("*");
        div=new JButton("/");
        dec=new JButton(".");
        eq=new JButton("=");
        del=new JButton("delete");
        clr=new JButton("Clear");

        fnButton[0]=add;
        fnButton[1]=sub;
        fnButton[2]=multi;
        fnButton[3]=div;
        fnButton[4]=dec;
        fnButton[5]=eq;
        fnButton[6]=del;
        fnButton[7]=clr;

        for(int i=0;i<fnButton.length;i++){
            fnButton[i].addActionListener(this);
            fnButton[i].setFocusable(false);
            fnButton[i].setFont(myFont);
        }
        for(int i=0;i<numButton.length;i++){
            numButton[i]= new JButton(String.valueOf(i));

            numButton[i].addActionListener(this);
            numButton[i].setFocusable(false);
            numButton[i].setFont(myFont);
        }
        del.setBounds(50,430,145,50);
        clr.setBounds(205,430,145,50);

        panel=new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.darkGray);



        for(int i=0;i<numButton.length;i++){
            panel.add(numButton[i]);
        }

        panel.add(dec);
        panel.add(eq);
        panel.add(add);
        panel.add(sub);
        panel.add(multi);
        panel.add(div);

        frame.add(panel);
        frame.add(del);
        frame.add(clr);
        frame.setVisible(true);
        frame.add(textfield);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
