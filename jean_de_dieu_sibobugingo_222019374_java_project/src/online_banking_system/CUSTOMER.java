package online_banking_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class CUSTOMER extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtxf;
	private JTextField ftxf;
	private JTextField ltxf;
	private JTextField emtxf;
	private JTextField phntxf;
	protected Component updatebtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CUSTOMER frame = new CUSTOMER();
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
	public CUSTOMER() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setForeground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER_DETAIL");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(287, 30, 248, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("E_MAIL");
		lblNewLabel_4.setBackground(new Color(128, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(29, 266, 93, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PHONE");
		lblNewLabel_5.setBackground(new Color(128, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(24, 334, 87, 36);
		contentPane.add(lblNewLabel_5);
		
		idtxf = new JTextField();
		idtxf.setBounds(194, 93, 313, 30);
		contentPane.add(idtxf);
		idtxf.setColumns(10);
		
		ftxf = new JTextField();
		ftxf.setBounds(194, 151, 313, 30);
		contentPane.add(ftxf);
		ftxf.setColumns(10);
		
		ltxf = new JTextField();
		ltxf.setBounds(194, 205, 313, 30);
		contentPane.add(ltxf);
		ltxf.setColumns(10);
		
		emtxf = new JTextField();
		emtxf.setBounds(186, 268, 321, 30);
		contentPane.add(emtxf);
		emtxf.setColumns(10);
		
		phntxf = new JTextField();
		phntxf.setBounds(180, 339, 327, 30);
		contentPane.add(phntxf);
		phntxf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CUSTOMER_ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(24, 91, 120, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FIRST_NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(24, 151, 131, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
					String sql="INSERT INTO CUSTOMER VALUES(?,?,?,?,?)";
					PreparedStatement st=con.prepareStatement(sql);
					st.setInt(1, Integer.parseInt(idtxf.getText()));
					st.setString(2, ftxf.getText());
					st.setString(3, ltxf.getText());

					st.setString(5, phntxf.getText());
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
		btnNewButton.setBounds(59, 421, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");	 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","");
		String sql="UPDATE customer SET customer_id=?,first_name=?,last_name=?,email=?,phone=?where custome_id=?";
				PreparedStatement st=con.prepareStatement(sql); 
		st.setString(1, idtxf.getText());
		st.setString(2, ftxf.getText());
		st.setString(3, ltxf.getText());
		st.setString(4, emtxf.getText());
		st.setString(5, phntxf.getText());
		JOptionPane.showInternalMessageDialog(updatebtn,"data changed!!");
		st.executeUpdate();
		con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
				
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(194, 423, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(320, 423, 120, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("LAST_NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(29, 203, 131, 30);
		contentPane.add(lblNewLabel_3);
			}

		}
			 