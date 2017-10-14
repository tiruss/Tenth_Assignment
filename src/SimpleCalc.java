import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalc extends JFrame implements ActionListener{
  
	private JPanel panel;
	private JTextField numberCalc;
	private JButton[] buttons;
	private String[] labels = { 
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "=",
	};
	public static String numbers = "";
	float currentCalc = 0;
	float calcOperation = 0;
	
	public SimpleCalc() {
		numberCalc = new JTextField(35);
		panel = new JPanel();
		numberCalc.setText("0.");
		numberCalc.setEnabled(false);	// false = cannot respond to an event
  
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else 
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		
		//numbers to input
		buttons[5].addActionListener(this);
		buttons[6].addActionListener(this);
		buttons[7].addActionListener(this);
		buttons[10].addActionListener(this);
		buttons[11].addActionListener(this);
		buttons[12].addActionListener(this);
		buttons[15].addActionListener(this);
		buttons[16].addActionListener(this);
		buttons[17].addActionListener(this);
		buttons[20].addActionListener(this);
		
		OperatorAction div = new OperatorAction(1);
		buttons[8].addActionListener(div);
		
		OperatorAction sqrt = new OperatorAction(2);
		buttons[9].addActionListener(sqrt);
		
		OperatorAction mul = new OperatorAction(3);
		buttons[13].addActionListener(mul);
		
		OperatorAction nmg = new OperatorAction(4);
		buttons[14].addActionListener(nmg);
		
		OperatorAction sub = new OperatorAction(5);
		buttons[18].addActionListener(sub);
		
		OperatorAction add = new OperatorAction(6);
		buttons[23].addActionListener(add);
		
		OperatorAction clear = new OperatorAction(7);
		buttons[3].addActionListener(clear);
		
		buttons[24].addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				numbers = "";
				if(!numberCalc.getText().isEmpty()) 
				{
					float number = Float.parseFloat(numberCalc.getText());
					if (calcOperation == 1)
					{
						float calculate = currentCalc % number;
						numberCalc.setText(Float.toString(calculate));
					}
					else if(calcOperation == 2)
					{
						float calculate = (float) Math.pow(currentCalc, number);
						numberCalc.setText(Float.toString(calculate));
					}
					else if (calcOperation == 3)
					{
						float calculate = currentCalc * number;
						numberCalc.setText(Float.toString(calculate));
					}
					else if (calcOperation == 4)
					{
						float calculate = currentCalc / number;
						numberCalc.setText(Float.toString(calculate));
					}
					else if (calcOperation == 5)
					{
						float calculate = currentCalc - number;
						numberCalc.setText(Float.toString(calculate));
					}
					else if (calcOperation == 6)
					{
						float calculate = currentCalc + number;
						numberCalc.setText(Float.toString(calculate));
					}
					else if (calcOperation == 7)
					{
						float calculate = 0;
						numberCalc.setText(Float.toString(calculate));
					}
				}
			}
		});
		add(numberCalc, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
		

	}
  
	public static void main(String args[]) {
		SimpleCalc s = new SimpleCalc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		numbers += e.getActionCommand();
        
        numberCalc.setText(numberCalc.getText());
        numberCalc.setText(numbers);
	}
	
	public class OperatorAction implements ActionListener
    {
        public int operator;
        
        public OperatorAction(int i)
        {
            operator = i;
        }
        
        public void actionPerformed(ActionEvent event)
        {
        	numbers = "";
        	currentCalc = Float.parseFloat(numberCalc.getText());
        	numberCalc.setText("");
            calcOperation = operator;
            }
        }
}

