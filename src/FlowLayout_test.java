import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout_test extends JFrame{
	public FlowLayout_test() {
		setTitle("FlowLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // �г��� �����ϰ� ��ġ �����ڸ� FlowLayout���� ����
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));           
        // �гο� ��ư�� �����Ͽ� �߰�
        panel.add(new JButton("Button1"));
        panel.add(new JButton("Button2"));
        panel.add(new JButton("Button3"));
        panel.add(new JButton("B4"));
        panel.add(new JButton("Long Button5"));
        add(panel);

        pack();
        setVisible(true);
	}
	
	public static void main(String args[]) {
		FlowLayout_test f = new FlowLayout_test();
	}
}
