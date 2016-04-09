package problem5;

import java.util.Scanner;

public class StringEncryptor 
{
	public static void main(String[] args)
	{
		Encode enc=new Encode();
		Decode dec=new Decode();
		String input="We will break out of prison at dawn";
		System.out.println("原始字符串为："+input);
		//第一种加密方式
		System.out.println("第一种加密方式——————————————————————————————————————");
		String encryption1=enc.result1_encode(input);
		System.out.println("加密后的字符串为："+encryption1);
		String decryption1=dec.result1_decode(encryption1);
		System.out.println("解密后的字符串为："+decryption1);
		//第二种加密方式
		Scanner scanner=new Scanner(System.in);
		System.out.println("第二种加密方式——————————————————————————————————————");
		System.out.println("请输入加密密码：");
		long encode_key=scanner.nextLong();
		String encryption2=enc.result2_encode(input,encode_key);
		System.out.println("加密后的字符串为："+encryption2);
		System.out.println("请输入解密密码：");
		long decode_key=scanner.nextLong();
		String decryption2=dec.result2_decode(encryption2,decode_key);
		System.out.println("解密后的字符串为："+decryption2);
	
		scanner.close();
	}
}
