package KP.Ruzuk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EC3 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna12;
	private JSlider sl_putanna13;
	private JSlider sl_putanna14;
	private JSlider sl_putanna15;

	int i_sl_putanna12 = 3;
	int i_sl_putanna13 = 3;
	int i_sl_putanna14 = 3;
	int i_sl_putanna15 = 3;

	SliderListener12 slider12 = new SliderListener12();
	SliderListener13 slider13 = new SliderListener13();
	SliderListener14 slider14 = new SliderListener14();
	SliderListener15 slider15 = new SliderListener15();

	private int i_sl_putanna10 = 3;
	private int i_sl_putanna11 = 3;

	EC3(String s, final int ii_sl_putanna0, final int ii_sl_putanna1, final int ii_sl_putanna2,
			final int ii_sl_putanna3, final int ii_sl_putanna4, final int ii_sl_putanna5, final int ii_sl_putanna6,
			final int ii_sl_putanna7, final int ii_sl_putanna8, final int ii_sl_putanna9, final int ii_sl_putanna10,
			final int ii_sl_putanna11, final int ii_sl_putanna12, final int ii_sl_putanna13, final int ii_sl_putanna14,
			final int ii_sl_putanna15) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.i_sl_putanna12 = ii_sl_putanna12;
		this.i_sl_putanna13 = ii_sl_putanna13;
		this.i_sl_putanna14 = ii_sl_putanna14;
		this.i_sl_putanna15 = ii_sl_putanna15;

		sl_putanna12 = new JSlider(0, 0, 10, i_sl_putanna12);
		sl_putanna12.setMinorTickSpacing(1);
		sl_putanna12.setOpaque(false);
		sl_putanna12.setPaintTicks(true);
		sl_putanna12.setPaintLabels(true);
		sl_putanna12.setBounds(32, 162, 904, 40);
		getContentPane().add(sl_putanna12);

		sl_putanna13 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna13);
		sl_putanna13.setPaintTicks(true);
		sl_putanna13.setPaintLabels(true);
		sl_putanna13.setOpaque(false);
		sl_putanna13.setMinorTickSpacing(1);
		sl_putanna13.setBounds(34, 284, 904, 40);
		getContentPane().add(sl_putanna13);

		sl_putanna14 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna14);
		sl_putanna14.setPaintTicks(true);
		sl_putanna14.setPaintLabels(true);
		sl_putanna14.setOpaque(false);
		sl_putanna14.setMinorTickSpacing(1);
		sl_putanna14.setBounds(32, 371, 904, 40);
		getContentPane().add(sl_putanna14);

		sl_putanna15 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna15);
		sl_putanna15.setPaintTicks(true);
		sl_putanna15.setPaintLabels(true);
		sl_putanna15.setOpaque(false);
		sl_putanna15.setMinorTickSpacing(1);
		sl_putanna15.setBounds(35, 451, 904, 40);
		getContentPane().add(sl_putanna15);

		JLabel label_4 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(7, 200, 102, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(7, 322, 102, 14);
		getContentPane().add(label_5);

		JLabel label_10 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(7, 410, 102, 14);
		getContentPane().add(label_10);

		JLabel label_15 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(10, 494, 102, 14);
		getContentPane().add(label_15);

		JLabel l_putanna0 = new JLabel("Вважаю за краще мати керівниками таких людей, які 6 дозволяли самостійно");
		l_putanna0.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna0.setBounds(32, 99, 907, 34);
		l_putanna0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna0.setForeground(Color.RED);
		getContentPane().add(l_putanna0);

		JLabel l_putanna1 = new JLabel("Поліпшення матеріального становища та службова кар’єра більше залежать");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setBounds(35, 216, 907, 34);
		getContentPane().add(l_putanna1);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setForeground(Color.RED);

		JLabel l_putanna2 = new JLabel("Я сприймаю критичні зауваження на свою адресу з радістю.");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setBounds(32, 334, 907, 34);
		getContentPane().add(l_putanna2);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setForeground(Color.RED);

		JLabel l_putanna3 = new JLabel("Я веду себе однаково на людях та без людей.");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setBounds(35, 422, 907, 34);
		getContentPane().add(l_putanna3);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setForeground(Color.RED);

		JButton b_gotovo = new JButton("\u0413\u043E\u0442\u043E\u0432\u043E\r\n");
		b_gotovo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				switch (ii_sl_putanna10) {
				case 1: {
					i_sl_putanna10 = 5;
				}
					break;
				case 2: {
					i_sl_putanna10 = 4;
				}
					break;
				case 4: {
					i_sl_putanna10 = 2;
				}
					break;
				case 5: {
					i_sl_putanna10 = 1;
				}
					break;
				}

				switch (ii_sl_putanna11) {
				case 1: {
					i_sl_putanna11 = 5;
				}
					break;
				case 2: {
					i_sl_putanna11 = 4;
				}
					break;
				case 4: {
					i_sl_putanna11 = 2;
				}
					break;
				case 5: {
					i_sl_putanna11 = 1;
				}
					break;
				}

				switch (i_sl_putanna14) {
				case 1: {
					i_sl_putanna14 = 5;
				}
					break;
				case 2: {
					i_sl_putanna14 = 4;
				}
					break;
				case 4: {
					i_sl_putanna14 = 2;
				}
					break;
				case 5: {
					i_sl_putanna14 = 1;
				}
					break;
				}

				int indekator_komanda, indekator_temperament, indekator_trener, indekator_balans,
						indekator_dostovirnosti = 0;

				double komanda = (ii_sl_putanna0 + ii_sl_putanna1 + ii_sl_putanna2 + ii_sl_putanna3) / 4;

				if (komanda >= 3) {
					indekator_komanda = 1;
				} else {
					indekator_komanda = 0;
				}

				double temperament = (ii_sl_putanna0 + ii_sl_putanna1 + ii_sl_putanna2 + ii_sl_putanna3 + ii_sl_putanna4
						+ ii_sl_putanna5 + ii_sl_putanna6 + ii_sl_putanna7 + ii_sl_putanna8 + ii_sl_putanna9
						+ i_sl_putanna10 + i_sl_putanna11 + i_sl_putanna12 + i_sl_putanna13 + i_sl_putanna14
						+ i_sl_putanna15) / 16;

				if (temperament >= 3) {
					indekator_temperament = 1;
				} else {
					indekator_temperament = 0;
				}

				double trener = (ii_sl_putanna8 + ii_sl_putanna9 + i_sl_putanna10 + i_sl_putanna11) / 4;

				if (trener >= 3) {
					indekator_trener = 1;
				} else {
					indekator_trener = 0;
				}

				double balans = (i_sl_putanna12 + i_sl_putanna13 + i_sl_putanna14 + i_sl_putanna15) / 4;

				if (balans >= 3) {
					indekator_balans = 1;
				} else {
					indekator_balans = 0;
				}

				String rezultat = "";
				String rezultat1 = "";

				if (ii_sl_putanna0 == 3 && ii_sl_putanna1 == 3 && ii_sl_putanna2 == 3 && ii_sl_putanna3 == 3
						&& ii_sl_putanna4 == 3 && ii_sl_putanna5 == 3 && ii_sl_putanna6 == 3 && ii_sl_putanna7 == 3
						&& ii_sl_putanna8 == 3 && ii_sl_putanna9 == 3 && i_sl_putanna10 == 3 && i_sl_putanna11 == 3
						&& i_sl_putanna12 == 3 && i_sl_putanna13 == 3 && i_sl_putanna14 == 3 && i_sl_putanna15 == 3) {
					int type2 = JOptionPane.WARNING_MESSAGE;
					JOptionPane.showMessageDialog(null, "�������! �� ������ ������� ����.", null, type2);

				} else {

					if (indekator_komanda == 1) {
						if (indekator_temperament == 1) {
							if (indekator_trener == 1) {
								if (indekator_balans == 1) {
									rezultat = "��� �������� �������� �����";
								} else {
									rezultat = "��� �������� �������� ���������, ������,";
									rezultat1 = "��������, �������";
								}
							} else {
								if (indekator_balans == 1) {
									rezultat = "��� �������� �������� ����������";
								} else {
									rezultat = "��� �������� �������� ��������";
								}
							}
						} else {
							if (indekator_trener == 1) {
								if (indekator_balans == 1) {
									rezultat = "��� �������� �������� �����";
								} else {
									rezultat = "��� �������� �������� ���������, ������,";
									rezultat1 = "��������, �������";
								}
							} else {
								if (indekator_balans == 1) {
									rezultat = "��� �������� �������� �������";
								} else {
									rezultat = "��� �������� �������� ������, ���������";
								}
							}
						}
					} else {
						if (indekator_temperament == 1) {
							if (indekator_trener == 1) {
								if (indekator_balans == 1) {
									rezultat = "��� �������� �������� ����� ��������,";
									rezultat1 = "���������, ����� �����, ����������";
								} else {
									rezultat = "��� �������� �������� ����� ��������, ��������";
								}
							} else {
								if (indekator_balans == 1) {
									rezultat = "��� �������� �������� ����� ��������,";
									rezultat1 = "���������, ����� �����, ����������";
								} else {
									rezultat = "��� �������� �������� ����� ��������, ��������";
								}
							}
						} else {
							if (indekator_trener == 1) {
								if (indekator_balans == 1) {
									rezultat = "��� �������� �������� ���������, ������� �������";
								} else {
									rezultat = "��� �������� �������� ����� ���������, ����";
								}
							} else {
								if (indekator_balans == 1) {
									rezultat = "��� �������� �������� ������������ �����";
								} else {
									rezultat = "��� �������� �������� ����, �������, ����������";
								}
							}
						}
					}

					int dostovirnist = 0;

					if ((ii_sl_putanna0 == 1 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 5 && ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 5)
							|| (ii_sl_putanna0 == 5 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna4 == 1 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 5 && ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 5)
							|| (ii_sl_putanna4 == 5 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna8 == 1 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 5 && i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 5)
							|| (ii_sl_putanna8 == 5 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 1)) {
						dostovirnist++;
					}
					if ((i_sl_putanna12 == 1 && i_sl_putanna13 == 5 && i_sl_putanna14 == 5 && i_sl_putanna15 == 5)
							|| (i_sl_putanna12 == 5 && i_sl_putanna13 == 1 && i_sl_putanna14 == 5
									&& i_sl_putanna15 == 5)
							|| (i_sl_putanna12 == 5 && i_sl_putanna13 == 5 && i_sl_putanna14 == 1
									&& i_sl_putanna15 == 5)
							|| (i_sl_putanna12 == 5 && i_sl_putanna13 == 5 && i_sl_putanna14 == 5
									&& i_sl_putanna15 == 1)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna0 == 5 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 1 && ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 5 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 5
									&& ii_sl_putanna3 == 1)
							|| (ii_sl_putanna0 == 1 && ii_sl_putanna1 == 1 && ii_sl_putanna2 == 1
									&& ii_sl_putanna3 == 5)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna4 == 5 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 1 && ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 5 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 5
									&& ii_sl_putanna7 == 1)
							|| (ii_sl_putanna4 == 1 && ii_sl_putanna5 == 1 && ii_sl_putanna6 == 1
									&& ii_sl_putanna7 == 5)) {
						dostovirnist++;
					}
					if ((ii_sl_putanna8 == 5 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 1 && i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 5 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 5
									&& i_sl_putanna11 == 1)
							|| (ii_sl_putanna8 == 1 && ii_sl_putanna9 == 1 && i_sl_putanna10 == 1
									&& i_sl_putanna11 == 5)) {
						dostovirnist++;
					}
					if ((i_sl_putanna12 == 5 && i_sl_putanna13 == 1 && i_sl_putanna14 == 1 && i_sl_putanna15 == 1)
							|| (i_sl_putanna12 == 1 && i_sl_putanna13 == 5 && i_sl_putanna14 == 1
									&& i_sl_putanna15 == 1)
							|| (i_sl_putanna12 == 1 && i_sl_putanna13 == 1 && i_sl_putanna14 == 5
									&& i_sl_putanna15 == 1)
							|| (i_sl_putanna12 == 1 && i_sl_putanna13 == 1 && i_sl_putanna14 == 1
									&& i_sl_putanna15 == 5)) {
						dostovirnist++;
					}

					if (ii_sl_putanna0 == 3 && ii_sl_putanna1 == 3 && ii_sl_putanna2 == 3 && ii_sl_putanna3 == 3) {
						dostovirnist++;
					}

					if (ii_sl_putanna4 == 3 && ii_sl_putanna5 == 3 && ii_sl_putanna6 == 3 && ii_sl_putanna7 == 3) {
						dostovirnist++;
					}

					if (ii_sl_putanna8 == 3 && ii_sl_putanna9 == 3 && i_sl_putanna10 == 3 && i_sl_putanna11 == 3) {
						dostovirnist++;
					}
					if (i_sl_putanna12 == 3 && i_sl_putanna13 == 3 && i_sl_putanna14 == 3 && i_sl_putanna15 == 3) {
						dostovirnist++;
					}

					if (dostovirnist >= 3) {
						indekator_dostovirnosti = 2;
					}
					if (dostovirnist == 1 || dostovirnist == 2) {
						indekator_dostovirnosti = 1;
					}
					dostovirnist = 0;
					new EC_rezultat(rezultat, rezultat1, indekator_dostovirnosti);
					setVisible(false);
				}
			}
		});
		b_gotovo.setBounds(484, 517, 498, 36);
		getContentPane().add(b_gotovo);

		JButton b_nazad1 = new JButton("Назад");
		b_nazad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC2("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, ii_sl_putanna10,
						ii_sl_putanna11, i_sl_putanna12, i_sl_putanna13, i_sl_putanna14, i_sl_putanna15);
				setVisible(false);

			}
		});
		b_nazad1.setBounds(0, 517, 486, 36);
		getContentPane().add(b_nazad1);

		JLabel label = new JLabel("Чи здатні Ви ризикувати ?");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.GREEN);
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		label.setBounds(0, 0, 982, 50);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Вам варто пройти опитування");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 49, 982, 14);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Спробуйте якомога точніше давати відповіді на запитання");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 69, 982, 14);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("точно - так");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(826, 494, 116, 14);
		getContentPane().add(label_3);

		JLabel label_6 = new JLabel("точно - так");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(823, 410, 116, 14);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("точно - так");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(823, 322, 116, 14);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("точно - так");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(823, 200, 116, 14);
		getContentPane().add(label_8);

		JLabel label_9 = new JLabel("визначати спосіб виконання тієї чи іншої роботи.");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_9.setBounds(32, 132, 907, 34);
		getContentPane().add(label_9);

		JLabel label_11 = new JLabel("від щасливого збігу обставин, ніж від старанності самого працівника.");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_11.setBounds(35, 250, 907, 34);
		getContentPane().add(label_11);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("res/fon/EC3.png"));
		label_20.setBounds(-10, 0, 992, 553);
		getContentPane().add(label_20);

		setVisible(true);

		sl_putanna12.addChangeListener(slider12);
		sl_putanna13.addChangeListener(slider13);
		sl_putanna14.addChangeListener(slider14);
		sl_putanna15.addChangeListener(slider15);

	}

	class SliderListener12 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna12 = (JSlider) e.getSource();
			i_sl_putanna12 = (int) sl_putanna12.getValue();
		}
	}

	class SliderListener13 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna13 = (JSlider) e.getSource();
			i_sl_putanna13 = (int) sl_putanna13.getValue();
		}
	}

	class SliderListener14 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna14 = (JSlider) e.getSource();
			i_sl_putanna14 = (int) sl_putanna14.getValue();
		}
	}

	class SliderListener15 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna15 = (JSlider) e.getSource();
			i_sl_putanna15 = (int) sl_putanna15.getValue();
		}
	}

}
