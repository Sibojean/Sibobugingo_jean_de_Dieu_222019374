package online_banking_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.UpdatableResultSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class ACCOUNT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtxf;
	private JTextField cuemtxf;
	private JTextField opebalatxf;
	private JTextField acctytxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACCOUNT frame = new ACCOUNT();
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
	public ACCOUNT() {
		setForeground(new Color(255, 0, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 458);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACCOUNT DETAILS");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(254, 11, 172, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(33, 54, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("customerEmail");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(33, 108, 122, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("OPENING_BALANCE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(33, 155, 133, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ACCOUNT_TYPE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(33, 229, 133, 20);
		contentPane.add(lblNewLabel_4);
		
		idtxf = new JTextField();
		idtxf.setBounds(265, 53, 369, 28);
		contentPane.add(idtxf);
		idtxf.setColumns(10);
		
		cuemtxf = new JTextField();
		cuemtxf.setBounds(265, 108, 369, 34);
		contentPane.add(cuemtxf);
		cuemtxf.setColumns(10);
		
		opebalatxf = new JTextField();
		opebalatxf.setBounds(265, 153, 369, 36);
		contentPane.add(opebalatxf);
		opebalatxf.setColumns(10);
		
		acctytxf = new JTextField();
		acctytxf.setBounds(265, 226, 369, 31);
		contentPane.add(acctytxf);
		acctytxf.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("UPDATE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");	 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
		String sql="UPDATE account SET account_id=?,customer_email=?,openning_balance=?,account_type=? where account_id=?";
				PreparedStatement st=con.prepareStatement(sql); 
		st.setString(1, idtxf.getText());
		st.setString(2, cuemtxf.getText());
		st.setString(3, opebalatxf.getText());
		st.setString(4, acctytxf.getText());
		Component UpdatableResultSet = null;
		JOptionPane.showInternalMessageDialog(UpdatableResultSet,"data changed!!");
		st.executeUpdate();
		con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(203, 347, 119, 31);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
					String sql="INSERT INTO ACCOUNT VALUES(?,?,?,?)";
					PreparedStatement st=con.prepareStatement(sql);
					st.setInt(1, Integer.parseInt(idtxf.getText()));
					st.setString(2, cuemtxf.getText());
					st.setString(3, opebalatxf.getText());
					st.setString(4, acctytxf.getText());
					JOptionPane.showInternalMessageDialog(btnNewButton, "data saved!!");
					st.executeUpdate();
					con.close();
					st.close();
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(42, 351, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(394, 342, 89, 34);
		contentPane.add(btnNewButton_1);
	}
}
