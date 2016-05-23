package problem2;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JApplet;

public class GraphicsApplet extends JApplet
{
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(new Color(113,99,174));
		g.drawLine(20, 0, 200, 200);
		
		g.setColor(Color.CYAN);
		g.fillRect(250, 0, 300, 200);
		
		g.setColor(Color.BLUE);
		g.fillRoundRect(20, 300, 200, 250, 50, 50);
		
		g.setColor(Color.gray);
		g.fill3DRect(500, 300, 200, 250, true);
		
		g.setColor(Color.ORANGE);
		g.fillOval(200, 600, 500, 350);
		
		g.setColor(Color.GREEN);
		g.fillArc(50, 0, 200, 200, 30, 60);
	}
}