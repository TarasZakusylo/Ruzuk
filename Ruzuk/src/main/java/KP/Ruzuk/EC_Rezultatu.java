package KP.Ruzuk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class EC_Rezultatu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel l_fon;
	
	String s_Zdatni = "" ;
	String s_Ruzuk = "" ;
	
	public EC_Rezultatu(int i_ruzuk, int i_oderejnist, int i_dovira, double d_CustuyPrubutok,
			double d_MaybutniyPrubytok, double d_Ruzuk) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Ваш чистий");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(612, 25, 370, 43);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("прибуток: " + d_CustuyPrubutok);
		label.setForeground(Color.YELLOW);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe Script", Font.BOLD, 25));
		label.setBounds(612, 81, 370, 46);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Прогнозований");
		label_1.setForeground(Color.YELLOW);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe Script", Font.BOLD, 25));
		label_1.setBounds(641, 169, 341, 43);
		getContentPane().add(label_1);
		
		if(i_ruzuk >= 50 && i_oderejnist < 50){
			s_Zdatni = "   Ви здатні приймати рішення і діяти при "
					+ "дефіциті інформації та ресурсів. Тобто "
					+ "у Вашій поведінці присутні елементи, які "
					+ "називають авантюрними."; 
		}
		if(i_ruzuk >= 50 && i_oderejnist > 50){
			s_Zdatni = "   Ви раціоналіст. У Вашій поведінці поєднуються "
					+ "віра в свої сили з розумінням того, що не все залежить "
					+ "від Ваших зусиль та настіййливості."; 
		}
		if(i_ruzuk <= 50 && i_oderejnist > 50){
			s_Zdatni = "   Ви належете до групи фаталістів, тобто "
					+ "більше вірите у зовнішні сили, випадкові "
					+ "обставини тощо, ніж у свої власні можливості."; 
		}
		if(i_ruzuk <= 50 && i_oderejnist < 50){
			s_Zdatni = "   Ви інфантильна людина. Ви не вірите ні "
					+ "у власні сили, ні в можливість незалежних обставин."; 
		}
		if(i_ruzuk == 50 && i_oderejnist == 50){
			s_Zdatni = "   Ви неймовірно унікальна людина. "
					+ "Або не було змінено жодного параметра у опитуванні."; 
		}
		if(i_dovira <= 50){
			s_Zdatni = s_Zdatni + "\n\n   У Вас низький рівень довіри. "
					+ "Вас не рекомендовано займатись бізнесом."; 
		}else{
			s_Zdatni = s_Zdatni + "\n\n   У Вас чудовий рівень довіри. "
					+ "Бізнес створено саме для Вас."; 
		}
		
		JButton btnNewButton = new JButton("Пройти знову");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC("EC", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(218, 522, 593, 43);
		getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.ORANGE);
		textPane.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane.setText(s_Zdatni);
		textPane.setBounds(12, 113, 341, 222);
		getContentPane().add(textPane);
		
		if(d_Ruzuk < 30){
			s_Ruzuk = "   Ваша підприємницька угода має дуже "
					+ "високий рівнень надійності і вже врахувала "
					+ "всі можливі витрати. Ви можете бути "
					+ "впевненими в успіху виконання угоди, "
					+ "хоча імтовірність отримання величезного "
					+ "прибутку від реалізації досить мала.";
		}
		if(d_Ruzuk >= 30 && d_Ruzuk <= 70){
			s_Ruzuk = "   Ризик описаної Вами ситуації є обгрунтованим і на нього варто іти.";
		}
		if(d_Ruzuk > 70){
			s_Ruzuk = "   Ваша угода є дуже ризикованою. "
					+ "На таку угоду, звісно, також іти можна, "
					+ "але ви повинні бути готовим до можливих "
					+ "великих незапланованих втрат.";
		}
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setForeground(Color.ORANGE);
		textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textPane_1.setText(s_Ruzuk);
		textPane_1.setBounds(641, 261, 341, 145);
		getContentPane().add(textPane_1);
		
		JLabel l_komentar1 = new JLabel("Чи здатні Ви");
		l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar1.setForeground(Color.YELLOW);
		l_komentar1.setFont(new Font("Segoe Script", Font.BOLD, 35));
		l_komentar1.setBounds(-1, 25, 365, 43);
		getContentPane().add(l_komentar1);
		
		JLabel label_2 = new JLabel("ризикувати ?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.YELLOW);
		label_2.setFont(new Font("Segoe Script", Font.BOLD, 35));
		label_2.setBounds(-1, 69, 365, 43);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("прибуток:" + d_MaybutniyPrubytok);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.YELLOW);
		label_3.setFont(new Font("Segoe Script", Font.BOLD, 25));
		label_3.setBounds(641, 215, 341, 43);
		getContentPane().add(label_3);
		

		l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("C:\\Users\\Zakkk\\Desktop\\fon_EC_rezultatu.jpg"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
