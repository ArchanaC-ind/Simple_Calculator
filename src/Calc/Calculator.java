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
    JButton[] fnButton=new JButton[9];

    JButton add, sub,multi,div,dec,eq,del,clr,neg;
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
        neg =new JButton("(-)");

        fnButton[0]=add;
        fnButton[1]=sub;
        fnButton[2]=multi;
        fnButton[3]=div;
        fnButton[4]=dec;
        fnButton[5]=eq;
        fnButton[6]=del;
        fnButton[7]=clr;
        fnButton[8]=neg;

        for (JButton jButton : fnButton) {
            jButton.addActionListener(this);
            jButton.setFocusable(false);
            jButton.setFont(myFont);
        }
        for(int i=0;i<numButton.length;i++){
            numButton[i]= new JButton(String.valueOf(i));

            numButton[i].addActionListener(this);
            numButton[i].setFocusable(false);
            numButton[i].setFont(myFont);
        }
        del.setBounds(50,430,100,50);
        clr.setBounds(150,430,100,50);
        neg.setBounds(250,430,100,50);

        panel=new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.darkGray);


        for (JButton jButton : numButton) {
            panel.add(jButton);
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
        frame.add(neg);

        frame.setVisible(true);
        frame.add(textfield);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<numButton.length;i++){
            if(e.getSource()==numButton[i])
            {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==dec)
        {
            textfield.setText(textfield.getText().concat("."));
        }
        if(e.getSource()==add)
        {
            num1=Double.parseDouble(textfield.getText());
            op='+';
            textfield.setText("");
        }
        if(e.getSource()==sub)
        {
            num1=Double.parseDouble(textfield.getText());
            op='-';
            textfield.setText("");
        }
        if(e.getSource()==multi)
        {
            num1=Double.parseDouble(textfield.getText());
            op='*';
            textfield.setText("");
        }
        if(e.getSource()==div)
        {
            num1=Double.parseDouble(textfield.getText());
            op='/';
            textfield.setText("");
        }

        if(e.getSource()==eq){
            num2=Double.parseDouble(textfield.getText());
            switch(op){
                case'+':
                    result=num1+num2;
                    break;
                case'-':
                    result=num1-num2;
                    break;
                case'*':
                    result=num1*num2;
                    break;
                case'/':
                    result=num1/num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1=result;
        }

        if(e.getSource()==clr){
            textfield.setText("");
        }
        if(e.getSource()==del){
            String str=textfield.getText();
            textfield.setText("");
            for(int i=0;i<str.length()-1;i++){
                textfield.setText(textfield.getText()+str.charAt(i));
            }
        }
        if(e.getSource()==neg){
            double temp=Double.parseDouble(textfield.getText());
            temp*=-1;
            textfield.setText(String.valueOf(temp));
        }
    }
}
