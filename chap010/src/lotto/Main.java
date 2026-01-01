package lotto;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("윈도우");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 20));
		
		JLabel label1 = new JLabel("진행할 로또 방식 선택하세요~");
		
		Font font = new Font("궁서 보통", Font.BOLD, 30);
		label1.setFont(font);
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		frame.add(label1);
		
		ImageIcon img1 = new ImageIcon("C:/Users/USER/Documents/java_Kim/chap010/src/lotto/LottoMain.png");
		JLabel imgLabel = new JLabel(img1);
		frame.add(imgLabel);
		
		JRadioButton radio1 = new JRadioButton("수동");
		JRadioButton radio2 = new JRadioButton("자동");
		frame.add(radio1);
		frame.add(radio2);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(radio1);
		grp.add(radio2);
		
		
		radio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "수동을 선택하셨습니다.");
				
				GameWindow gamewindow = new GameWindow(0);
				
				
				frame.dispose();
			}
		});
		radio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "자동을 선택하셨습니다.");
				
				GameWindow gamewindow = new GameWindow(1);
				
				
				frame.dispose();
			}
		});
		
        LottoGet lottoGet = new LottoGet();
        
        frame.setSize(500,450);
        frame.setVisible(true);
	}

}
