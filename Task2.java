package harshita;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;


import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Task2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private float average;
	
	public Task2() {
		setTitle("NumberGrading");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 421);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your Marks ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(213, 0, 155, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Maths");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(154, 73, 49, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Physics");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(150, 111, 71, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chemistry");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(154, 164, 91, 37);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(365, 71, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(365, 115, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setBounds(365, 172, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		
		JButton btnNewButton = new JButton("CALCULATE MY AVERAGE");
		btnNewButton.addActionListener(new ActionListener() {
			
			 
			
			public void actionPerformed(ActionEvent e) {		
			float  Maths1=Integer.parseInt(textField.getText());
				float Physics1=Integer.parseInt(textField_1.getText());
				float Chemistry1=Integer.parseInt(textField.getText());
				float sum=Maths1+Physics1+Chemistry1;
				float average=(sum/3);
				JOptionPane.showMessageDialog(btnNewButton,average);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(169, 231, 250, 37);
		contentPane.add(btnNewButton);
		
		JButton btnCalculateMyGrade = new JButton("CALCULATE MY GRADE");
		btnCalculateMyGrade.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(average <= 90.0f) {
				 JOptionPane.showMessageDialog(btnCalculateMyGrade," A");
			        } else if (average <= 80.0f) {
			        	 JOptionPane.showMessageDialog(btnCalculateMyGrade,"A2");
			        } else if (average <= 70.0f) {
			        	 JOptionPane.showMessageDialog(btnCalculateMyGrade,"B");
			        } else if (average <= 60.0f) {
			        	 JOptionPane.showMessageDialog(btnCalculateMyGrade,"C");
			        } else if (average<= 50.0f) {
			        	 JOptionPane.showMessageDialog(btnCalculateMyGrade,"D");
			        } else {
			        	 JOptionPane.showMessageDialog(btnCalculateMyGrade,"E");
			        }
			    }

		
		});
		
		btnCalculateMyGrade.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalculateMyGrade.setBounds(169, 329, 250, 28);
		contentPane.add(btnCalculateMyGrade);
		
	}

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Task2 frame = new Task2();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}	
}

