package AdvancedGraphics;
 
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;

public class AppWindow {

	private JFrame frame;
	private NodePlot plot;
	
	//Private Random # Gen

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Advanced Graphics");
		plot = new NodePlot();
		
		//plot.getlist
		
		frame.setResizable(false);
		frame.setBounds(100, 100, 913, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(plot);
		scrollPane.setViewportBorder(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(119, 8, 403, 403);
		frame.getContentPane().add(scrollPane);
		
		JButton btnGrid = new JButton("Add Grid");
		btnGrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plot.addItem(new NodeGrid());				
			}
		});
		btnGrid.setBounds(12, 28, 97, 23);
		frame.getContentPane().add(btnGrid);
		
		JButton btnOrigin = new JButton("Add Origin");
		btnOrigin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plot.addItem(new NodeOrigin());
			}
		});
		btnOrigin.setBounds(12, 60, 97, 23);
		frame.getContentPane().add(btnOrigin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				plot.clear();	
			}
		});
		btnClear.setBounds(12, 361, 97, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnAddRandom = new JButton("Add 10");
		btnAddRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawRandomShapes(10);
			}
		});
		btnAddRandom.setBounds(12, 94, 97, 23);
		frame.getContentPane().add(btnAddRandom);
		
		JButton btnAdd = new JButton("Add 1000");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawRandomShapes(1000);
			}
		});
		btnAdd.setBounds(12, 128, 97, 23);
		frame.getContentPane().add(btnAdd);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(562, 8, 317, 326);
		frame.getContentPane().add(scrollPane_1);
		
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		JList list = new JList();
		list.setBounds(562, 11, 315, 295);
		frame.getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Sort");
		btnNewButton.setBounds(562, 361, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * for (Node shape : plot.getList()){
				 * Systemout("Shape");
				 */
			}
		});
		btnNewButton_1.setBounds(12, 160, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					// Set the relative file path. EVENTUALLY REPACE WITH JFILECHOOSER
					//String filename = "";
					
					 JFileChooser jf = new JFileChooser();
					 
					//Indicates whether the user picks a file and hits OK
					 int result = jf.showOpenDialog(null);  
					 
					 if (result != jf.APPROVE_OPTION){
					 System.err.println("File not selected");
					 return;
					 }
					  
					 String filename = jf.getSelectedFile().toString();
					 
					
					// Open the file
					File file = new File(filename);
					
					// Create the Scanner object and scope to the entire main method
					Scanner in = null;
					
					try {
						// Try to open the file
						in = new Scanner(file);
						
						try {
							// Read in the data one line at a time
							while(in.hasNextLine()) {
								
								/*In here, you need to read in all shapes one by one, 
								 * create a new shape and add to the plot. There is a draw random shape
								 * method in each Node(shape). Then assign the values in the class. 
								*/
								String line = in.nextLine();
								
								String[] components =  line.split(",");
								
								// Do something with this String while there is a line, keep reading
								for(String component:components) {
									System.out.println(component);	
								}
								
								switch (components[0]) {
								case "Rectangle":
									// Creates a rectangle based on the text file obtained
									int x = Integer.parseInt(components[1]);
									int y = Integer.parseInt(components[2]);
									int w = Integer.parseInt(components[3]);;
									int h = Integer.parseInt(components[4]);;
									int red = Integer.parseInt(components[5]);;
									int green = Integer.parseInt(components[6]);;
									int blue = Integer.parseInt(components[7]);;
									
									Color c = new Color(red,green,blue);
										plot.addItem(new NodeRectangle(x,y,w,h,c));
									break;
									
								case "Circle":
//									int x = Integer.parseInt(components[1]);
//									int y = Integer.parseInt(components[2]);
//									int r = Integer.parseInt(components[3]);;
//									int c = Integer.parseInt(components[4]);;
//									int red = Integer.parseInt(components[5]);;
//									int green = Integer.parseInt(components[6]);;
//									int blue = Integer.parseInt(components[7]);;
//									
//									Color c = new Color(red,green,blue);
//										plot.addItem(new NodeCircle(x,y,r,c));
									break;
									
								case "Triangle":
									break;
									
								default:
									
								}
								
							}
							
							
						// Fix anything that broke and clean up
						} catch (NoSuchElementException e) {
							System.err.println("Record Error: " + e.getMessage());
						} catch (IndexOutOfBoundsException e) {
							System.err.println("Parse Error: " + e.getMessage());
						} catch (NumberFormatException e) {
							System.err.println("Data Error: " + e.getMessage());
						} finally {
							in.close();
						}
						
					} catch (FileNotFoundException e) {
						System.err.println("File Unavailable: " + e.getMessage());
					} 
					
				}
		});
		mnNewMenu.add(mntmNewMenuItem);
		mnNewMenu.add(mntmExit);
	}
	
	// Use this method to help you create a shape loader	
	private void drawRandomShapes(int count) {
		Random generator = new Random();
		
		for (int i=0; i<count; i++) {
			
			// Create random X and Y locations
			int x = generator.nextInt(601)-200;
			int y = generator.nextInt(601)-200;

			// Set a random radius or height/width
			int r = generator.nextInt(201);
			int w = generator.nextInt(401);
			int h = generator.nextInt(401);

			// Create random color components (0-255)
			int red = generator.nextInt(128)+128;
			int green = generator.nextInt(128)+128;
			int blue = generator.nextInt(128)+128;
			
			Color c = new Color(red,green,blue);
			
			if (generator.nextBoolean()) {
				plot.addItem(new NodeCircle(x,y,r,c));
			} else {
				plot.addItem(new NodeRectangle(x,y,w,h,c));
			}
			
		}

	}
	
	public void setVisible(boolean b) {
		if (b) {
			frame.setVisible(true);
		} else {
			frame.setVisible(false);
		}
	}
}
/*
try {
in = new scanner(file)
try{
	while{in.hasNextLine()){
	string data = in nextline()
	stringp[ datavector = data.split(",") //For comas
	Color c;
	
	switch (dataVector[0]){
	
	case "Rectangle":
		c = new Color(Integer.parseInt(dataVectror[4]),dataVectror[5]),dataVectror[6]),dataVectror[7]),);
	case "Circle":
		c= ...
		plot.additem...
		
		Check Chp11
		}
		*/