package main.java.com.zoran_jankov.model;

import java.io.File;

public class HardDiskUtils
{
	private static final int KB = 1024;
	private static final int MB = 1048576;
	private static final int GB = 1073741824;
	
	public static long getTotalSpace(String partitionName)
	{
		File partition = new File(partitionName);
		
		long freeSpace = partition.getTotalSpace();
		
		return freeSpace;
	}
	
	public static long getFreeSpace(String partitionName)
	{
		
		File partition = new File(partitionName);
		
		long freeSpace = partition.getFreeSpace();
		
		return freeSpace;
	}
	
	public static long getUsedSpace(String partitionName)
	{
		File partition = new File(partitionName);
		
		long freeSpace = partition.getTotalSpace() - partition.getFreeSpace();
		
		return freeSpace;
	}
	
	public static int getFreeSpacePercentage(String partitionName)
	{
		return (int) (getFreeSpace(partitionName) / getTotalSpace(partitionName) * 100);
	}
	
	public static int getUsedSpacePercentage(String partitionName)
	{
		return (int) ((getTotalSpace(partitionName) - getFreeSpace(partitionName))  
						/ getTotalSpace(partitionName) * 100);
	}
	
	public static String toSting(long diskSpace)
	{
		
		String diskSpaceInfo;
		
		if(diskSpace / GB > 0)
		{
			diskSpaceInfo = String.valueOf(diskSpace / GB) + " GB";
		}
		else if(diskSpace / MB > 0)
		{
			diskSpaceInfo = String.valueOf(diskSpace / MB) + " MB";
		}
		else if(diskSpace / KB > 0)
		{
			diskSpaceInfo = String.valueOf(diskSpace / KB) + " kB";
		}
		else
		{
			diskSpaceInfo = String.valueOf(diskSpace) + " B";
		}
		
		return diskSpaceInfo;
	}
}