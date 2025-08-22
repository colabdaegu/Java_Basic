package chap12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class chap12_final {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("라디오버튼");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));
		
		JRadioButton radio1 = new JRadioButton("포르쉐");
		JRadioButton radio2 = new JRadioButton("벤츠");
		JRadioButton radio3 = new JRadioButton("BMW");
		JRadioButton radio4 = new JRadioButton("아우디");
		frame.add(radio1);
		frame.add(radio2);
		frame.add(radio3);
		frame.add(radio4);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(radio1);
		grp.add(radio2);
		grp.add(radio3);
		grp.add(radio4);
		
		JButton button1 = new JButton("클릭하세요");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radio1.isSelected()) {
					JOptionPane.showMessageDialog(null,  "선택한 차량은 포르쉐입니다.");
				} else if (radio2.isSelected()) {
					JOptionPane.showMessageDialog(null,  "선택한 차량은 벤츠입니다.");
				} else if (radio3.isSelected()) {
					JOptionPane.showMessageDialog(null,  "선택한 차량은 BMW입니다.");
				} else {
					JOptionPane.showMessageDialog(null,  "선택한 차량은 아우디입니다.");
				}

				
			}
		});
		frame.add(button1);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}
