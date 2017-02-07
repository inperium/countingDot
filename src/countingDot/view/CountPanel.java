package countingDot.view;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
		this.fibButton = new JButton("Fib Button");

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
		factButton.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					textArea.setText(baseController.transferFactorial(textField.getText()));
				}
			}
		);
		
		fibButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(baseController.transferFibinacci(textField.getText()));
			}
		}
	);
	}

	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.NORTH, textField, 190, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 105, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textField, -89, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textField, -19, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, factButton, -25, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, -70, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.EAST, fibButton, -66, SpringLayout.WEST, factButton);
	}

}
