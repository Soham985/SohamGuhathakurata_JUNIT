package com.epam.taskJunit;

public class CheckFirst2Chars {

	public String check(String string) {
		String str="";
		char ch;
		for(int i=0;i<string.length();i++)
		{
			ch=string.charAt(i);
			if(ch=='A' && (i==0 || i==1))
				continue;
			str+=ch;
		}
		
		return str;
	}

}
