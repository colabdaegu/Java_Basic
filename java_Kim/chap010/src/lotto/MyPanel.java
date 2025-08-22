package lotto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // 당첨 번호 글자툴
        Font font10 = new Font("굴림 보통", Font.BOLD, 35);
        g.setColor(Color.BLACK);
        g.setFont(font10);
        g.drawString("▼ 당첨 번호 ▼", 180, 60);
        
        g.setColor(Color.CYAN);
        g.drawLine(10, 85, 590, 85);
        g.drawLine(10, 82, 590, 82);
        
        
        
        // 당첨 번호
        g.setColor(Color.RED);
        g.fillOval(0, 100, 100, 100);
        
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);
        g.drawString(String.valueOf(LottoGet.winNum1), 35, 160);
        
        
        g.setColor(Color.ORANGE);
        g.fillOval(100, 100, 100, 100);
        
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(String.valueOf(LottoGet.winNum2), 135, 160);
        
        
        g.setColor(Color.YELLOW);
        g.fillOval(200, 100, 100, 100);
        
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(String.valueOf(LottoGet.winNum3), 235, 160);
        
        
        g.setColor(Color.GREEN);
        g.fillOval(300, 100, 100, 100);
        
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(String.valueOf(LottoGet.winNum4), 335, 160);
        
        
        g.setColor(Color.BLUE);
        g.fillOval(400, 100, 100, 100);
        
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(String.valueOf(LottoGet.winNum5), 435, 160);
        
        
        g.setColor(Color.GRAY);
        g.fillOval(500, 100, 100, 100);
        
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(String.valueOf(LottoGet.winNum6), 535, 160);
        
        
        
        //선택 번호 글자툴
        Font font20 = new Font("궁서 보통", Font.BOLD, 30);
        g.setColor(Color.DARK_GRAY);
        g.setFont(font20);
        g.drawString("▼ 선택한 번호 ▼", 185, 310);
        
        g.setColor(Color.MAGENTA);
        g.drawLine(10, 335, 590, 335);
        g.drawLine(10, 332, 590, 332);
        
        
        
        // 선택 번호
        g.setColor(Color.RED);
        g.drawOval(0, 350, 100, 100);
        
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(String.valueOf(GameWindow.Snum1), 35, 410);
        
        
        g.setColor(Color.ORANGE);
        g.drawOval(100, 350, 100, 100);
        
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(String.valueOf(GameWindow.Snum2), 135, 410);
        
        
        g.setColor(Color.YELLOW);
        g.drawOval(200, 350, 100, 100);
        
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(String.valueOf(GameWindow.Snum3), 235, 410);
        
        
        g.setColor(Color.GREEN);
        g.drawOval(300, 350, 100, 100);
        
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(String.valueOf(GameWindow.Snum4), 335, 410);
        
        
        g.setColor(Color.BLUE);
        g.drawOval(400, 350, 100, 100);
        
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(String.valueOf(GameWindow.Snum5), 435, 410);
        
        
        g.setColor(Color.GRAY);
        g.drawOval(500, 350, 100, 100);
        
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(String.valueOf(GameWindow.Snum6), 535, 410);
        
        
        // 결과 출력
        g.setColor(Color.MAGENTA);
        g.drawRect(0, 500, 600, 70);
        g.fillRect(0, 500, 85, 70);
        
        Font font2 = new Font("굴림 보통", Font.BOLD, 35);
        g.setColor(Color.WHITE);
        g.setFont(font2);
        g.drawString("결과", 5, 550);
        
        Font font3 = new Font("궁서 보통", Font.BOLD, 40);
        g.setColor(Color.BLACK);
        g.setFont(font3);
        g.drawString(ResultSum.result, 250, 550);
        
        
    }
}
