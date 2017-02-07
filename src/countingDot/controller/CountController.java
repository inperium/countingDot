package countingDot.controller;

import countingDot.view.CountFrame;
import javax.swing.JOptionPane;
import countingDot.model.*;

public class CountController {

	//Declaration
	private RecursionTool recursionTool;
	private CountFrame countFrame;
	
	//Constructor
	public CountController() {
		this.recursionTool = new RecursionTool();
		countFrame = new CountFrame(this);
	}
	
	//Start Method
	public void start() {
		
	}

	//Methods
	public String transferFactorial(String input)
	{
		String factorialInfo = "The factorial " + input + " is ";
		
		if(isValid(input))
		{
			factorialInfo += recursionTool.calculateFactorial(Integer.parseInt(input));
		}
		
		return factorialInfo;
	}
	
	private boolean isValid(String testValue)
	{
		boolean asdf = false;
		try
		{
			int test = Integer.parseInt(testValue);
			if(test >= 0){
				asdf = true;
			}
			else
			{
				asdf = false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(countFrame, "Type in a valid number greater than or equal to 0");
			asdf = false;
		}
		return asdf;
	}
	
	//Getters and Setters
	public CountFrame getCountFrame() {
		return countFrame;
	}

	public void setCountFrame(CountFrame countFrame) {
		this.countFrame = countFrame;
	}
}