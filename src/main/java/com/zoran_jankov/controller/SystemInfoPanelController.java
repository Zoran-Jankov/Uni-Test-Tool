package main.java.com.zoran_jankov.controller;

import main.java.com.zoran_jankov.gui.SystemInfoPanel;

public class SystemInfoPanelController
{
	SystemInfoPanelController(SystemInfoPanel panel)
	{
		panel.setOperatingSystem(System.getProperty("os.name"));
		panel.setOperatingSystemVersion(System.getProperty("os.version"));
		panel.setOperatingSystemArchitecture(System.getProperty("os.arch"));	
	}
}