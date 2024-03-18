package FORMS;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import java.awt.Font;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.Color;

	public class ROGIN_PAGE extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField textField;
		private JTextField textField_1;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ROGIN_PAGE frame = new ROGIN_PAGE();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public ROGIN_PAGE() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 762, 402);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("LOGIN_PAGE");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setBounds(236, 11, 135, 65);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("USER_NAME");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(70, 113, 129, 47);
			contentPane.add(lblNewLabel_1);
			
			textField = new JTextField();
			textField.setBounds(339, 113, 175, 47);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("PASSWARD");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2.setBounds(74, 236, 103, 37);
			contentPane.add(lblNewLabel_2);
			
			textField_1 = new JTextField();
			textField_1.setBounds(339, 229, 175, 44);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
			
			JButton btnNewButton = new JButton("LOGIN");
			btnNewButton.setForeground(new Color(255, 0, 0));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton.setBounds(592, 176, 129, 47);
			contentPane.add(btnNewButton);
		}

	}



