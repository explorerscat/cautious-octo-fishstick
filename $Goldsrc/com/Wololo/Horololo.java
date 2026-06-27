package com.Wololo;

import com.ghc.wz.*;

public class Horololo
{
	private static double _horoscope(double x, double y, double z)
	{
		double w = _embiggen(Maths.sin(x)) * _embiggen(-Maths.sin(y)) * _embiggen(Maths.sin(z));
		double v = Maths.sqrt(w);
		return -(v * 0.05);
	}
	private static double _embiggen(double s)
	{
		double l = s * 1000.0;
		return l;
	}
	public static double horoscope()
	{
		long time = System.currentTimeMillis() / 1000L;
		double dtime = (double)time;
		double special = Maths.rand();
		double scale = _embiggen(special);
		double x = dtime - scale;
		double y = Maths.cos(dtime / 1000.0);
		double z = dtime + scale;
		double w = _horoscope(x, y, z);
		if (Double.isNaN(w))
		{
			w = -0.0;
		}
		return -w;
	}
}

