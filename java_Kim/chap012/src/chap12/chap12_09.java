package chap12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class chap12_09 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("목록 선택");
		
		frame.setLayout(new BorderLayout(5,5));
		
		ImageIcon img1 = new ImageIcon("C:/Users/USER/Documents/java_Kim/chap012/bin/chap12/thanks.jpg");
		
		JButton btn1 = new JButton("버튼1");
		frame.add(btn1, BorderLayout.NORTH);
		JButton btn2 = new JButton("버튼2");
		frame.add(btn2, BorderLayout.WEST);
		JButton btn3 = new JButton("버튼3", img1);
		frame.add(btn3, BorderLayout.CENTER);
		JButton btn4 = new JButton("버튼4");
		frame.add(btn4, BorderLayout.EAST);
		JButton btn5 = new JButton("버튼5");
		frame.add(btn5, BorderLayout.SOUTH);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
