package Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 428, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(0, 0, 410, 118);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("MC");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(0, 129, 74, 65);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMr = new JButton("MR");
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMr.setBounds(84, 129, 74, 65);
		frame.getContentPane().add(btnMr);
		
		JButton btnMs = new JButton("MS");
		btnMs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMs.setBounds(168, 129, 74, 65);
		frame.getContentPane().add(btnMs);
		
		JButton btnM = new JButton("M+");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnM.setBounds(252, 129, 74, 65);
		frame.getContentPane().add(btnM);
		
		JButton btnM_1 = new JButton("M-");
		btnM_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnM_1.setBounds(336, 129, 74, 65);
		frame.getContentPane().add(btnM_1);
		
		JButton button_Backspace = new JButton("<--");
		button_Backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		button_Backspace.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Backspace.setBounds(0, 205, 74, 65);
		frame.getContentPane().add(button_Backspace);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCe.setBounds(84, 205, 74, 65);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnC.setBounds(168, 205, 74, 65);
		frame.getContentPane().add(btnC);
		
		JButton button_Rounding = new JButton("+-");
		button_Rounding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		button_Rounding.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Rounding.setBounds(252, 205, 74, 65);
		frame.getContentPane().add(button_Rounding);
		
		JButton btnSquareRoot = new JButton("square root");
		btnSquareRoot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSquareRoot.setBounds(336, 205, 74, 65);
		frame.getContentPane().add(btnSquareRoot);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + button_7.getText();
				textField.setText(EnterNumber );
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_7.setBounds(0, 281, 74, 65);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_8.getText();
				textField.setText(EnterNumber );
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_8.setBounds(84, 281, 74, 65);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_9.getText();
				textField.setText(EnterNumber );
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_9.setBounds(168, 281, 74, 65);
		frame.getContentPane().add(button_9);
		
		JButton button_Division = new JButton("/");
		button_Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		button_Division.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Division.setBounds(252, 281, 74, 65);
		frame.getContentPane().add(button_Division);
		
		JButton button_Percentage = new JButton("%");
		button_Percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		button_Percentage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Percentage.setBounds(336, 281, 74, 65);
		frame.getContentPane().add(button_Percentage);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_4.getText();
				textField.setText(EnterNumber );
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_4.setBounds(0, 357, 74, 65);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_5.getText();
				textField.setText(EnterNumber );
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_5.setBounds(84, 357, 74, 65);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_6.getText();
				textField.setText(EnterNumber );
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_6.setBounds(168, 357, 74, 65);
		frame.getContentPane().add(button_6);
		
		JButton button_Multiplication = new JButton("*");
		button_Multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		button_Multiplication.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Multiplication.setBounds(252, 357, 74, 65);
		frame.getContentPane().add(button_Multiplication);
		
		JButton button_InverseX = new JButton("1/x");
		button_InverseX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_InverseX.setBounds(336, 357, 74, 65);
		frame.getContentPane().add(button_InverseX);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_1.getText();
				textField.setText(EnterNumber );
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_1.setBounds(0, 433, 74, 65);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_2.getText();
				textField.setText(EnterNumber );
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_2.setBounds(84, 433, 74, 65);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_3.getText();
				textField.setText(EnterNumber );
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_3.setBounds(168, 433, 74, 65);
		frame.getContentPane().add(button_3);
		
		JButton button_Minus = new JButton("-");
		button_Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		button_Minus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Minus.setBounds(252, 433, 74, 65);
		frame.getContentPane().add(button_Minus);
		
		JButton button_Equals = new JButton("=");
		button_Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum = Double.parseDouble(textField.getText());
				if (operations == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		button_Equals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Equals.setBounds(336, 433, 74, 141);
		frame.getContentPane().add(button_Equals);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_0.getText();
				textField.setText(EnterNumber );
			}
		});
		button_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_0.setBounds(0, 509, 158, 65);
		frame.getContentPane().add(button_0);
		
		JButton button_Comma = new JButton(",");
		button_Comma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Comma.setBounds(168, 509, 74, 65);
		frame.getContentPane().add(button_Comma);
		
		JButton button_Plus = new JButton("+");
		button_Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		button_Plus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_Plus.setBounds(252, 509, 74, 65);
		frame.getContentPane().add(button_Plus);
	}
}
