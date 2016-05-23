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
		frame.setSize(700,500);                                                //���ó���
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();       //�����Ļ�ߴ�
		frame.setLocation((dimension.width-700)/2, (dimension.height-500)/2);  //��������Ļ�м�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  //����Ĭ�Ϲرմ��ڲ���
		frame.setLayout(new GridLayout(1,2));                                  //���񲼾֣�����һ��
		
		GridBagConstraints ctr1=new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(1,1,1,1),0,0);
		GridBagConstraints ctr2=new GridBagConstraints(0,1,2,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(10,10,10,10),0,0);
		GridBagConstraints ctr3=new GridBagConstraints(0,2,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(1,1,1,1),0,0);
		
		JPanel leftPanel=new JPanel(new GridBagLayout());                      //����壬����GridBagLayout����
		JScrollPane rightPane=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//����壬�й�����
		frame.add(leftPanel);
		frame.add(rightPane);
		
		JPanel inputPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));       //����������
		JLabel label=new JLabel("Input");
		JTextField textField=new JTextField(20);                               //20�еĵ����ı���
		inputPanel.add(label);
		inputPanel.add(textField);
		leftPanel.add(inputPanel,ctr1);                                        //�����������ϲ�
		
		JScrollPane jsp=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		Vector<String> vector=new Vector<String>();
		for(int i=1;i<=10;++i)
			vector.add("Item "+i);
		JList list=new JList(vector);                                          //�б��
		list.setFixedCellWidth(200);                                           //���ÿ��
		jsp.setViewportView(list);
		leftPanel.add(jsp, ctr2);                                              //�����������в�
		
		JButton button=new JButton("ȷ��");                                    //ȷ����ť
		leftPanel.add(button, ctr3);                                           //�����������²�
		
		JTextArea textArea=new JTextArea(10,40);                               //�ı���
		rightPane.setViewportView(textArea);                                   //�ӵ������
		
		button.addMouseListener(new MyMouseAdapter(textField, list, textArea));//������ڴ�������¼��ļ�����
		
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


	public void mouseClicked(MouseEvent e)                                     //�����
	{
		textArea.setText("");
		textArea.append("Input is "+textField.getText());                      //��ӵ��ı�����ʾ
		textArea.append(System.getProperty("line.separator"));                 //����
		textArea.append("Selection is "+list.getSelectedValue());              //��ӵ��ı�����ʾ
		textArea.append(System.getProperty("line.separator"));
	}
}