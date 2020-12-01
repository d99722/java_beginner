package lec10.counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CountButton extends JButton implements ActionListener {
	
	private Counter model;
	private CounterFrame view;
	
	
	public CountButton(String label, Counter m, CounterFrame v) {
		super(label);
		model = m;
		view = v;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.increment();
		view.update();
	}

}
