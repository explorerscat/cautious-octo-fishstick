package com.Wololo.MetaWololo;

public class Entity
{
	protected ShirtColour shirt;
	protected String name;
	protected int ConvertStrength;
	public ShirtColour getShirtColour()
	{
		return shirt;
	}
	public String getName()
	{
		return name;
	}
	public void convert(Priest other)
	{
		if (other.ConvertStrength >= ConvertStrength)
		{
			shirt = other.getShirtColour();
		}
	}
	private void init(ShirtColour c, String n)
	{
		shirt = c;
		name = n;
		ConvertStrength = 1;
	}
	public Entity(ShirtColour c)
	{
		init(c, "Entity");
	}
	public Entity(ShirtColour c, String n)
	{
		init(c, n);
	}
}

