package online_banking_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class CARD extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cartxf;
	private JTextField cardntxf;
	private JTextField cardttxf;
	private JTextField cdatetxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CARD frame = new CARD();
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
	public CARD() {
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 506);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 128, 0));
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CARD_NUMBER");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(39, 63, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CARD_DEATAIL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(298, 0, 237, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel cardtytxf = new JLabel("CARD_TYPE");
		cardtytxf.setFont(new Font("Tahoma", Font.BOLD, 14));
		cardtytxf.setBounds(39, 200, 114, 38);
		contentPane.add(cardtytxf);
		
		cartxf = new JTextField();
		cartxf.setBounds(250, 62, 306, 38);
		contentPane.add(cartxf);
		cartxf.setColumns(10);
		
		cardntxf = new JTextField();
		cardntxf.setBounds(250, 132, 306, 31);
		contentPane.add(cardntxf);
		cardntxf.setColumns(10);
		
		cardttxf = new JTextField();
		cardttxf.setBounds(250, 206, 318, 31);
		contentPane.add(cardttxf);
		cardttxf.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("EXPIRY_DATE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(39, 293, 114, 38);
		contentPane.add(lblNewLabel_4);
		
		cdatetxf = new JTextField();
		cdatetxf.setBounds(250, 295, 329, 38);
		contentPane.add(cdatetxf);
		cdatetxf.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
				String sql="INSERT INTO card VALUES(?,?,?,?)";
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1,Integer.parseInt(cartxf.getText()));
				st.setString(2, cardntxf.getText());
				st.setString(3, cardttxf.getText());
				st.setString(4, cdatetxf.getText());
				JOptionPane.showMessageDialog(btnNewButton, "data saved");
				st.executeUpdate();
				st.close();
				con.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setBounds(23, 410, 89, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("UPDATE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.jdbc.Driver");	 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
		String sql="UPDATE card SET carrd_id=?,card_number=?,expiry_date=?,card__type=? where card_id=?";
				PreparedStatement st=con.prepareStatement(sql); 
		st.setString(1, cartxf.getText());
		st.setString(2, cardntxf.getText());
		st.setString(3, cardttxf.getText());
		Component UpdatableResultSet = null;
		JOptionPane.showInternalMessageDialog(UpdatableResultSet,"data changed!!");
		st.executeUpdate();
		st.close();
		con.close();
			} catch (Exception e2) {
					// TODO: handle exception
				}}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(198, 410, 130, 31);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("CARD_NUMBER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(39, 132, 148, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(407, 410, 89, 36);
		contentPane.add(btnNewButton_1);
	}
}
