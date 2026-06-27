package com.jaxa.hayabusa;

public class Hayabusa
{
	private static Hayabusa singleton;
	private Hayabusa()
	{
	}
	public static Hayabusa getSingleton()
	{
		if (singleton == null)
		{
			singleton = new Hayabusa();
		}
		return singleton;
	}
}

