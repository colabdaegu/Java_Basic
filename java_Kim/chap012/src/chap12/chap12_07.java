package chap12;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class chap12_07 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("이미지 넣기");
		frame.setLayout(new FlowLayout());
		
		ImageIcon img1 = new ImageIcon("C:/Users/USER/Documents/java_Kim/chap012/bin/chap12/thanks.jpg");
		ImageIcon img2 = new ImageIcon("C:/Users/USER/Documents/java_Kim/chap012/bin/chap12/start.png");
		
		JLabel label1 = new JLabel(img1);
		frame.add(label1);
		
		JButton button1 = new JButton("클릭하세요", img2);
		frame.add(button1);
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}
