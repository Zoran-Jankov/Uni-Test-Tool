package main.java.com.zoran_jankov.controller;

import main.java.com.zoran_jankov.gui.MainApplicationWindow;

public class MainApplicationWindowController
{
	private MainApplicationWindow mainWindow = new MainApplicationWindow();
	
	MainApplicationWindowController()
	{
		new SystemInfoPanelController(mainWindow.getSystemInfoPanel());
		new NetworkInfoPanelController(mainWindow.getNetworkInfoPanel());
	}
}