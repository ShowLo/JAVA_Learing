﻿package problem3;

import java.util.ArrayList;

public class Data
{
	ArrayList<String> arrayList=new ArrayList<String>();
	
	int size;               //总数据数
	int number=0;           //实际数据量
	int order=1;            //数据号
	int totalConsumeNum=0;  //消费数目
	
	public Data(int size)
	{
		this.size=size;
	}
	
}
