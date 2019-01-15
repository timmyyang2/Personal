package sorting;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SortingUI extends Frame implements Runnable, ActionListener {

	public static final Font generalTextFont = new Font("Times New Romans", Font.BOLD, 15);
	
	//images for item bars
	private Image sortingImage;
	private Graphics sortingGraphics;
	private Animation animation;
	
	//run, pause and stopped states
	private boolean stopped = true; 
	private boolean run = false;
	private boolean pause = false;
	
	//various buttons
	private Button autoRunButton = new Button("Auto Run");
	private Button stepRunButton = new Button("Step Run");
	private Button pauseButton = new Button("Pause");
	
	private Button randomSetButton = new Button("Random Set");
	private Button restoreButton = new Button("Restore");
	
	Checkbox bubbleSortButton;
	Checkbox selectionSortButton;
	Checkbox insertionSortButton;
	
	//Menu item
	private Menu dataSortingMenu = new Menu("Data for Sorting");
	private MenuItem userInputMenuItem = new MenuItem("User Input");
	
	private UserInputDialog userInputDialog;
	
	private int currentItemCount = 10;//Sort.REF_BAR_NUM;
			
	//Applet method: initialization
	public SortingUI() {

		super("Sorting Animation");
		
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                System.exit(0);
             }
        });
		
		userInputDialog = new UserInputDialog(this);
		
		//sets the title of the frame
		setTitle("Sorting Animation");
		MenuBar menuBar=new MenuBar();
		setMenuBar(menuBar);
		menuBar.add(dataSortingMenu);
		dataSortingMenu.add(userInputMenuItem);
		userInputMenuItem.addActionListener(this);
		
		//sets background color
		setBackground(Animation.bgColor);
		setPreferredSize(new Dimension(600, 335));
		setResizable(false);
		pack();
		
		//creates the item bar image and graphics
		sortingImage = createImage(Animation.WIDTH, Animation.WIDTH);
		sortingGraphics = sortingImage.getGraphics();
		animation = new Animation(currentItemCount, 0); //bubble sort as default
		
		//defines the layout and font
		setLayout(new BorderLayout());
		
		//initializes all the other UI components
	    JPanel buttonsPanel = new JPanel();
	    FlowLayout buttonPanelLayout = new FlowLayout(2);
	    buttonsPanel.setLayout(buttonPanelLayout);
		
		buttonsPanel.add(autoRunButton);
		autoRunButton.setFont(generalTextFont);
		autoRunButton.addActionListener(this);
    
		buttonsPanel.add(stepRunButton);
		stepRunButton.setFont(generalTextFont);
		stepRunButton.addActionListener(this);
		
		buttonsPanel.add(pauseButton);
		pauseButton.setFont(generalTextFont);
		pauseButton.addActionListener(this);
		
		buttonsPanel.add(new JLabel("   "));
		
		JPanel buttonsPanel2 = new JPanel();
		buttonsPanel2.setLayout(buttonPanelLayout);
		
		randomSetButton.setFont(generalTextFont);
		randomSetButton.addActionListener(this);
		
		restoreButton.setFont(generalTextFont);
		restoreButton.addActionListener(this);
		
		buttonsPanel2.add(randomSetButton);
		buttonsPanel2.add(restoreButton);
		buttonsPanel2.add(new JLabel("            "));
		buttonsPanel2.setBackground(Animation.bgColor);
		
		Panel controlPanel = new Panel();
		controlPanel.setLayout(new GridLayout(5, 1));
		
		CheckboxGroup group = new CheckboxGroup();
		bubbleSortButton = new Checkbox("Bubble Sort", group, true);
		selectionSortButton = new Checkbox("Selection Sort", group, false);
		insertionSortButton = new Checkbox("Insertion Sort", group, false);
		bubbleSortButton.setFont(generalTextFont);
		selectionSortButton.setFont(generalTextFont);
		insertionSortButton.setFont(generalTextFont);
		
		controlPanel.setBackground(Animation.bgColor);
	    //controlPanel.add(new JLabel(" "));
	    controlPanel.add(bubbleSortButton);
	    controlPanel.add(selectionSortButton);
	    controlPanel.add(insertionSortButton);
	    controlPanel.add(new JLabel(" "));
	    controlPanel.add(buttonsPanel2);
	  
	    JPanel topPanel = new JPanel();
	    topPanel.setBackground(Animation.bgColor);
	    JPanel topButtonWrapperPanel = new JPanel();
	    topButtonWrapperPanel.setBackground(Animation.bgColor);
	    topButtonWrapperPanel.setLayout(new BorderLayout());
	    topButtonWrapperPanel.add(topPanel, BorderLayout.CENTER);
	    topButtonWrapperPanel.add(buttonsPanel, BorderLayout.SOUTH);
	    	    
		add(topButtonWrapperPanel, BorderLayout.NORTH);
		add(controlPanel, BorderLayout.EAST);
		
		//initializes the run and pause states as false 
		run = false;
		pause = true;

		centerUIComponent(this);
		
		setVisible(true);
		repaint();
	}
	
	public void setCurrentItemCount(int itemCount) {
		currentItemCount = itemCount;
		run = false;
	}
  
	//Applet method: called when update() is called
	public void paint(Graphics graphics) {
		animation.drawItemBars(sortingGraphics);
		graphics.drawImage(sortingImage, 0, 50, this);
	}
  
	//Applet method: called when repaint() is called
	public void update(Graphics graphics) {
		paint(graphics);
	}
  
	public void actionPerformed(ActionEvent paramActionEvent) {
		if (paramActionEvent.getSource() == randomSetButton) {
			setCurrentItemCount(Sort.REF_BAR_NUM);
			createNewAnimation();
			run = false;
			pause = false;		
		} else if (paramActionEvent.getSource() == restoreButton) {
			animation.restore();
			run = false;
			pause = false;
		} else if (paramActionEvent.getSource() == autoRunButton) {
			resetAnimationSort();
			run = true;
			pause = false;
		} else if (paramActionEvent.getSource() == stepRunButton) {
			run = false;
			pause = false;
			animation.doSort(); 
		} else if (paramActionEvent.getSource() == pauseButton) {
			run = false;
			pause = true;
		} 
		 
		if(paramActionEvent.getActionCommand().equals("User Input")){
			userInputDialog.setVisible(true);
		}
		repaint();
	}
	
	private void resetAnimationSort() {
		if(bubbleSortButton.getState() == true) {
			Sort bubbleSort = new BubbleSort(currentItemCount);
			bubbleSort.setItemBarArr(animation.getSort().getItemBarArr());
			bubbleSort.setBackupItemBarArr(animation.getSort().getBackItemBarArr());
			animation.resetSort(bubbleSort);
		}else if(selectionSortButton.getState() == true) {
			Sort selectionSort = new SelectionSort(currentItemCount);
			selectionSort.setItemBarArr(animation.getSort().getItemBarArr());
			selectionSort.setBackupItemBarArr(animation.getSort().getBackItemBarArr());
			animation.resetSort(selectionSort);
		}else if(insertionSortButton.getState() == true) {
			Sort insertionSort = new InsertionSort(currentItemCount);
			insertionSort.setItemBarArr(animation.getSort().getItemBarArr());
			insertionSort.setBackupItemBarArr(animation.getSort().getBackItemBarArr());
			animation.resetSort(insertionSort);
		}
	}
	
	private void createNewAnimation() {
		if(bubbleSortButton.getState() == true) {
			animation = new Animation(Sort.REF_BAR_NUM, 0);
		}else if(selectionSortButton.getState() == true) {
			animation = new Animation(Sort.REF_BAR_NUM, 1);
		}else if(insertionSortButton.getState() == true) {
			animation = new Animation(Sort.REF_BAR_NUM, 2);
		}
	}
	
	public void resetAnimation(ArrayList<Integer> numbers) {
		animation.resetNumbers(numbers);
		repaint();
	}
  
	private void disableButtons() {
		if(restoreButton.isEnabled()) {
			restoreButton.setEnabled(false);
		}
		if(stepRunButton.isEnabled()) {
			stepRunButton.setEnabled(false);
		}
		
		if(randomSetButton.isEnabled()) {
			randomSetButton.setEnabled(false);
		}
	}
	
	private void enableButtons() {
		if(!restoreButton.isEnabled()) {
			restoreButton.setEnabled(true);
		}
		if(!stepRunButton.isEnabled()) {
			stepRunButton.setEnabled(true);
		}
		
		if(!randomSetButton.isEnabled()) {
			randomSetButton.setEnabled(true);
		}
	}
	
	public void run() {
		repaint();
		while (true) {
			if (run && (!animation.isDone())) {
				disableButtons();
				animation.doSort();
				try {
					Thread.sleep(200);
				}
				catch (InterruptedException localInterruptedException) {}
			}else {
				enableButtons();
			}
			repaint();
		}
	}
  	
	public static void centerUIComponent(Component component) {
    	Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        int locX = screenWidth/2 - (int)component.getSize().getWidth()/2;
        int locY = screenHeight/2 - (int)component.getSize().getHeight()/2;
        component.setLocation(locX, locY);
    }
	
	public static void main(String[] args) {
		new Thread(new SortingUI()).start();
	}
}
