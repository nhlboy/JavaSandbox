package week5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton jbt = new JButton("OK!");
	private JButton jbtCancel = new JButton("Cancel!");
	
	public MyFrame() {
		this.add(this.jbt);
		this.add(this.jbtCancel);
		this.setSize(400, 300);
//		myFrame.setLocation(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		myFrame.setVisible(true);
	}

}
