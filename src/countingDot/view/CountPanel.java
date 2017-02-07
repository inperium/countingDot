package countingDot.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import countingDot.controller.CountController;

public class CountPanel extends JPanel {

	private CountController baseController;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JTextField textField;
	private JButton factButton;
	private JButton fibButton;

	public CountPanel(CountController baseController) {
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.textArea = new JTextArea();
		this.textField = new JTextField();
		this.factButton = new JButton("Fact Button");
		this.fibButton = new JButton("Fact Button");

		setupPanel();
		setupLayout();
		setupListners();
	}

	private void setupPanel() {
		this.setLayout(baseLayout);
		this.add(textArea);
		this.add(textField);
		this.add(factButton);
		this.add(fibButton);
	}

	private void setupListners() {

	}

	private void setupLayout() {

	}

}
