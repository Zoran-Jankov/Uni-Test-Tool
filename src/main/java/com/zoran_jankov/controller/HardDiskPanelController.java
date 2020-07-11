package main.java.com.zoran_jankov.controller;

import main.java.com.zoran_jankov.gui.HardDiskPanel;
import main.java.com.zoran_jankov.model.HardDiskUtils;

public class HardDiskPanelController
{
	private HardDiskPanel hardDiskPanel;
	
	HardDiskPanelController(HardDiskPanel hardDiskPanel)
	{
		this.hardDiskPanel = hardDiskPanel;
		setCPartitionUsage();
	}
	
	public void setCPartitionUsage()
	{
		hardDiskPanel.setCPartitionUsage(HardDiskUtils.getUsedSpacePercentage("C:"));
	}
}