import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    JFrame fobj;
    JButton Addobj, Subobj, Mulobj, Divobj;
    JLabel Number1label, Number2label, Resultlabel;
    JTextField N1obj, N2obj, Robj;

    public Calculator(String title, int width, int height)
    {
        fobj = new JFrame(title);
        fobj.setSize(width,height);
        fobj.setLayout(null);

        Number1label = new JLabel("Number 1");
        Number1label.setBounds(50,50,100,30);

        Number2label = new JLabel("Number 2");
        Number2label.setBounds(50,100,100,30);

        Resultlabel = new JLabel("Result");
        Resultlabel.setBounds(50,150,100,30);

        N1obj = new JTextField();
        N1obj.setBounds(150,50,150,30);

        N2obj = new JTextField();
        N2obj.setBounds(150,100,150,30);

        Robj = new JTextField();
        Robj.setBounds(150,150,150,30);
        Robj.setEditable(false);

        Addobj = new JButton("+");
        Addobj.setBounds(50,220,60,40);

        Subobj = new JButton("-");
        Subobj.setBounds(120,220,60,40);

        Mulobj = new JButton("*");
        Mulobj.setBounds(190,220,60,40);

        Divobj = new JButton("/");
        Divobj.setBounds(260,220,60,40);

        fobj.add(Number1label);
        fobj.add(Number2label);
        fobj.add(Resultlabel);
        fobj.add(N1obj);
        fobj.add(N2obj);
        fobj.add(Robj);
        fobj.add(Addobj);
        fobj.add(Subobj);
        fobj.add(Mulobj);
        fobj.add(Divobj);

        Addobj.addActionListener(this);
        Subobj.addActionListener(this);
        Mulobj.addActionListener(this);
        Divobj.addActionListener(this);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        int no1 = Integer.parseInt(N1obj.getText());
        int no2 = Integer.parseInt(N2obj.getText());
        int result = 0;

        if(aobj.getSource() == Addobj)
            result = no1 + no2;
        else if(aobj.getSource() == Subobj)
            result = no1 - no2;
        else if(aobj.getSource() == Mulobj)
            result = no1 * no2;
        else if(aobj.getSource() == Divobj)
            result = no1 / no2;

        Robj.setText(String.valueOf(result));
    }
}

class TaskCalculator
{
    public static void main(String args[])
    {
        Calculator cobj = new Calculator("Calculator",600,400);
    }
}
