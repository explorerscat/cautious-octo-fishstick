package com.ghc;

import com.Wololo.MetaWololo.Entity;
import com.Wololo.MetaWololo.ShirtColour;

public class Hedgehog extends Entity
{
	private final int quillCount;

	public Hedgehog(String name, int quillCount)
	{
		super(ShirtColour.RED, name);
		this.quillCount = quillCount;
	}

	public int getQuillCount()
	{
		return quillCount;
	}

	public String describe()
	{
		return getName() + " has " + quillCount + " quills and a " + getShirtColour();
	}

	public static Hedgehog[] starterColony()
	{
		return new Hedgehog[] {
			new Hedgehog("Hazel", 7000),
			new Hedgehog("Pip", 6800),
			new Hedgehog("Bramble", 7200),
		};
	}
}
