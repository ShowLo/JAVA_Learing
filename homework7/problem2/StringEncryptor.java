package problem2;

import java.util.HashMap;

public class StringEncryptor 
{
	private HashMap<Character,Character> hashmap;

	private void SetHashMap()
	{
		hashmap=new HashMap<Character,Character>();
		
		hashmap.put('a', 'v');
		hashmap.put('b', 'e');
		hashmap.put('c', 'k');
		hashmap.put('d', 'n');
		hashmap.put('e', 'o');
		hashmap.put('f', 'h');
		hashmap.put('g', 'z');
		hashmap.put('h', 'f');
		hashmap.put('i', ' ');
		hashmap.put('j', 'i');
		hashmap.put('k', 'l');
		hashmap.put('l', 'j');
		hashmap.put('m', 'x');
		hashmap.put('n', 'd');
		hashmap.put('o', 'm');
		hashmap.put('p', 'y');
		hashmap.put('q', 'g');
		hashmap.put('r', 'b');
		hashmap.put('s', 'r');
		hashmap.put('t', 'c');
		hashmap.put('u', 's');
		hashmap.put('v', 'w');
		hashmap.put('w', 'q');
		hashmap.put('x', 'u');
		hashmap.put('y', 'p');
		hashmap.put('z', 't');
		hashmap.put(' ', 'a');
		
		hashmap.put('A', 'V');
		hashmap.put('B', 'E');
		hashmap.put('C', 'K');
		hashmap.put('D', 'N');
		hashmap.put('E', 'O');
		hashmap.put('F', 'H');
		hashmap.put('G', 'Z');
		hashmap.put('H', 'F');
		hashmap.put('I', '_');
		hashmap.put('J', 'I');
		hashmap.put('K', 'L');
		hashmap.put('L', 'J');
		hashmap.put('M', 'X');
		hashmap.put('N', 'D');
		hashmap.put('O', 'M');
		hashmap.put('P', 'Y');
		hashmap.put('Q', 'G');
		hashmap.put('R', 'B');
		hashmap.put('S', 'R');
		hashmap.put('T', 'C');
		hashmap.put('U', 'S');
		hashmap.put('V', 'W');
		hashmap.put('W', 'Q');
		hashmap.put('X', 'U');
		hashmap.put('Y', 'P');
		hashmap.put('Z', 'T');
		hashmap.put('_', 'A');
	}
	
	public StringEncryptor()
	{
		SetHashMap();
	}

	public String Encode(String inputString)
	{
		String reString="";
		int length=inputString.length();
		char item;
		
		for(int i=0;i<length;++i)
		{
			item=inputString.charAt(i);
			reString+=hashmap.get(item);
		}
		
		return reString;
	}
	
	public String Decode(String inputString)
	{
		String reString="";
		int length=inputString.length();
		char item;
		
		for(int i=0;i<length;++i)
		{
			item=inputString.charAt(i);
			for(Character ch:hashmap.keySet())
			{
				if(hashmap.get(ch)==item)
				{
					reString+=ch;
				}
			}
		}
		
		return reString;
	}
}
