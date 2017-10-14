import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame_1 extends JFrame{
	public Frame_1() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200);
		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Frame_1");
		Image img = kit.getImage("car.jpg");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("��ư");
		this.add(button);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		Frame_1 f = new Frame_1();
	}
}
