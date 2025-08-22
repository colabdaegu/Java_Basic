package lotto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameWindow {
	int num1, num2, num3, num4, num5, num6;
	
	static int Snum1, Snum2, Snum3, Snum4, Snum5, Snum6;
	
	private int mode = 0;
	
    private JFrame frame2;
    
    static int[] lottoAry = new int[6];
	int num = 0;
	
	static int maxNum = 45;
	
	boolean execution = true;

    public GameWindow(int mode) {
    	this.mode = mode;
    	
        frame2 = new JFrame();
        frame2.setTitle("게임 윈도우");
        frame2.setLayout(new BorderLayout());
        
        
        if (mode == 0) {
    		while(true) {
    			execution = true;
        		
        		num1 = Integer.parseInt(JOptionPane.showInputDialog(frame2, "숫자 1번 입력 (1~" + maxNum + "까지)"));
            	num2 = Integer.parseInt(JOptionPane.showInputDialog(frame2, "숫자 2번 입력 (1~" + maxNum + "까지)"));
            	num3 = Integer.parseInt(JOptionPane.showInputDialog(frame2, "숫자 3번 입력 (1~" + maxNum + "까지)"));
            	num4 = Integer.parseInt(JOptionPane.showInputDialog(frame2, "숫자 4번 입력 (1~" + maxNum + "까지)"));
            	num5 = Integer.parseInt(JOptionPane.showInputDialog(frame2, "숫자 5번 입력 (1~" + maxNum + "까지)"));
            	num6 = Integer.parseInt(JOptionPane.showInputDialog(frame2, "숫자 6번 입력 (1~" + maxNum + "까지)"));
            	
            	lottoAry[0] = num1; lottoAry[1] = num2; lottoAry[2] = num3; lottoAry[3] = num4; lottoAry[4] = num5; lottoAry[5] = num6;
            	
        		for (int i = 0; i < lottoAry.length - 1; i++) {
        		    for (int j = i + 1; j < lottoAry.length; j++) {
        		        if (lottoAry[i] == lottoAry[j]) {
        		        	JOptionPane.showMessageDialog(null, "중복된 값이 포함되어 있습니다. 다시 진행해주십시오.");
        		        	
        		        	execution = false;
        		        	
        		        	continue;
        		        }
        		    }
        		}
            	
            	if (execution) {
            		String setNum = num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6;
                	
                	int result = JOptionPane.showConfirmDialog(null,  setNum + " (으)로 진행하시겠습니까?", "제목", JOptionPane.YES_NO_CANCEL_OPTION);
                	
                	if (result == JOptionPane.YES_OPTION) {
                		ResultSum resultSum = new ResultSum();
                		break;
                	}
                	else if (result == JOptionPane.NO_OPTION)
                		continue;
                	else
                		System.exit(0);
            	}
    		}
        }
        else if (mode == 1) {
        	while(true) {
        		execution = true;
                
            	num1 = (int)(Math.random() * maxNum + 1);
				num2 = (int)(Math.random() * maxNum + 1);
				num3 = (int)(Math.random() * maxNum + 1);
				num4 = (int)(Math.random() * maxNum + 1);
				num5 = (int)(Math.random() * maxNum + 1);
				num6 = (int)(Math.random() * maxNum + 1);
				
				lottoAry[0] = num1; lottoAry[1] = num2; lottoAry[2] = num3; lottoAry[3] = num4; lottoAry[4] = num5; lottoAry[5] = num6;
            	
        		for (int i = 0; i < lottoAry.length - 1; i++) {
        		    for (int j = i + 1; j < lottoAry.length; j++) {
        		        if (lottoAry[i] == lottoAry[j]) {
        		        	JOptionPane.showMessageDialog(null, "중복된 값이 포함되어, 다시 진행합니다.");
        		        	
        		        	execution = false;
        		        	
        		        	continue;
        		        }
        		    }
        		}
            	
            	if (execution) {
            		String setNum = num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6;
                	
                	int result = JOptionPane.showConfirmDialog(null,  setNum + " (으)로 진행하시겠습니까?", "제목", JOptionPane.YES_NO_CANCEL_OPTION);
                	
                	if (result == JOptionPane.YES_OPTION) {
                		ResultSum resultSum = new ResultSum();
                		break;
                	}
                	else if (result == JOptionPane.NO_OPTION)
                		continue;
                	else
                		System.exit(0);
            	}
            }
        }
        Snum1 = num1; Snum2 = num2; Snum3 = num3; Snum4 = num4; Snum5 = num5; Snum6 = num6;
        

        
        MyPanel panel = new MyPanel();
        frame2.add(panel);
        
        
        JButton btn1 = new JButton("종료하기");
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        frame2.add(btn1, BorderLayout.SOUTH);
        
        frame2.setSize(620, 670);
        frame2.setVisible(true);
    }
}