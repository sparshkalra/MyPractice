package com.practice;

import java.io.IOException;
import java.util.Optional;

public class SapientExample2 
{
	public static void main(String[] args) throws IOException
	{
/*		String[] cmd = new String[1];
		cmd[0] = "File.java";
		Process process = Runtime.getRuntime().exec(cmd);
		
		System.out.println("Welcome");*/
		
		Optional ot = Optional.of("Game of Thrones");
		ot.get();
		String[] str = new String[10];
		Optional strOpt = Optional.ofNullable(str[9]);
		
		System.out.println(strOpt.isPresent());
		System.out.println(ot.isPresent());
		
	}

}
