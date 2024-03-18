package online_banking_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class TRANSACTION extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField actxf;
	private JTextField datetxf;
	private JTextField typtxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRANSACTION frame = new TRANSACTION();
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
	public TRANSACTION() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 225, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRANSACTION_DETAIL");
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(233, 21, 256, 41);
		contentPane.add(lblNewLabel);
		
		JLabel numtxf = new JLabel("TRA_NUMBER");
		numtxf.setFont(new Font("Tahoma", Font.BOLD, 14));
		numtxf.setBounds(0, 88, 109, 34);
		contentPane.add(numtxf);
		
		JLabel lblNewLabel_2 = new JLabel("ACCOUNT_NUMBER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(2, 145, 151, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DATE_OF_TRA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(0, 212, 109, 34);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TRA_TYPE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(2, 275, 73, 34);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(249, 97, 256, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		actxf = new JTextField();
		actxf.setBounds(249, 145, 265, 34);
		contentPane.add(actxf);
		actxf.setColumns(10);
		
		datetxf = new JTextField();
		datetxf.setBounds(249, 214, 265, 34);
		contentPane.add(datetxf);
		datetxf.setColumns(10);
		
		typtxf = new JTextField();
		typtxf.setBounds(249, 275, 265, 34);
		contentPane.add(typtxf);
		typtxf.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
					String sql="INSERT INTO transaction VALUES(?,?,?,?)";
					PreparedStatement st=con.prepareStatement(sql);
					st.setInt(1,Integer.parseInt(actxf.getText()));
					st.setString(2,actxf.getText());
					st.setString(3, datetxf.getText());
					st.setString(4, typtxf.getText());
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
		btnNewButton.setBounds(20, 396, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");	 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
		String sql="UPDATE transaction SET tra_id=?,tra_type=?,date_of_tra=?,tra_type=? where tra-id=?";
				PreparedStatement st=con.prepareStatement(sql); 
		st.setString(1, actxf.getText());
		st.setString(2, datetxf.getText());
		st.setString(4, typtxf.getText());
		Component UpdatableResultSet = null;
		JOptionPane.showInternalMessageDialog(UpdatableResultSet,"data changed!!");
		st.executeUpdate();
		con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(186, 396, 130, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(398, 398, 116, 23);
		contentPane.add(btnNewButton_3);
	}

}
