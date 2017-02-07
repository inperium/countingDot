package countingDot.view;

import javax.swing.JFrame;

import countingDot.controller.CountController;

public class CountFrame extends JFrame 
{
	private CountController baseController;
	private CountPanel countPanel;

	public CountFrame(CountController countController) 
	{
			super();
			this.baseController = countController;
			this.countPanel = new CountPanel(baseController);
			
			this.setupFrame();
	}

	private void setupFrame() 
	{
		this.setContentPane(countPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("IDK");
		this.setSize(650, 400);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public CountPanel getCountPanel()
	{
		return this.countPanel;
	}

}
