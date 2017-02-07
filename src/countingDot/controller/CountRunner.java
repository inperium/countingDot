package countingDot.controller;

import countingDot.controller.CountController;

public class CountRunner {
	public static void main(String [] args) 
	{
		CountController countAppController = new CountController();
		countAppController.start();
	}
}
