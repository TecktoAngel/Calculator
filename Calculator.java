package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	
	
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

	public Calculator() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 255, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 218, 39);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		// -----------------Row 1----------------------------------
				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String enterNumber = txtDisplay.getText() + btn7.getText();
						txtDisplay.setText(enterNumber);
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn7.setBounds(9, 117, 50, 50);
				frame.getContentPane().add(btn7);

				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String enterNumber = txtDisplay.getText() + btn8.getText();
						txtDisplay.setText(enterNumber);
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn8.setBounds(66, 117, 50, 50);
				frame.getContentPane().add(btn8);

				JButton btn9 = new JButton("9");
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String enterNumber = txtDisplay.getText() + btn9.getText();
						txtDisplay.setText(enterNumber);
					}
				});
				btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn9.setBounds(122, 117, 50, 50);
				frame.getContentPane().add(btn9);

				JButton btnPlus = new JButton("+");
				btnPlus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstNumber = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "+";
					}
				});
				btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPlus.setBounds(178, 117, 50, 50);
				frame.getContentPane().add(btnPlus);

		// -----------------Row 0----------------------------------
		JButton	btnDelete = new JButton("DEL");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace = null;
				
				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnDelete.setBounds(10, 61, 50, 50);
		frame.getContentPane().add(btnDelete);

		JButton btnNull = new JButton("C");
		btnNull.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnNull.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNull.setBounds(67, 61, 50, 50);
		frame.getContentPane().add(btnNull);

		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPerc.setBounds(123, 61, 50, 50);
		frame.getContentPane().add(btnPerc);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(179, 61, 50, 50);
		frame.getContentPane().add(btnDiv);

		// -----------------Row 2----------------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(9, 171, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(66, 171, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(122, 171, 50, 50);
		frame.getContentPane().add(btn6);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(178, 171, 50, 50);
		frame.getContentPane().add(btnSub);

		// -----------------Row 3----------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(9, 225, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(66, 225, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(122, 225, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(178, 225, 50, 50);
		frame.getContentPane().add(btnMul);

		// -----------------Row 4----------------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(9, 279, 50, 50);
		frame.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtDisplay.getText().contains(".")) {
			        if  (!txtDisplay.getText().equals("")){
			        	String enterDot = txtDisplay.getText() + btnDot.getText();
						txtDisplay.setText(enterDot);
			        }
			    }
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(66, 279, 50, 50);
		frame.getContentPane().add(btnDot);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnPlusMinus.setBounds(122, 279, 50, 50);
		frame.getContentPane().add(btnPlusMinus);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNumber = Double.parseDouble(txtDisplay.getText());
				if (operations == "+") {
					result = firstNumber + secondNumber;
					answer = String.format(java.util.Locale.US,"%.2f", result);
					txtDisplay.setText(answer);
				}
				
				if (operations == "-") {
					result = firstNumber - secondNumber;
					answer = String.format(java.util.Locale.US,"%.2f", result);
					txtDisplay.setText(answer);
				}
				
				if (operations == "*") {
					result = firstNumber * secondNumber;
					answer = String.format(java.util.Locale.US,"%.2f", result);
					txtDisplay.setText(answer);
				}
				
				if (operations == "/") {
					result = firstNumber / secondNumber;
					answer = String.format(java.util.Locale.US,"%.2f", result);
					txtDisplay.setText(answer);
				}
				
				if (operations == "%") {
					result = firstNumber % secondNumber;
					answer = String.format(java.util.Locale.US,"%.2f", result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(178, 279, 50, 50);
		frame.getContentPane().add(btnEqual);

	}
}
