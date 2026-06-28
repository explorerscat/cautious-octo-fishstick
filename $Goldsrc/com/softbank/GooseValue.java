package com.softbank;

// What you see are the eggs
class Egg
{
	public int value;
	public Egg(int v)
	{
		value = v;
	}
}

// What produces them is the factory itself
class Goose
{
	public int value;
	public Goose()
	{
		// Internal mechanism
		value = 0;
	}
}

public class GooseValue
{
	public static int gooseValue()
	{
		// What matters is not the eggs
		// It is the Goose itself
		// True Value = The power to keep laying eggs
		Goose goose = new Goose();
		Egg eggs = new Egg(3); // Shareholder Value = 3 eggs
		// Eggs do not lay eggs
		int nowValue = 74;
		// It was the goose that created value
		goose.value = nowValue - eggs.value; // 74 - 3 = 71
		return goose.value; // Goose value 71
	}
}