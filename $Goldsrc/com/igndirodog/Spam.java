package com.igndirodog;

import com.jype.two_pm.*;
import com.Wololo.MetaWololo.*;
import com.Wololo.*;
import com.softbank.*;
import com.ghc.*;

public class Spam
{
	public static void main(String args[])
	{
		Hedgehog[] hedgehogs = Hedgehog.starterColony();

		System.out.println(Go_Crazy.getSingleton().state);
		System.out.println("Horoscope: " + Horololo.horoscope(hedgehogs));
		Teuton t = new Teuton(ShirtColour.RED);
		Entity e = new Entity(ShirtColour.RED, "Villager");
		Priest p = new Priest(ShirtColour.BLUE);
		
		System.out.println(t.getName() + " has a " + t.getShirtColour());
		p.convert(t);
		System.out.println(
			p.getName() +
			" with a " +
			p.getShirtColour() +
			" converts " +
			t.getName()
		);
		System.out.println(t.getName() + " has a " + t.getShirtColour());

		System.out.println(e.getName() + " has a " + e.getShirtColour());
		p.convert(e);
		System.out.println(
			p.getName() +
			" with a " +
			p.getShirtColour() +
			" converts " +
			e.getName()
		);
		System.out.println(e.getName() + " has a " + e.getShirtColour());

		int gooseValue = GooseValue.gooseValue();
		System.out.println("Goose value");
		System.out.println(gooseValue);

		System.out.println("Hedgehog count: " + hedgehogs.length);
		for (Hedgehog hedgehog : hedgehogs)
		{
			System.out.println(hedgehog.describe());
		}
		System.out.println(hedgehogs[0].getName() + " has a " + hedgehogs[0].getShirtColour());
		p.convert(hedgehogs[0]);
		System.out.println(
			p.getName() +
			" with a " +
			p.getShirtColour() +
			" converts " +
			hedgehogs[0].getName()
		);
		System.out.println(hedgehogs[0].getName() + " has a " + hedgehogs[0].getShirtColour());
	}
}
