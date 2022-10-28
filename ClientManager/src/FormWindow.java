	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JScrollPane;
	import javax.swing.ScrollPaneConstants;
	import javax.swing.tree.DefaultMutableTreeNode;
	import javax.swing.JTree;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

	public class FormWindow {

		private JFrame frame;
		private JTextField txtFirstName;
		private JTextField txtLastName;
		private JTextField txtPhoneNumber;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						FormWindow window = new FormWindow();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public FormWindow() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 1533, 841);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBounds(10, 157, 690, 634);
			frame.getContentPane().add(scrollPane);
			
			DefaultMutableTreeNode root = new DefaultMutableTreeNode("Portfolio(s)");
			
			DefaultMutableTreeNode portfolio1 = new DefaultMutableTreeNode("Retirement");
			DefaultMutableTreeNode portfolio2 = new DefaultMutableTreeNode("Operations");
			
			root.add(portfolio1);
			root.add(portfolio2);
			
			portfolio1.add(new DefaultMutableTreeNode("Savings1"));
			portfolio2.add(new DefaultMutableTreeNode("Checking1"));
			
			portfolio1.add(new DefaultMutableTreeNode("Savings2"));
			portfolio2.add(new DefaultMutableTreeNode("Checking2"));
			
			JTree tree = new JTree(root);
			scrollPane.setViewportView(tree);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane_1.setBounds(710, 157, 797, 634);
			frame.getContentPane().add(scrollPane_1);
			
			JPanel panel1 = new JPanel();
			panel1.setBackground(Color.WHITE);
			scrollPane_1.setViewportView(panel1);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(10, 11, 1235, 138);
			frame.getContentPane().add(scrollPane_2);
			
			JPanel panel2 = new JPanel();
			panel2.setBackground(Color.WHITE);
			scrollPane_2.setViewportView(panel2);
			
			txtFirstName = new JTextField();
			txtFirstName.setBackground(SystemColor.menu);
			txtFirstName.setText("First Name");
			txtFirstName.setFont(new Font("Arial", Font.BOLD, 12));
			txtFirstName.setBounds(1255, 21, 98, 20);
			frame.getContentPane().add(txtFirstName);
			txtFirstName.setColumns(10);
			
			txtLastName = new JTextField();
			txtLastName.setText("Last Name");
			txtLastName.setFont(new Font("Arial", Font.BOLD, 12));
			txtLastName.setColumns(10);
			txtLastName.setBackground(SystemColor.menu);
			txtLastName.setBounds(1255, 52, 98, 20);
			frame.getContentPane().add(txtLastName);
			
			txtPhoneNumber = new JTextField();
			txtPhoneNumber.setText("Phone Number");
			txtPhoneNumber.setFont(new Font("Arial", Font.BOLD, 12));
			txtPhoneNumber.setColumns(10);
			txtPhoneNumber.setBackground(SystemColor.menu);
			txtPhoneNumber.setBounds(1255, 83, 98, 20);
			frame.getContentPane().add(txtPhoneNumber);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(1359, 21, 148, 20);
			frame.getContentPane().add(panel);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(1359, 52, 148, 20);
			frame.getContentPane().add(panel_1);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(Color.WHITE);
			panel_2.setBounds(1359, 83, 148, 20);
			frame.getContentPane().add(panel_2);
			
			JButton btnNewButton = new JButton("Update Interface");
			btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
			btnNewButton.setBounds(1255, 123, 252, 23);
			frame.getContentPane().add(btnNewButton);
			
			JMenuBar menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			
			JMenu mnNewMenu = new JMenu("Clients");
			menuBar.add(mnNewMenu);
			
			JMenuItem mntmNewMenuItem = new JMenuItem("Load");
			mnNewMenu.add(mntmNewMenuItem);
			
			JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
			mnNewMenu.add(mntmNewMenuItem_1);
			
			JMenu mnNewMenu_1 = new JMenu("Portfolios");
			menuBar.add(mnNewMenu_1);
			
			JMenuItem mntmNewMenuItem_2 = new JMenuItem("Add");
			mnNewMenu_1.add(mntmNewMenuItem_2);
			
			JMenuItem mntmNewMenuItem_3 = new JMenuItem("Remove");
			mnNewMenu_1.add(mntmNewMenuItem_3);
			
			JMenu mnNewMenu_2 = new JMenu("Accounts");
			menuBar.add(mnNewMenu_2);
			
			JMenuItem mntmNewMenuItem_4 = new JMenuItem("Add");
			mnNewMenu_2.add(mntmNewMenuItem_4);
			
			JMenuItem mntmNewMenuItem_5 = new JMenuItem("Remove");
			mnNewMenu_2.add(mntmNewMenuItem_5);
			
			//automatically expands rows
			for (int i=0; i<tree.getRowCount(); i++) {
				tree.expandRow(i);
			}
			
		}
	}
