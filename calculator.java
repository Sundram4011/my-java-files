import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class calculator extends Applet
{
Label l1,l2,l3;
Button b1,b2,b3,b4;
TextField t1,t2;
public void init()
{
 l1=new Label("first number");
 l2=new Label("second number");
 l3=new Label();
 b1=new Button("add");
 b2=new Button("subtract");
 b3=new Button("multiplication");
 b4=new Button("division");
 t1=new TextField();
 t2=new TextField();
 setLayout(null);
 l1.setBounds(30,50,100,60);
 t1.setBounds(500,50,80,30);
 l2.setBounds(30,100,200,60);
 t2.setBounds(500,100,80,30);
 b1.setBounds(20,200,100,50);
 b2.setBounds(150,200,100,50);
 b3.setBounds(300,200,100,50);
 b4.setBounds(450,200,100,50);
 l3.setBounds(100,400,200,40);
 add(l1);
 add(l2);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(t1);
 add(t2);
 add(l3);
 b1.addActionListener(new addition());
 b2.addActionListener(new subtraction());
 b3.addActionListener(new multiplication ());
 b4.addActionListener(new division());
}
public class addition implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int a,b,s;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
s=a+b;
l3.setText("addition value is"+s);
}
}
public class subtraction implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int a,b,s;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
s=a-b;
l3.setText("subtraction value is"+s);
}
}
public class multiplication implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int a,b,s;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
s=a*b;
l3.setText("multiplication value is"+s);
}
}
public class division implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int a,b,s;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
s=a/b;
l3.setText("division value is"+s);
}
}
}

