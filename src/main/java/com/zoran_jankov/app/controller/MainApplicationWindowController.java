package main.java.com.zoran_jankov.app.controller;

import main.java.com.zoran_jankov.gui.MainApplicationWindow;

public class MainApplicationWindowController
{
	private MainApplicationWindow mainWindow = new MainApplicationWindow();
	
	public MainApplicationWindowController()
	{
		new SystemPanelController(mainWindow.getSystemPanel());
		new NetworkPanelController(mainWindow.getNetworkPanel());
		new HardDiskPanelController(mainWindow.getHardDiskPanel());
	}
}