package com.jaxa.hayabusa;

public class Hayabusa
{
	private static Hayabusa singleton;
	private Hayabusa()
	{
	}
	public static Hayabusa getSingleton()
	{
		if (singleton == null)
		{
			singleton = new Hayabusa();
		}
		return singleton;
	}
	public void communicate()
	{
		try
		{
			java.net.URL url = new java.net.URL("https://en.wikipedia.org/wiki/Hayabusa2");
			java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", "Mozilla/5.0");
			int code = conn.getResponseCode();
			System.out.println("JAXA Hayabusa2 Probe Status Response: " + code);
		}
		catch (Exception e)
		{
			System.out.println("JAXA Hayabusa2 Probe Offline: " + e.getMessage());
		}
	}
}
