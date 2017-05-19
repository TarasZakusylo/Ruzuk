package KP.Ruzuk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EC2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna8;
	private JSlider sl_putanna9;
	private JSlider sl_putanna10;
	private JSlider sl_putanna11;

	int i_sl_putanna8 = 3;
	int i_sl_putanna9 = 3;
	int i_sl_putanna10 = 3;
	int i_sl_putanna11 = 3;

	SliderListener8 slider8 = new SliderListener8();
	SliderListener9 slider9 = new SliderListener9();
	SliderListener10 slider10 = new SliderListener10();
	SliderListener11 slider11 = new SliderListener11();

	EC2(String s, final int ii_sl_putanna0, final int ii_sl_putanna1, final int ii_sl_putanna2,
			final int ii_sl_putanna3, final int ii_sl_putanna4, final int ii_sl_putanna5, final int ii_sl_putanna6,
			final int ii_sl_putanna7, final int ii_sl_putanna8, final int ii_sl_putanna9, final int ii_sl_putanna10,
			final int ii_sl_putanna11, final int ii_sl_putanna12, final int ii_sl_putanna13, final int ii_sl_putanna14,
			final int ii_sl_putanna15) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.i_sl_putanna8 = ii_sl_putanna8;
		this.i_sl_putanna9 = ii_sl_putanna9;
		this.i_sl_putanna10 = ii_sl_putanna10;
		this.i_sl_putanna11 = ii_sl_putanna11;

		sl_putanna8 = new JSlider(0, 0, 10, i_sl_putanna8);
		sl_putanna8.setOpaque(false);
		sl_putanna8.setMinorTickSpacing(1);
		sl_putanna8.setPaintTicks(true);
		sl_putanna8.setPaintLabels(true);
		sl_putanna8.setBounds(35, 136, 912, 40);
		getContentPane().add(sl_putanna8);

		sl_putanna9 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna9);
		sl_putanna9.setPaintTicks(true);
		sl_putanna9.setPaintLabels(true);
		sl_putanna9.setOpaque(false);
		sl_putanna9.setMinorTickSpacing(1);
		sl_putanna9.setBounds(35, 216, 912, 40);
		getContentPane().add(sl_putanna9);

		sl_putanna10 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna10);
		sl_putanna10.setPaintTicks(true);
		sl_putanna10.setPaintLabels(true);
		sl_putanna10.setOpaque(false);
		sl_putanna10.setMinorTickSpacing(1);
		sl_putanna10.setBounds(35, 344, 912, 40);
		getContentPane().add(sl_putanna10);

		sl_putanna11 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna11);
		sl_putanna11.setPaintTicks(true);
		sl_putanna11.setPaintLabels(true);
		sl_putanna11.setOpaque(false);
		sl_putanna11.setMinorTickSpacing(1);
		sl_putanna11.setBounds(35, 451, 912, 40);
		getContentPane().add(sl_putanna11);

		JLabel label_4 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_4.setForeground(Color.WHITE);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(10, 174, 102, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_5.setForeground(Color.WHITE);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(10, 254, 102, 14);
		getContentPane().add(label_5);

		JLabel label_10 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_10.setForeground(Color.WHITE);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(10, 383, 102, 14);
		getContentPane().add(label_10);

		JLabel label_15 = new JLabel("\u0442\u043E\u0447\u043D\u043E - \u043D\u0456");
		label_15.setForeground(Color.WHITE);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(10, 494, 102, 14);
		getContentPane().add(label_15);

		JLabel l_putanna0 = new JLabel("Всіх правил, які я виголошую для інших, я завжди дотримуюсь сам.");
		l_putanna0.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna0.setBounds(20, 96, 950, 34);
		l_putanna0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna0.setForeground(Color.YELLOW);
		getContentPane().add(l_putanna0);

		JLabel l_putanna1 = new JLabel("Я вірю в удачу.");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setBounds(22, 189, 950, 34);
		getContentPane().add(l_putanna1);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setForeground(Color.YELLOW);

		JLabel l_putanna2 = new JLabel("виконання багатьох завдань.");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setBounds(20, 306, 950, 34);
		getContentPane().add(l_putanna2);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setForeground(Color.YELLOW);

		JLabel l_putanna3 = new JLabel(
				"В своїй роботі я застосовую метод превентивного (тобто попереджувального) ослаблення обмежень.");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setBounds(10, 422, 960, 34);
		getContentPane().add(l_putanna3);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setForeground(Color.YELLOW);

		JButton b_vpered2 = new JButton("Далі");
		b_vpered2.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 25));
		b_vpered2.setForeground(Color.BLUE);
		b_vpered2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC3("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, i_sl_putanna8, i_sl_putanna9, i_sl_putanna10,
						i_sl_putanna11, ii_sl_putanna12, ii_sl_putanna13, ii_sl_putanna14, ii_sl_putanna15);
				setVisible(false);

			}
		});
		b_vpered2.setBounds(492, 517, 490, 36);
		getContentPane().add(b_vpered2);

		JButton b_nazad1 = new JButton("Назад");
		b_nazad1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 25));
		b_nazad1.setForeground(Color.BLUE);
		b_nazad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC1("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, i_sl_putanna8, i_sl_putanna9, i_sl_putanna10,
						i_sl_putanna11, ii_sl_putanna12, ii_sl_putanna13, ii_sl_putanna14, ii_sl_putanna15);
				setVisible(false);

			}
		});
		b_nazad1.setBounds(0, 517, 494, 36);
		getContentPane().add(b_nazad1);

		JLabel label = new JLabel("Чи здатні Ви ризикувати ?");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		label.setBounds(0, 0, 982, 50);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Вам варто пройти опитування");
		label_1.setForeground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 49, 982, 14);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Спробуйте якомога точніше давати відповіді на запитання");
		label_2.setForeground(Color.WHITE);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 69, 982, 14);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("точно - так");
		label_3.setForeground(Color.WHITE);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(826, 494, 116, 14);
		getContentPane().add(label_3);

		JLabel label_6 = new JLabel("точно - так");
		label_6.setForeground(Color.WHITE);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(826, 383, 116, 14);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("точно - так");
		label_7.setForeground(Color.WHITE);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(826, 254, 116, 14);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("точно - так");
		label_8.setForeground(Color.WHITE);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(826, 174, 116, 14);
		getContentPane().add(label_8);

		JLabel label_9 = new JLabel(
				"Я відчуваю, що від мене особисто більше, ніж від рівних мені за рангом людей, залежить");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.YELLOW);
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_9.setBounds(20, 281, 950, 34);
		getContentPane().add(label_9);
		
				JLabel label_20 = new JLabel("");
				label_20.setIcon(new ImageIcon("res/fon/EC2.jpg"));
				label_20.setBounds(-10, 0, 992, 553);
				getContentPane().add(label_20);

		setVisible(true);

		sl_putanna8.addChangeListener(slider8);
		sl_putanna9.addChangeListener(slider9);
		sl_putanna10.addChangeListener(slider10);
		sl_putanna11.addChangeListener(slider11);

	}

	class SliderListener8 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna8 = (JSlider) e.getSource();
			i_sl_putanna8 = (int) sl_putanna8.getValue();
		}
	}

	class SliderListener9 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna9 = (JSlider) e.getSource();
			i_sl_putanna9 = (int) sl_putanna9.getValue();
		}
	}

	class SliderListener10 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna10 = (JSlider) e.getSource();
			i_sl_putanna10 = (int) sl_putanna10.getValue();
		}
	}

	class SliderListener11 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna11 = (JSlider) e.getSource();
			i_sl_putanna11 = (int) sl_putanna11.getValue();
		}
	}

}
