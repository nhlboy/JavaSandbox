package week5;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameWithFlowLayout extends JFrame {
//	private JLabel lbl1 = new JLabel("First Name");
//	private JLabel lbl2 = new JLabel("MI");
//	private JLabel lbl3 = new JLabel("Last Name");
	private JLabel[] lbls = new JLabel[3];
	
//	private JTextField txtField1 = new JTextField(10);
//	private JTextField txtField2 = new JTextField(1);
//	private JTextField txtField3 = new JTextField(10);
	private JTextField[] txtFields = new JTextField[3];
	
	FlowLayout flowLayout = new FlowLayout();
	
	public JFrameWithFlowLayout() {
		flowLayout.setAlignment(FlowLayout.LEFT);
		this.setLayout(flowLayout);
		
		lbls[0] =  new JLabel("First Name");
		lbls[1] =  new JLabel("MI");
		lbls[2] =  new JLabel("Last Name");
		txtFields[0] =  new JTextField(7);
		txtFields[1] =  new JTextField(1);
		txtFields[2] =  new JTextField(7);
		
		for (int i = 0; i < lbls.length; i++) {
			this.add(lbls[i]);
			this.add(txtFields[i]);
		}
		
//		this.add(lbl1);
//		this.add(txtField1);
//		this.add(lbl2);
//		this.add(txtField2);
//		this.add(lbl3);
//		this.add(txtField3);		
		
		this.setTitle("JFrame with Flow Layout");
		this.setSize(150, 250);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JFrameWithFlowLayout frame = new JFrameWithFlowLayout();
		frame.setVisible(true);
	}

}
