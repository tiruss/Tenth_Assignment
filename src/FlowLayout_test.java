import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout_test extends JFrame{
	public FlowLayout_test() {
		setTitle("FlowLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 패널을 생성하고 배치 관리자를 FlowLayout으로 설정
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));           
        // 패널에 버튼을 생성하여 추가
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
