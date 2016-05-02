package problem2;

public class StringEncryptorTester
{
	public static void main(String args[])
	{
		StringEncryptor se=new StringEncryptor();
		
		String testString="We will break out of prison at dawn";
		
		String encodeString=se.Encode(testString);
		
		System.out.println("加密后为："+encodeString);
		
		String decodeString=se.Decode(encodeString);
		
		System.out.println("解密后为："+decodeString);
		
	}
}
