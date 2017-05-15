package KP.Ruzuk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Pruvitanna extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel l_fon;

	public Pruvitanna(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Експертна система із надання");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new EC("EC", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 447, 705, 43);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("рекомендацій та обчислення");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new EC("EC", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		label.setForeground(Color.YELLOW);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Monotype Corsiva", Font.BOLD, 45));
		label.setBounds(0, 482, 705, 46);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("підприємницького ризику");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new EC("EC", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		label_1.setForeground(Color.YELLOW);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 45));
		label_1.setBounds(0, 522, 705, 43);
		getContentPane().add(label_1);

		l_fon = new JLabel("");
		l_fon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new EC("EC", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		l_fon.setIcon(new ImageIcon("res/fon/Pruvitanna.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
