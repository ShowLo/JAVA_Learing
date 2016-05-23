package problem4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class MyFrame
{
	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame("JFrame Exp");
		frame.setSize(700,500);                                                //设置长宽
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();       //获得屏幕尺寸
		frame.setLocation((dimension.width-700)/2, (dimension.height-500)/2);  //调整到屏幕中间
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  //设置默认关闭窗口操作
		frame.setLayout(new GridLayout(1,2));                                  //网格布局，两列一行
		
		GridBagConstraints ctr1=new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(1,1,1,1),0,0);
		GridBagConstraints ctr2=new GridBagConstraints(0,1,2,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(10,10,10,10),0,0);
		GridBagConstraints ctr3=new GridBagConstraints(0,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(1,1,1,1),0,0);
		
		JPanel leftPanel=new JPanel(new GridBagLayout());                      //左面板，采用GridBagLayout布局
		JScrollPane rightPane=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//右面板，有滚动条
		frame.add(leftPanel);
		frame.add(rightPane);
		
		JPanel inputPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));       //左面板的输入
		JLabel label=new JLabel("Input");
		JTextField textField=new JTextField(20);                               //20列的单行文本框
		inputPanel.add(label);
		inputPanel.add(textField);
		leftPanel.add(inputPanel,ctr1);                                        //放在左面板的上部
		
		JScrollPane jsp=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		Vector<String> vector=new Vector<String>();
		for(int i=1;i<=10;++i)
			vector.add("Item "+i);
		JList list=new JList(vector);                                          //列表框
		list.setFixedCellWidth(200);                                           //设置宽度
		jsp.setViewportView(list);
		leftPanel.add(jsp, ctr2);                                              //放在左面板的中部
		
		JButton button=new JButton("确定");                                    //确定按钮
		leftPanel.add(button, ctr3);                                           //放在左面板的下部
		
		JTextArea textArea=new JTextArea(10,40);                               //文本域
		rightPane.setViewportView(textArea);                                   //加到右面板
		
		button.addMouseListener(new MyMouseAdapter(textField, list, textArea));//添加用于处理鼠标事件的监视器
		
		frame.setVisible(true);
	}
}

class MyMouseAdapter extends MouseAdapter
{
	private JTextField textField;
	private JList list;
	private JTextArea textArea;
	
	
	public MyMouseAdapter(JTextField textField, JList list, JTextArea textArea)
	{
		super();
		this.textField = textField;
		this.list = list;
		this.textArea = textArea;
	}


	public void mouseClicked(MouseEvent e)                                     //鼠标点击
	{
		textArea.setText("");
		textArea.append("Input is "+textField.getText());                      //添加到文本域显示
		textArea.append(System.getProperty("line.separator"));                 //换行
		textArea.append("Selection is "+list.getSelectedValue());              //添加到文本域显示
		textArea.append(System.getProperty("line.separator"));
	}
}