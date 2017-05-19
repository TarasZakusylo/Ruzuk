package KP.Ruzuk;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EC_4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_Prubutku;
	private JTextField textField_Vutratu;
	private JTextField textField_ZminniVutratu;
	private JTextField textField_ZminaRunky;
	private JTextField textField_DopystumiVutratu;
	private JTextField textField_KilkistVtrat0;
	private JTextField textField_KilkistVtrat1;
	private JTextField textField_KilkistVtrat2;
	private JTextField textField_KilkistVtrat4;
	private JTextField textField_KilkistVtrat3;
	private Choice choice_ZminniVutratu;

	public EC_4(final int i_ruzuk, final int i_oderejnist, final int i_dovira) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Dali = new JButton("Далі");
		b_Dali.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 26));
		b_Dali.setForeground(Color.GREEN);
		b_Dali.addActionListener(new ActionListener() {

			private String s_ZminniVutratu;
			private double d_Prubutku;
			private double d_ZminaRunky;
			private double d_ZminniVutratu;
			private double d_Vutratu;
			private double d_textField_KilkistVtrat1;
			private double d_DopystumiVutratu;
			private double d_textField_KilkistVtrat3;
			private double d_textField_KilkistVtrat0;
			private double d_textField_KilkistVtrat2;
			private double d_textField_KilkistVtrat4;

			public void actionPerformed(ActionEvent e) {
				try {
					s_ZminniVutratu = choice_ZminniVutratu.getSelectedItem();
					d_Prubutku = Double.parseDouble(textField_Prubutku.getText());
					d_Vutratu = Double.parseDouble(textField_Vutratu.getText());
					d_ZminniVutratu = Double.parseDouble(textField_ZminniVutratu.getText());
					d_ZminaRunky = Double.parseDouble(textField_ZminaRunky.getText());
					d_DopystumiVutratu = Double.parseDouble(textField_DopystumiVutratu.getText());
					d_textField_KilkistVtrat0 = Double.parseDouble(textField_KilkistVtrat0.getText());
					d_textField_KilkistVtrat1 = Double.parseDouble(textField_KilkistVtrat1.getText());
					d_textField_KilkistVtrat2 = Double.parseDouble(textField_KilkistVtrat2.getText());
					d_textField_KilkistVtrat3 = Double.parseDouble(textField_KilkistVtrat3.getText());
					d_textField_KilkistVtrat4 = Double.parseDouble(textField_KilkistVtrat4.getText());

					if (d_Prubutku < 0 || d_Vutratu < 0 || d_ZminniVutratu < 0 || d_ZminaRunky < -999
							|| d_ZminaRunky > 999 || d_DopystumiVutratu < 0 || d_DopystumiVutratu > 100
							|| d_textField_KilkistVtrat0 < 0 || d_textField_KilkistVtrat1 < 0
							|| d_textField_KilkistVtrat2 < 0 || d_textField_KilkistVtrat3 < 0
							|| d_textField_KilkistVtrat4 < 0) {
						JOptionPane.showMessageDialog(null, "Неможливе введення, перевірте");
					} else {
						if (s_ZminniVutratu.equals("Абсолютне значення")) {
							d_ZminniVutratu = (d_Prubutku * d_ZminniVutratu) / 100;
						}
						double d_MunyliZminiVutratu = (d_Prubutku * d_ZminniVutratu) / 100;
						double d_ZagalniVutratu = d_MunyliZminiVutratu + d_Vutratu;
						double d_CustuyPrubutok = d_Prubutku - d_ZagalniVutratu;
						double d_MaybutnaRealizacia = d_Prubutku - ((d_ZminaRunky * d_Prubutku) / 100);
						double d_MaybutniZminiVutratu = (d_ZminniVutratu * d_MaybutnaRealizacia) / 100;
						double d_MaybutniZagalnaVutratu = d_MaybutniZminiVutratu + d_Vutratu;
						double d_MaybutniyPrubytok = d_MaybutnaRealizacia - d_MaybutniZagalnaVutratu;

						double d_S0 = d_textField_KilkistVtrat0 * 5;
						double d_S1 = (d_textField_KilkistVtrat0 + d_textField_KilkistVtrat1) * 10;
						double d_S2 = (d_textField_KilkistVtrat1 + d_textField_KilkistVtrat2) * 10;
						double d_S3 = (d_textField_KilkistVtrat2 + d_textField_KilkistVtrat3) * 10;
						double d_S4 = (d_textField_KilkistVtrat3 + d_textField_KilkistVtrat4) * 10;
						double d_S5 = d_textField_KilkistVtrat4 * 5;

						double d_S_Zagalno = d_S0 + d_S1 + d_S2 + d_S3 + d_S4 + d_S5;
						double d_S_2 = 0;

						if (d_DopystumiVutratu == 0) {
							d_S_2 = d_S_Zagalno;
						}
						if (d_DopystumiVutratu > 0 && d_DopystumiVutratu < 10) {
							d_S_2 = d_S_Zagalno
									- ((((d_DopystumiVutratu * d_textField_KilkistVtrat0) / 10) * d_DopystumiVutratu)
											/ 2);
						}
						if (d_DopystumiVutratu == 10) {
							d_S_2 = d_S_Zagalno - d_S0;
						}
						if (d_DopystumiVutratu > 10 && d_DopystumiVutratu < 30) {
							d_S_2 = (((((d_DopystumiVutratu * (d_textField_KilkistVtrat1 - d_textField_KilkistVtrat0))
									/ 20) + d_textField_KilkistVtrat0) + d_textField_KilkistVtrat1)
									/ (30 - d_DopystumiVutratu)) + d_S2 + d_S3 + d_S4 + d_S5;
						}
						if (d_DopystumiVutratu == 30) {
							d_S_2 = d_S_Zagalno - d_S0 - d_S1;
						}
						if (d_DopystumiVutratu > 30 && d_DopystumiVutratu < 50) {
							d_S_2 = (((((d_DopystumiVutratu * (d_textField_KilkistVtrat2 - d_textField_KilkistVtrat1))
									/ 20) + d_textField_KilkistVtrat1) + d_textField_KilkistVtrat2)
									/ (50 - d_DopystumiVutratu)) + d_S3 + d_S4 + d_S5;
						}
						if (d_DopystumiVutratu == 50) {
							d_S_2 = d_S3 + d_S4 + d_S5;
						}
						if (d_DopystumiVutratu > 50 && d_DopystumiVutratu < 70) {
							d_S_2 = (((((d_DopystumiVutratu * (d_textField_KilkistVtrat3 - d_textField_KilkistVtrat2))
									/ 20) + d_textField_KilkistVtrat2) + d_textField_KilkistVtrat3)
									/ (70 - d_DopystumiVutratu)) + d_S4 + d_S5;
						}
						if (d_DopystumiVutratu == 70) {
							d_S_2 = d_S4 + d_S5;
						}
						if (d_DopystumiVutratu > 70 && d_DopystumiVutratu < 90) {
							d_S_2 = (((((d_DopystumiVutratu * (d_textField_KilkistVtrat4 - d_textField_KilkistVtrat3))
									/ 20) + d_textField_KilkistVtrat3) + d_textField_KilkistVtrat4)
									/ (90 - d_DopystumiVutratu)) + d_S5;
						}
						if (d_DopystumiVutratu == 90) {
							d_S_2 = d_S5;
						}
						if (d_DopystumiVutratu > 90 && d_DopystumiVutratu < 100) {
							d_S_2 = ((((100 - d_DopystumiVutratu) * d_textField_KilkistVtrat4) / 100)
									* (100 - d_DopystumiVutratu)) / 2;
						}
						if (d_DopystumiVutratu == 100) {
							d_S_2 = 0;
						}

						double d_Ruzuk = (d_S_2 / (d_S_Zagalno + d_S_2)) * 120;
						System.out.println("d_S_Zagalno " + d_S_Zagalno);
						System.out.println("d_S_2 " + d_S_2);
						System.out.println("d_Ruzuk " + d_Ruzuk);

						new EC_Rezultatu(i_ruzuk, i_oderejnist, i_dovira, d_CustuyPrubutok, d_MaybutniyPrubytok,
								d_Ruzuk);
						setVisible(false);
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Помилкове введення, перевірте");
				}
			}
		});
		b_Dali.setBounds(12, 493, 458, 46);
		getContentPane().add(b_Dali);

		JLabel l_Hapka = new JLabel("Вкажіть параметри Вашої підприємницької діяльності :");
		l_Hapka.setForeground(Color.GREEN);
		l_Hapka.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(0, 0, 982, 46);
		getContentPane().add(l_Hapka);

		JLabel l_Prubutku = new JLabel("Прибутки");
		l_Prubutku.setForeground(Color.YELLOW);
		l_Prubutku.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_Prubutku.setBounds(12, 61, 310, 27);
		getContentPane().add(l_Prubutku);

		textField_Prubutku = new JTextField();
		textField_Prubutku.setBounds(348, 66, 65, 22);
		getContentPane().add(textField_Prubutku);
		textField_Prubutku.setColumns(10);

		textField_Vutratu = new JTextField();
		textField_Vutratu.setColumns(10);
		textField_Vutratu.setBounds(348, 115, 65, 22);
		getContentPane().add(textField_Vutratu);

		choice_ZminniVutratu = new Choice();
		choice_ZminniVutratu.setBounds(175, 163, 147, 22);
		getContentPane().add(choice_ZminniVutratu);
		choice_ZminniVutratu.add("Відносне значення");
		choice_ZminniVutratu.add("Абсолютне значення");

		JLabel l_Vutratu = new JLabel("Витрати");
		l_Vutratu.setForeground(Color.YELLOW);
		l_Vutratu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_Vutratu.setBounds(12, 110, 310, 27);
		getContentPane().add(l_Vutratu);

		JLabel l_ZminniVutratu = new JLabel("Змінні витрати");
		l_ZminniVutratu.setForeground(Color.YELLOW);
		l_ZminniVutratu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_ZminniVutratu.setBounds(12, 158, 310, 27);
		getContentPane().add(l_ZminniVutratu);

		textField_ZminniVutratu = new JTextField();
		textField_ZminniVutratu.setColumns(10);
		textField_ZminniVutratu.setBounds(348, 163, 65, 22);
		getContentPane().add(textField_ZminniVutratu);

		JLabel l_ZminaRunky = new JLabel("Прогнозована зміна ринку");
		l_ZminaRunky.setForeground(Color.YELLOW);
		l_ZminaRunky.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_ZminaRunky.setBounds(12, 203, 310, 27);
		getContentPane().add(l_ZminaRunky);

		textField_ZminaRunky = new JTextField();
		textField_ZminaRunky.setColumns(10);
		textField_ZminaRunky.setBounds(348, 208, 65, 22);
		getContentPane().add(textField_ZminaRunky);

		JLabel l_OdunuciVumir0 = new JLabel("грн.");
		l_OdunuciVumir0.setForeground(Color.YELLOW);
		l_OdunuciVumir0.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_OdunuciVumir0.setBounds(425, 66, 62, 27);
		getContentPane().add(l_OdunuciVumir0);

		JLabel l_OdunuciVumir1 = new JLabel("грн.");
		l_OdunuciVumir1.setForeground(Color.YELLOW);
		l_OdunuciVumir1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_OdunuciVumir1.setBounds(425, 118, 62, 27);
		getContentPane().add(l_OdunuciVumir1);

		JLabel l_OdunuciVumir3 = new JLabel("%");
		l_OdunuciVumir3.setForeground(Color.YELLOW);
		l_OdunuciVumir3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_OdunuciVumir3.setBounds(425, 208, 62, 27);
		getContentPane().add(l_OdunuciVumir3);

		JLabel l_OdunuciVumir2 = new JLabel("грн. / %");
		l_OdunuciVumir2.setForeground(Color.YELLOW);
		l_OdunuciVumir2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_OdunuciVumir2.setBounds(425, 163, 62, 27);
		getContentPane().add(l_OdunuciVumir2);

		JLabel l_DopystumiVutratu = new JLabel("Допустимий рівень витрат");
		l_DopystumiVutratu.setForeground(Color.YELLOW);
		l_DopystumiVutratu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_DopystumiVutratu.setBounds(12, 248, 310, 27);
		getContentPane().add(l_DopystumiVutratu);

		textField_DopystumiVutratu = new JTextField();
		textField_DopystumiVutratu.setColumns(10);
		textField_DopystumiVutratu.setBounds(348, 253, 65, 22);
		getContentPane().add(textField_DopystumiVutratu);

		JLabel l_OdunuciVumir4 = new JLabel("%");
		l_OdunuciVumir4.setForeground(Color.YELLOW);
		l_OdunuciVumir4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_OdunuciVumir4.setBounds(425, 253, 62, 27);
		getContentPane().add(l_OdunuciVumir4);

		JLabel l_KilkistVtrat0 = new JLabel("Вкажіть кількість втрат прибутку, що близькі 10 %");
		l_KilkistVtrat0.setForeground(Color.YELLOW);
		l_KilkistVtrat0.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_KilkistVtrat0.setBounds(12, 293, 336, 27);
		getContentPane().add(l_KilkistVtrat0);

		textField_KilkistVtrat0 = new JTextField();
		textField_KilkistVtrat0.setColumns(10);
		textField_KilkistVtrat0.setBounds(348, 298, 65, 22);
		getContentPane().add(textField_KilkistVtrat0);

		JLabel l_KilkistVtrat1 = new JLabel("Вкажіть кількість втрат прибутку, що близькі 30 %");
		l_KilkistVtrat1.setForeground(Color.YELLOW);
		l_KilkistVtrat1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_KilkistVtrat1.setBounds(12, 333, 336, 27);
		getContentPane().add(l_KilkistVtrat1);

		textField_KilkistVtrat1 = new JTextField();
		textField_KilkistVtrat1.setColumns(10);
		textField_KilkistVtrat1.setBounds(348, 338, 65, 22);
		getContentPane().add(textField_KilkistVtrat1);

		JLabel l_KilkistVtrat2 = new JLabel("Вкажіть кількість втрат прибутку, що близькі 50 %");
		l_KilkistVtrat2.setForeground(Color.YELLOW);
		l_KilkistVtrat2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_KilkistVtrat2.setBounds(12, 373, 336, 27);
		getContentPane().add(l_KilkistVtrat2);

		textField_KilkistVtrat2 = new JTextField();
		textField_KilkistVtrat2.setColumns(10);
		textField_KilkistVtrat2.setBounds(348, 378, 65, 22);
		getContentPane().add(textField_KilkistVtrat2);

		JLabel l_KilkistVtrat4 = new JLabel("Вкажіть кількість втрат прибутку, що близькі 90 %");
		l_KilkistVtrat4.setForeground(Color.YELLOW);
		l_KilkistVtrat4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_KilkistVtrat4.setBounds(12, 453, 336, 27);
		getContentPane().add(l_KilkistVtrat4);

		textField_KilkistVtrat4 = new JTextField();
		textField_KilkistVtrat4.setColumns(10);
		textField_KilkistVtrat4.setBounds(348, 458, 65, 22);
		getContentPane().add(textField_KilkistVtrat4);

		JLabel l_KilkistVtrat3 = new JLabel("Вкажіть кількість втрат прибутку, що близькі 70 %");
		l_KilkistVtrat3.setForeground(Color.YELLOW);
		l_KilkistVtrat3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l_KilkistVtrat3.setBounds(12, 413, 336, 27);
		getContentPane().add(l_KilkistVtrat3);

		textField_KilkistVtrat3 = new JTextField();
		textField_KilkistVtrat3.setColumns(10);
		textField_KilkistVtrat3.setBounds(348, 420, 65, 22);
		getContentPane().add(textField_KilkistVtrat3);

		JLabel l_kartunka = new JLabel("");
		l_kartunka.setIcon(new ImageIcon("res/EC4_kartunka.png"));
		l_kartunka.setBounds(482, 53, 500, 500);
		getContentPane().add(l_kartunka);

		JLabel l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("res/fon/EC4.jpg"));
		l_fon.setBounds(0, 0, 982, 553);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
