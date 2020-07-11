package main.java.com.zoran_jankov.app.controller;

import main.java.com.zoran_jankov.gui.SystemPanel;
import main.java.com.zoran_jankov.model.SystemUtils;

public class SystemPanelController
{
	private SystemPanel panel;
	
	public SystemPanelController(SystemPanel panel)
	{
		this.panel = panel;
		setSystemInfo();
	}
	
	private void setSystemInfo()
	{
		panel.setOSName(SystemUtils.getOSName());
		panel.setOSVersion(SystemUtils.getOSVersion());
		panel.setOSArchitecture(SystemUtils.getOSArchitecture());
	}
}