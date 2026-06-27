package com.jaxa.hayabusa.controls;

public class HayabusaControls
{
	protected boolean on;
	public void activate()
	{
		on = true;
	}
	public void deactivate()
	{
		on = false;
	}
	public void defaultAction()
	{
		if (!on) return;
		System.out.println("sys.audit: defaultAction");
	}
}

