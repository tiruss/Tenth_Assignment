import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pizza_order extends JFrame{
	public Pizza_order() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pizza Order");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		
		JLabel label1 = new JLabel("���� ���� �����ϼ���.");
		
		panelA.add(label1);
		JButton button1 = new JButton("���۽�����");
		JButton button2 = new JButton("���ͽ�����");
		JButton button3 = new JButton("���۷δ�");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Pizza_order f = new Pizza_order();
	}

}
