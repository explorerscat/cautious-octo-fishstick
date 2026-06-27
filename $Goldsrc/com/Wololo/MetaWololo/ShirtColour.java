package com.Wololo.MetaWololo;

public enum ShirtColour
{
	RED,
	BLUE;

	@Override
	public String toString()
	{
		String tmp;
		switch (this)
		{
			case RED:
				tmp = "Red";
				break;
			case BLUE:
				tmp = "Blue";
				break;
			default:
				tmp = "Nope";
		}
		tmp += "-colour shirt";
		return tmp;
	}
}

