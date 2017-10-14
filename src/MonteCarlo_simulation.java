import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MonteCarlo_simulation extends JFrame{
	JPanel p = new JPanel();
	JLabel[] labels = new JLabel[300];
	
	public MonteCarlo_simulation() {
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		for (int i = 0; i < 300; i++) {
			labels[i] = new JLabel("" + i);
			int x = (int) (700 * Math.random());
			int y = (int) (500 * Math.random());
			labels[i].setForeground(Color.MAGENTA);
			labels[i].setLocation(x, y);
			labels[i].setSize(30, 20);
			p.add(labels[i]);
		}
		setSize(700, 500);
		add(p);
		setVisible(true);
	}
	
	public static void main (String args[]) {
		MonteCarlo_simulation f = new MonteCarlo_simulation();
	}
}
