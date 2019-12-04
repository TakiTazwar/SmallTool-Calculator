import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.lang.Math;
class Calculator implements ActionListener{
	JFrame F;
	
	
	JButton B1;
	JButton B2;
	JButton B3;
	JButton B4;
	JButton B5;
	JButton B6;
	JButton B7;
	JButton B8;
	JButton B9;
	JButton B0;
	JButton BDot;
	JButton BAdd;
	JButton BSub;
	JButton BMulti;
	JButton BDiv;
	JButton BEqual;
	JButton BClear;
	JButton BPower;
	
	JLabel Calc;
	JLabel Operator;
	JLabel Value;

	double number1,number2;
	short Operation;
	boolean dotFlag=true;
	
	public Calculator() {
				
		//Frame Section Starts
		F=new JFrame("Calculator");
		F.setLayout(null);
		F.setBounds(10, 10, 400, 400);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setVisible(true);
		
		//Label Section Starts
		Calc=new JLabel("Normal Calculator");
		Calc.setBounds(20, 0, 150,30);
		F.add(Calc);
		
		Operator=new JLabel("Operator");
		Operator.setBounds(180, 0, 150, 30);
		F.add(Operator);
		
		Value=new JLabel(" ");
		Value.setBounds(180, 30, 150, 30);
		F.add(Value);
		
		//Button Section Starts
		B1=new JButton("1");
		B1.setBounds(10, 100, 50, 50);
		B1.addActionListener(this);
		F.add(B1);
		
		B2=new JButton("2");
		B2.setBounds(60, 100, 50, 50);
		B2.addActionListener(this);
		F.add(B2);
		
		B3=new JButton("3");
		B3.setBounds(110, 100, 50, 50);
		B3.addActionListener(this);
		F.add(B3);
		
		
		B4=new JButton("4");
		B4.setBounds(10, 150, 50, 50);
		B4.addActionListener(this);
		F.add(B4);
		
		B5=new JButton("5");
		B5.setBounds(60, 150, 50, 50);
		B5.addActionListener(this);
		F.add(B5);
		
		B6=new JButton("6");
		B6.setBounds(110, 150, 50, 50);
		B6.addActionListener(this);
		F.add(B6);
		
		B7=new JButton("7");
		B7.setBounds(10, 200, 50, 50);
		B7.addActionListener(this);
		F.add(B7);
		
		B8=new JButton("8");
		B8.setBounds(60, 200, 50, 50);
		B8.addActionListener(this);
		F.add(B8);
		
		B9=new JButton("9");
		B9.setBounds(110, 200, 50, 50);
		B9.addActionListener(this);
		F.add(B9);
		
		B0=new JButton("0");
		B0.setBounds(10, 250, 50, 50);
		B0.addActionListener(this);
		F.add(B0);
		
		BDot=new JButton(".");
		BDot.setBounds(60, 250, 100, 50);
		BDot.addActionListener(this);
		F.add(BDot);
		
		BAdd=new JButton("+");
		BAdd.setBounds(180, 100, 50, 50);
		BAdd.addActionListener(this);
		F.add(BAdd);
		
		BSub=new JButton("-");
		BSub.setBounds(230, 100, 50, 50);
		BSub.addActionListener(this);
		F.add(BSub);
		
		BMulti=new JButton("x");
		BMulti.setBounds(280, 100, 50, 50);
		BMulti.addActionListener(this);
		F.add(BMulti);
		
		BDiv=new JButton("÷");
		BDiv.setBounds(180,150, 50, 50);
		BDiv.addActionListener(this);
		F.add(BDiv);
		
		BPower=new JButton("^");
		BPower.setBounds(230, 150, 50, 50);
		BPower.addActionListener(this);
		F.add(BPower);
		
		BEqual=new JButton("=");
		BEqual.setBounds(280, 150, 50, 50);
		BEqual.addActionListener(this);
		F.add(BEqual);
		
		
		
		BClear=new JButton("Clear");
		BClear.setBounds(180,200,150, 50);
		BClear.addActionListener(this);
		F.add(BClear);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		//Numeric Buttons
		if(e.getSource().equals(B1)) {
			Value.setText(Value.getText()+"1");
		}
		
		if(e.getSource().equals(B2)) {
			Value.setText(Value.getText()+"2");
		}
		
		if(e.getSource().equals(B3)) {
			Value.setText(Value.getText()+"3");
		}
		
		if(e.getSource().equals(B4)) {
			Value.setText(Value.getText()+"4");
		}
		
		if(e.getSource().equals(B5)) {
			Value.setText(Value.getText()+"5");
		}
		
		if(e.getSource().equals(B6)) {
			Value.setText(Value.getText()+"6");
		}
		
		if(e.getSource().equals(B7)) {
			Value.setText(Value.getText()+"7");
		}
		
		if(e.getSource().equals(B8)) {
			Value.setText(Value.getText()+"8");
		}
		
		if(e.getSource().equals(B9)) {
			Value.setText(Value.getText()+"9");
		}
		
		if(e.getSource().equals(B0)) {
			Value.setText(Value.getText()+"0");
		}
		
		if(e.getSource().equals(BDot)) {	
			if(dotFlag) {
				dotFlag=false;
				Value.setText(Value.getText()+".");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "You can only use '.' once for a number");
			}
		}
		
		
		//Operation Button
		try {
			if(e.getSource().equals(BAdd)) {
				Operation=1;
				number1=Double.parseDouble(Value.getText());
				Operator.setText(Value.getText()+"+");
				Value.setText("");
				dotFlag=true;
			}
			if(e.getSource().equals(BSub)) {
				Operation=2;
				number1=Double.parseDouble(Value.getText());
				Operator.setText(Value.getText()+"-");
				Value.setText("");
				dotFlag=true;
			}
			if(e.getSource().equals(BMulti)) {
				Operation=3;
				number1=Double.parseDouble(Value.getText());
				Operator.setText(Value.getText()+"x");
				Value.setText("");
				dotFlag=true;
			}
			if(e.getSource().equals(BDiv)) {
				Operation=4;
				number1=Double.parseDouble(Value.getText());
				Operator.setText(Value.getText()+"÷");
				Value.setText("");
				dotFlag=true;
			}
			if(e.getSource().equals(BPower)) {
				Operation=5;
				number1=Double.parseDouble(Value.getText());
				Operator.setText(Value.getText()+"^");
				Value.setText("");
				dotFlag=true;
			}
			if(e.getSource().equals(BEqual)) {
				simpleMath();
				Operator.setText("");
				dotFlag=false;
			}
		
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Please Press Button in correct Order");
		}
		
		
		//Clear
		if(e.getSource().equals(BClear)) {
			Operator.setText("");
			Value.setText("");
			dotFlag=true;
			Operation=0;
		}
	}
	
	
	public void simpleMath() {
		
		try {
			switch(Operation) {
			case 1:
				number2=number1+Double.parseDouble(Value.getText());
				Value.setText(""+number2);
				break;
			case 2:
				number2=number1-Double.parseDouble(Value.getText());
				Value.setText(""+number2);
				break;
			case 3:
				number2=number1*Double.parseDouble(Value.getText());
				Value.setText(""+number2);
				break;
			case 4:
				number2=number1/Double.parseDouble(Value.getText());
				Value.setText(""+number2);
				break;
			case 5:
				number2=Math.pow(number1,Double.parseDouble(Value.getText()));
				Value.setText(""+number2);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Wrong Input");
				break;
		
			}
		}
		catch(Exception Ex) {
			JOptionPane.showMessageDialog(null,"Math Error");
		}
	}
}