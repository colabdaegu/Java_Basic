package chap12;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class chap12_19 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("YES/No 선택");
		frame.setLayout(null);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		int result = JOptionPane.showConfirmDialog(frame, "선택하세요", "제목", JOptionPane.YES_NO_CANCEL_OPTION);
		
		switch (result) {
		case JOptionPane.YES_OPTION: JOptionPane.showMessageDialog(frame,  "Yes 누름");
		break;
		case JOptionPane.NO_OPTION: JOptionPane.showMessageDialog(frame,  "No 누름");
		break;
		default: JOptionPane.showMessageDialog(frame,  "Cancel 누름");
		}
		
		
	}

}
