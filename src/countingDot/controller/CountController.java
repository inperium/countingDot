package countingDot.controller;

import countingDot.view.CountFrame;

public class CountController {

	private CountFrame countFrame;

	public void start() {
	}
	
	public CountController() {
		countFrame = new CountFrame(this);
	}

	public CountFrame getCountFrame() {
		return countFrame;
	}

	public void setCountFrame(CountFrame countFrame) {
		this.countFrame = countFrame;
	}
}