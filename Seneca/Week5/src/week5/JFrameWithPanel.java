package week5;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameWithPanel extends JFrame {
	private JPanel panel = new JPanel();
	private JButton jbtOk = new JButton("OK");
	private JButton jbtCancel = new JButton("CANCEL");
	
	public JFrameWithPanel() {
		panel.add(jbtOk);
		panel.add(jbtCancel);
		
		this.setLayout(new GridLayout());
		this.add(panel);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JFrameWithPanel frame = new JFrameWithPanel();
		frame.setVisible(true);
	}

}
