package com.igndirodog;

import com.jype.two_pm.*;
import com.Wololo.MetaWololo.*;
import com.Wololo.*;

public class Spam
{
	public static void main(String args[])
	{
		System.out.println(Go_Crazy.getSingleton().state);
		System.out.println("Horoscope: " + Horololo.horoscope());
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
	}
}
