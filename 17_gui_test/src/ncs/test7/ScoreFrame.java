package ncs.test7;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {

	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;

	public ScoreFrame() {

		JFrame score = new JFrame();
		score.setTitle("¹®Á¦7");

		score.setBounds(200, 200, 500, 400);
		//score.setResizable(false);
		score.setLayout(null);

		JPanel p = new JPanel();
		p.setBounds(0, 0, 500, 400);
		p.setLayout(null);
		

		JLabel str1 = new JLabel("Á¡¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		str1.setFont(new Font("±¼¸²", Font.BOLD, 48));
		str1.setHorizontalAlignment(JLabel.CENTER);
		str1.setBounds(0, 0, 500, 70);
		p.add(str1);

		JLabel javaLabel = new JLabel("ÀÚ¹Ù:");
		javaLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		javaLabel.setBounds(20, 100, 50, 30);
		p.add(javaLabel);

		JLabel sqlLabel = new JLabel("SQL:");
		sqlLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		sqlLabel.setBounds(270, 100, 50, 30);
		p.add(sqlLabel);

		JLabel totalLabel = new JLabel("ÃÑÁ¡:");
		totalLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		totalLabel.setBounds(20, 280, 50, 30);
		p.add(totalLabel);

		JLabel avgLabel = new JLabel("Æò±Õ:");
		avgLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		avgLabel.setBounds(270, 280, 50, 30);
		p.add(avgLabel);

		javaScore = new JTextField();
		javaScore.setBounds(68, 100, 120, 30);
		p.add(javaScore);

		sqlScore = new JTextField();
		sqlScore.setBounds(320, 100, 120, 30);
		p.add(sqlScore);

		total = new JTextField();
		total.setBounds(68, 280, 120, 30);
		p.add(total);

		average = new JTextField();
		average.setBounds(320, 280, 120, 30);
		p.add(average);

		calcBtn = new JButton("°è»êÇÏ±â");
		calcBtn.setFont(new Font("±¼¸²", Font.BOLD, 18));

		calcBtn.setBounds(180, 180, 110, 40);
		calcBtn.addActionListener(new ScoreFrame$ActionHandler());

		p.add(calcBtn);

		
		score.add(p);
		score.setDefaultCloseOperation(EXIT_ON_CLOSE);
		score.setVisible(true);

	}

	// ³»ºÎÅ¬·¡½º ÀÌº¥Æ® Çîµé·¯
	class ScoreFrame$ActionHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			int java = Integer.parseInt(javaScore.getText());
			int sql = Integer.parseInt(sqlScore.getText());
			total.setText(java + sql + "");
			average.setText((java + sql) / 2 + "");

		}

	}

}
