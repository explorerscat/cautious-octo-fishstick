package com.Wololo;

import com.ghc.wz.*;
import com.ghc.Hedgehog;

public class Horololo
{
	private static double _horoscope(double x, double y, double z, int hedgehogCount)
	{
		double w = _embiggen(Maths.sin(x)) * _embiggen(-Maths.sin(y)) * _embiggen(Maths.sin(z));
		double hedgehogInfluence = Maths.max(1, hedgehogCount);
		double v = Maths.sqrt(Maths.abs(w) + hedgehogInfluence);
		return -(v * 0.05);
	}
	private static double _embiggen(double s)
	{
		double l = s * 1000.0;
		return l;
	}
	public static double horoscope()
	{
		return horoscope(Hedgehog.starterColony());
	}

	public static double horoscope(Hedgehog[] hedgehogs)
	{
		long time = System.currentTimeMillis() / 1000L;
		double dtime = (double)time;
		double special = Maths.rand();
		double scale = _embiggen(special);
		double x = dtime - scale;
		double y = Maths.cos(dtime / 1000.0);
		double z = dtime + scale;
		int hedgehogCount = hedgehogs == null ? 0 : hedgehogs.length;
		double w = _horoscope(x, y, z, hedgehogCount);
		if (Double.isNaN(w))
		{
			w = -0.05 * Maths.max(1, hedgehogCount);
		}
		return -w;
	}
}

