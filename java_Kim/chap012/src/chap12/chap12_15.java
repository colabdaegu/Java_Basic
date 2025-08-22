package chap12;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;

public class chap12_15 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("도형 그리기");
		frame.setLayout(new CardLayout());
		
		MyPanel panel = new MyPanel();
		frame.add(panel, BorderLayout.CENTER);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
