package com.Wololo.MetaWololo;

public class Priest extends Entity
{
    public Priest(ShirtColour c)
    {
        super(c, "Priest");
	    ConvertStrength = 3;
    }
    public void convert(Entity other)
    {
        other.converted_by(this);
    }
}

