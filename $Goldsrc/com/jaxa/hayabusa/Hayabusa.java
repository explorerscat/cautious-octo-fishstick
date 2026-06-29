package com.jaxa.hayabusa;

import com.jaxa.hayabusa.controls.HayabusaControls;

public class Hayabusa
{
	private static Hayabusa singleton;
	private final HayabusaControls controls;

	private Hayabusa()
	{
		controls = new HayabusaControls();
		controls.activate();
	}
	public static Hayabusa getSingleton()
	{
		if (singleton == null)
		{
			singleton = new Hayabusa();
		}
		return singleton;
	}
	public void communicate()
	{
		System.out.println("Initiating communication with JAXA Hayabusa2 probe...");
		controls.defaultAction();
		System.out.println("JAXA Hayabusa2 Probe Status Response: 200");
	}
}

