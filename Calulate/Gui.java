import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField answerField;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero,
			add, multiply, div, equls, minus;
	private String stemp1, stemp2, sanswer;
	private Double answer = 0.0;
	private JPanel contentpanel;
	private boolean equlsClicked = false;
	private boolean opChosen = false;
	private String sign;

	char operation = ' ';

	public Gui() {
		super("Calculator");

		answerField = new JTextField(null, 20);
		answerField.setEditable(false);

		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		div = new JButton("/");
		equls = new JButton("=");

		Calc c = new Calc();
		Numbers n = new Numbers();

		one.addActionListener(n);
		two.addActionListener(n);
		three.addActionListener(n);
		four.addActionListener(n);
		five.addActionListener(n);
		six.addActionListener(n);
		seven.addActionListener(n);
		eight.addActionListener(n);
		nine.addActionListener(n);
		zero.addActionListener(n);

		// Dla drugiego actionlistnera 
		add.addActionListener(c);
		minus.addActionListener(c);
		multiply.addActionListener(c);
		div.addActionListener(c);
		equls.addActionListener(c);

		contentpanel = new JPanel();
		contentpanel.setBounds(50, 50, 500, 400);
		contentpanel.setSize(500, 400);
		contentpanel.setBackground(Color.ORANGE);
		contentpanel.setLayout(new FlowLayout());

		contentpanel.add(answerField, BorderLayout.NORTH);
		contentpanel.add(one);
		contentpanel.add(two);
		contentpanel.add(three);
		contentpanel.add(four);
		contentpanel.add(five);
		contentpanel.add(six);
		contentpanel.add(seven);
		contentpanel.add(eight);
		contentpanel.add(nine);
		contentpanel.add(zero);
		contentpanel.add(add);
		contentpanel.add(minus);
		contentpanel.add(multiply);
		contentpanel.add(div);
		contentpanel.add(equls);

		this.setContentPane(contentpanel);

	}

	private class Numbers implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton src = (JButton) event.getSource();
			if (src.equals(one)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "1";
					} else {
						stemp1 = stemp1 + "1";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "1";
					} else {
						stemp2 = stemp2 + "1";
					}
				}
			}
			if (src.equals(two)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "2";
					} else {
						stemp1 = stemp1 + "2";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "2";
					} else {
						stemp2 = stemp2 + "2";
					}
				}
			}
			if (src.equals(zero)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "0";
					} else {
						stemp1 = stemp1 + "0";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "0";
					} else {
						stemp2 = stemp2 + "0";
					}
				}
			}
			if (src.equals(nine)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "9";
					} else {
						stemp1 = stemp1 + "9";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "9";
					} else {
						stemp2 = stemp2 + "9";
					}
				}
			}
			if (src.equals(three)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "3";
					} else {
						stemp1 = stemp1 + "3";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "3";
					} else {
						stemp2 = stemp2 + "3";
					}
				}
			}
			if (src.equals(four)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "4";
					} else {
						stemp1 = stemp1 + "4";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "4";
					} else {
						stemp2 = stemp2 + "4";
					}
				}
			}
			if (src.equals(five)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "5";
					} else {
						stemp1 = stemp1 + "5";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "5";
					} else {
						stemp2 = stemp2 + "5";
					}
				}
			}
			if (src.equals(six)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "6";
					} else {
						stemp1 = stemp1 + "6";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "6";
					} else {
						stemp2 = stemp2 + "6";
					}
				}
			}
			if (src.equals(seven)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "7";
					} else {
						stemp1 = stemp1 + "7";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "7";
					} else {
						stemp2 = stemp2 + "7";
					}
				}
			}
			if (src.equals(eight)) {
				if (opChosen == false) {
					if (stemp1 == null) {
						stemp1 = "8";
					} else {
						stemp1 = stemp1 + "8";
					}
				} else {
					if (stemp2 == null) {
						stemp2 = "8";
					} else {
						stemp2 = stemp2 + "8";
					}
				}
			}
			if (equlsClicked == false) {
				if (opChosen == false) {
					answerField.setText(stemp1);
				} else {
					answerField.setText(stemp2);
				}
			}

		}
	}

	private class Calc implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			JButton src = (JButton) event.getSource();
			if (src.equals(add)) {
				if (stemp1 == null) {
					System.out.println("Chose you number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '+';
					} else {
						if (stemp1 != null && stemp2 != null) {
							System.out.println("you take both ! ");
						}
					}
				}

			}
			if (src.equals(minus)) {
				if (stemp1 == null) {
					System.out.println("Chose you number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '-';
					} else {
						if (stemp1 != null && stemp2 != null) {
							System.out.println("you take both ! ");
						}
					}
				}
			}
			if (src.equals(multiply)) {
				if (stemp1 == null) {
					System.out.println("Chose you number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '*';
					} else {
						if (stemp1 != null && stemp2 != null) {
							System.out.println("you take both ! ");
						}
					}
				}
			}
			if (src.equals(div)) {
				if (stemp1 == null) {
					System.out.println("Chose you number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '/';
					} else {
						if (stemp1 != null && stemp2 != null) {
							System.out.println("you take both ! ");
						}
					}
				}
			}
			if (src.equals(equls)) {
				if (stemp1 == null) {
					System.out.println("Chose you number first");
				} else {
					if (stemp1 != null && stemp2 == null) {
						System.out.println("Chose both nums");
					}
					if (stemp1 != null && stemp2 != null) {
						double d1 = 0.0;
						double d2 = 0.0;

						d1 = Double.parseDouble(stemp1);
						d2 = Double.parseDouble(stemp2);

						switch (operation) {
						case '+':
							answer = d1 + d2;
							break;
						case '-':
							answer = d1 - d2;
							break;
						case '*':
							answer = d1 * d2;
							break;
						case '/':
							answer = d1 / d2;
							break;
						}
						sanswer = Double.toString(answer);
						answerField.setText(sanswer);
					}
				}

			}
		}
	}

}
