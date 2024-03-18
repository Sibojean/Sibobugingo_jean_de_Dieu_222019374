package FORMS;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class CardForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardForm frame = new CardForm();
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
	public CardForm() {
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 506);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 128, 0));
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CARD_ID");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(39, 63, 148, 14);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel1 = new JLabel("CARD_ID");
		lblNewLabel1.setBackground(new Color(192, 192, 192));
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel1.setBounds(39, 63, 148, 14);
		contentPane.add(lblNewLabel1);
		JLabel lblNewLabel_1 = new JLabel("CARD_DEATAIL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(298, 0, 237, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("CARD_TYPE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(39, 200, 114, 38);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(250, 62, 306, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 132, 306, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 206, 318, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("EXPIRY_DATE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(39, 293, 114, 38);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(250, 295, 329, 38);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setBounds(23, 410, 89, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("VIEW");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(142, 409, 89, 31);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("UPDATE");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(262, 409, 130, 31);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("CARD_NUMBER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(39, 132, 148, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(432, 403, 89, 36);
		contentPane.add(btnNewButton_1);
	}
}
