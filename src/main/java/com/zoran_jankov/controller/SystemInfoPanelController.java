package main.java.com.zoran_jankov.controller;

import main.java.com.zoran_jankov.gui.SystemInfoPanel;
import main.java.com.zoran_jankov.model.SystemModel;

public class SystemInfoPanelController
{
	private SystemInfoPanel panel;
	
	SystemInfoPanelController(SystemInfoPanel panel)
	{
		this.panel = panel;
		setSystemInfo();
	}
	
	private void setSystemInfo()
	{
		panel.setOSName(SystemModel.getOSName());
		panel.setOSVersion(SystemModel.getOSVersion());
		panel.setOSArchitecture(SystemModel.getOSArchitecture());
	}
}