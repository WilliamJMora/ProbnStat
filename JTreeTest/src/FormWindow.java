import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;

public class FormWindow {

	private JFrame frame;

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
		frame.setBounds(100, 100, 982, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(164, 11, 511, 549);
		frame.getContentPane().add(scrollPane);
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Portfolio(s)");
		
		DefaultMutableTreeNode portfolio1 = new DefaultMutableTreeNode("Retirement");
		DefaultMutableTreeNode portfolio2 = new DefaultMutableTreeNode("Operations");
		
		root.add(portfolio1);
		root.add(portfolio2);
		
		portfolio1.add(new DefaultMutableTreeNode(""));
		portfolio2.add(new DefaultMutableTreeNode(""));
		
		portfolio1.add(new DefaultMutableTreeNode(""));
		portfolio2.add(new DefaultMutableTreeNode(""));
		
		JTree tree = new JTree(root);
		scrollPane.setViewportView(tree);
		
		//automatically expands rows
		for (int i=0; i<tree.getRowCount(); i++) {
			tree.expandRow(i);
		}
		
	}
}
