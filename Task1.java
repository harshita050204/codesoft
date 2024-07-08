package harshita;

import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;


public class Task1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterNumberBetween;
	private JButton btnNewButton;
	private int maxattempts;
	private int attempts;
	private int score;
	private int targetnumber;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Task1() {
		setForeground(new Color(255, 255, 128));
		setBackground(new Color(255, 255, 128));
		setTitle("Guess the number");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 85, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Hey Guys ! Lets play a guessing  game ..");
		lblNewLabel.setBounds(92, 61, 275, 21);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setForeground(new Color(245, 245, 220));
		contentPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Guess a Number  between 1-100");
		lblNewLabel_2.setBounds(104, 175, 246, 20);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(245, 245, 220));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your guess");
		lblNewLabel_1.setBounds(174, 117, 95, 16);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(245, 245, 245));
		contentPane.add(lblNewLabel_1);
		
		txtEnterNumberBetween = new JTextField();
		txtEnterNumberBetween.setBounds(131, 144, 186, 20);
		txtEnterNumberBetween.setBackground(new Color(245, 245, 245));
		txtEnterNumberBetween.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEnterNumberBetween.setForeground(new Color(64, 0, 0));
		contentPane.add(txtEnterNumberBetween);
		txtEnterNumberBetween.setColumns(20);
		
		
		btnNewButton = new JButton("submit");
		btnNewButton.setBounds(174, 221, 95, 31);
		btnNewButton.setForeground(new Color(75, 0, 130));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkguess();
			}
		});
		
		contentPane.add(btnNewButton);
		
		maxattempts=3;
		score=0;
		attempts=0;
		targetnumber=getrandomnumber();
	}

	

	private int getrandomnumber() {
		Random random=new Random();
		return random.nextInt(100) + 1;
	}

	private void checkguess() {
		int userguess;
		try {
			userguess = Integer.parseInt(txtEnterNumberBetween.getText());
		}catch ( NumberFormatException ex) {
		JOptionPane.showMessageDialog(contentPane, "please enter a valid number");
			return ;}
		attempts++;
		
		if(userguess==targetnumber) {
			JOptionPane.showMessageDialog(contentPane,"Congratulations! You guessed the correct number.");
		score++;
	}else if (attempts < maxattempts) {
            String message = (userguess < targetnumber) ? "Too low! Try a higher number." : "Too high! Try a lower number.";
            JOptionPane.showMessageDialog(contentPane, message);
		}else {
			JOptionPane.showMessageDialog(contentPane, "Oops you have used all your attempts.The actual number was:"+targetnumber);
		}
		if(attempts<maxattempts) {
			targetnumber=getrandomnumber();
			txtEnterNumberBetween.setText("");
		}else {
			showscore();
		}		
		}
	private void showscore() {
		JOptionPane.showMessageDialog(contentPane,"your score is "+score);
		int option=JOptionPane.showConfirmDialog(contentPane,"do you like to play again?","play again",JOptionPane.YES_NO_OPTION);
		if(option==JOptionPane.YES_OPTION) {
			resetgame();
		}else {
	    dispose();    
		}
	}
	 private void resetgame() {

			score=0;
			attempts=0;
			targetnumber=getrandomnumber();
			txtEnterNumberBetween.setText("");
		  }
	 
	 public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Task1 frame = new Task1();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	 
}
