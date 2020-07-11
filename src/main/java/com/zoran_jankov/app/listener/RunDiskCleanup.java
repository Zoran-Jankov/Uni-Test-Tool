package main.java.com.zoran_jankov.app.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RunDiskCleanup implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			new ProcessBuilder("C:\\Windows\\SysWOW64\\cleanmgr.exe").start();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}
}