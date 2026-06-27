package com.jype.two_pm; // 2pm not allowed identifier

public class Go_Crazy
{
	private static Go_Crazy singleton = null;
	public String state = "미친거 아니야?";
	private Go_Crazy()
	{
	}
	public static Go_Crazy getSingleton()
	{
		if (singleton == null)
		{
			singleton = new Go_Crazy();
		}
		return singleton;
	}
}

