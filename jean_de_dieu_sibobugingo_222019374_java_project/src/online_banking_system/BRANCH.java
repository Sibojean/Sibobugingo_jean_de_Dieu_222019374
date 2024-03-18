package online_banking_system;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class BRANCH extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtxf;
	private JTextField namtxf;
	private JTextField ctytxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BRANCH frame = new BRANCH();
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
	public BRANCH() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BRANCH_DETAIL");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(183, 29, 189, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BRANCH_ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 113, 105, 38);
		contentPane.add(lblNewLabel_1);
		
		idtxf = new JTextField();
		idtxf.setBounds(224, 113, 314, 38);
		contentPane.add(idtxf);
		idtxf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BRA_NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 189, 124, 38);
		contentPane.add(lblNewLabel_2);
		
		namtxf = new JTextField();
		namtxf.setBounds(225, 181, 313, 38);
		contentPane.add(namtxf);
		namtxf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRA_CITY");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 286, 105, 38);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
					String sql="INSERT INTO branch VALUES(?,?,?)";
					PreparedStatement st=con.prepareStatement(sql);
					st.setInt(1,Integer.parseInt(idtxf.getText()));
					st.setString(2, namtxf.getText());
					st.setString(3, ctytxf.getText());
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
		btnNewButton.setBounds(67, 371, 89, 38);
		contentPane.add(btnNewButton);
		
		ctytxf = new JTextField();
		ctytxf.setBounds(224, 275, 314, 38);
		contentPane.add(ctytxf);
		ctytxf.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");	 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
		String sql="UPDATE branch SET bra_id=?,bra_name=?,bra_city=? where bra_id=?";
				PreparedStatement st=con.prepareStatement(sql); 
		st.setString(1, idtxf.getText());
		st.setString(2, namtxf.getText());
		st.setString(3, ctytxf.getText());
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
		btnNewButton_2.setBounds(246, 367, 105, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(466, 373, 89, 36);
		contentPane.add(btnNewButton_3);
	}

}
