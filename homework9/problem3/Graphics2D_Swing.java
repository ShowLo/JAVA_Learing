package problem3;

import java.awt.*;
import java.awt.geom.QuadCurve2D;

import javax.swing.*;

public class Graphics2D_Swing extends JFrame
{
	public Graphics2D_Swing()
	{
		super("Drawing graphics using the funtion in class Graphics2D");
		setVisible(true);
		setSize(1000,800);
	}
	public void paint(Graphics g)
	{
		Graphics2D g2d=(Graphics2D)g;
		super.paint(g2d);
		
		g2d.setColor(Color.RED);
		int xValues[]={470,500,510,520,550,530,538,510,482,490};
		int yValues[]={120,120,95,120,120,135,160,145,160,135};
		g2d.fillPolygon(xValues, yValues, 10);                     //画多边形
		
		Stroke stroke=new BasicStroke(15,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		g2d.setStroke(stroke);                                     //设置笔画粗细
		
		g2d.setColor(Color.MAGENTA);
		g2d.rotate(Math.toRadians(-20),510,715);
		g2d.drawLine(300, 715, 510, 715);                          //画线段
		g2d.rotate(-Math.toRadians(-20),510,715);
		g2d.rotate(Math.toRadians(20),510,715);
		g2d.drawLine(510, 715,720,715);                            //画线段
		g2d.rotate(-Math.toRadians(20),510,715);
		
		g2d.setColor(Color.GRAY);
		g2d.drawOval(310, 180, 400, 520);                          //画椭圆
		
		g2d.translate(300, 180);
		
		g2d.setColor(Color.BLUE);	
		QuadCurve2D curve=new QuadCurve2D.Double(5,5,90,65,5,115); //二次曲线
		g2d.translate(100, 100);                                   //平移
		g2d.draw(curve);                                           //画二次曲线     
		g2d.translate(-100, -100);   
		
		g2d.translate(300, 200);                                   //平移
		g2d.rotate(Math.toRadians(163));                           //设置旋转角度
		g2d.draw(curve);  
		g2d.translate(200, 20); 
		g2d.rotate(-Math.toRadians(163));                          //旋转复位
 
		g2d.setColor(Color.ORANGE);
		g2d.fillOval(0, 0,200,100);                                //画椭圆
		
		g2d.setColor(Color.GREEN);
		g2d.setPaint(new GradientPaint(10,10,Color.YELLOW,10,30,Color.GREEN,true));
		g2d.fillRect(0, 120, 200, 100);                            //画矩形
	}
}
