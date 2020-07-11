package main.java.com.zoran_jankov.controller;

import main.java.com.zoran_jankov.gui.SystemPanel;
import main.java.com.zoran_jankov.model.SystemModel;

public class SystemPanelController
{
	private SystemPanel panel;
	
	SystemPanelController(SystemPanel panel)
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