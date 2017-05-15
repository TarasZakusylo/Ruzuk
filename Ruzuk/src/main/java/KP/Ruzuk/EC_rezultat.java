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

public class EC_rezultat extends JFrame {

	private static final long serialVersionUID = 1L;

	public EC_rezultat(int i_ruzuk,int i_oderejnist , int i_dovira) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\u041F\u0440\u043E\u0439\u0442\u0438 \u0449\u0435 \u0440\u0430\u0437");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EC("EC", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(52, 41, 344, 59);
		getContentPane().add(btnNewButton);

		JLabel label = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Verdana", Font.ITALIC, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 123, 764, 34);
		getContentPane().add(label);

		 
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("res/fon/EC_resultat.png"));
		label_4.setBounds(0, 0, 794, 572);
		getContentPane().add(label_4);
		setVisible(true);


	}
}
