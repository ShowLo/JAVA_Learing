package problem5;

import java.util.Scanner;

public class StringEncryptor 
{
	public static void main(String[] args)
	{
		Encode enc=new Encode();
		Decode dec=new Decode();
		String input="We will break out of prison at dawn";
		System.out.println("ԭʼ�ַ���Ϊ��"+input);
		//��һ�ּ��ܷ�ʽ
		System.out.println("��һ�ּ��ܷ�ʽ����������������������������������������������������������������������������");
		String encryption1=enc.result1_encode(input);
		System.out.println("���ܺ���ַ���Ϊ��"+encryption1);
		String decryption1=dec.result1_decode(encryption1);
		System.out.println("���ܺ���ַ���Ϊ��"+decryption1);
		//�ڶ��ּ��ܷ�ʽ
		Scanner scanner=new Scanner(System.in);
		System.out.println("�ڶ��ּ��ܷ�ʽ����������������������������������������������������������������������������");
		System.out.println("������������룺");
		long encode_key=scanner.nextLong();
		String encryption2=enc.result2_encode(input,encode_key);
		System.out.println("���ܺ���ַ���Ϊ��"+encryption2);
		System.out.println("������������룺");
		long decode_key=scanner.nextLong();
		String decryption2=dec.result2_decode(encryption2,decode_key);
		System.out.println("���ܺ���ַ���Ϊ��"+decryption2);
	
		scanner.close();
	}
}
