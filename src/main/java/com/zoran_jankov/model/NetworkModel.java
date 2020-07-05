package main.java.com.zoran_jankov.model;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkModel
{
	public static String getIPAddress()
	{
		String value = null;
		
		try
		{
			value = InetAddress.getLocalHost().toString();
		}
		
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
		
		String ipAddress = value.substring(value.indexOf("/")+1);
		ipAddress.trim();
		
		return ipAddress;
	}

	public static String getSubnetMask()
	{
		return null;
	}

	public static String getDefaultGateway()
	{
		return null;
	}

	public static String getPreferredDNSServer()
	{
		return null;
	}

	public static String getAlternateDNSServer()
	{
		return null;
	}
}