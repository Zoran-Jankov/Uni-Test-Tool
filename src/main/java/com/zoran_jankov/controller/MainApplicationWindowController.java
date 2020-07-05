package main.java.com.zoran_jankov.controller;

import main.java.com.zoran_jankov.gui.MainApplicationWindow;

public class MainApplicationWindowController
{
	MainApplicationWindow mainWindow = new MainApplicationWindow();
	
	SystemInfoPanelController systemInfoPanelController = new SystemInfoPanelController(mainWindow.getSystemInfoPanel());
}