package main.java.com.zoran_jankov.controller;

import main.java.com.zoran_jankov.gui.MainApplicationWindow;

public class MainApplicationWindowController
{
	private MainApplicationWindow mainWindow = new MainApplicationWindow();
	
	MainApplicationWindowController()
	{
		new SystemPanelController(mainWindow.getSystemPanel());
		new NetworkPanelController(mainWindow.getNetworkPanel());
		new HardDiskPanelController(mainWindow.getHardDiskPanel());
	}
}