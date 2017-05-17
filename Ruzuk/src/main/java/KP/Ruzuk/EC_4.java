package KP.Ruzuk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Choice;

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

	public EC_4(int i_ruzuk, int i_oderejnist, int i_dovira) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Dali = new JButton("Далі");
		b_Dali.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 26));
		b_Dali.setForeground(Color.GREEN);
		b_Dali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
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

		Choice choice_ZminniVutratu = new Choice();
		choice_ZminniVutratu.setBounds(175, 163, 147, 22);
		getContentPane().add(choice_ZminniVutratu);
		choice_ZminniVutratu.add("Абсолютне значення");
		choice_ZminniVutratu.add("Відносне значення");

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
