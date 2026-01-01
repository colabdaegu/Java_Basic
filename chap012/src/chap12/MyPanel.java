package chap12;

import java.awt.Color;
import java.awt.Graphics;

public class MyPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawLine(10, 10, 100, 100);
		g.setColor(Color.RED);
		g.drawOval(30, 30, 50, 30);
		g.fillOval(130, 30, 50, 30);
		g.setColor(Color.GREEN);
		g.drawRect(130, 130, 50, 50);
		g.setColor(Color.MAGENTA);
		g.fillRect(100, 100, 50, 50);
	}
}
