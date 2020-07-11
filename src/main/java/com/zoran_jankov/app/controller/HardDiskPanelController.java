package main.java.com.zoran_jankov.app.controller;

import main.java.com.zoran_jankov.gui.HardDiskPanel;
import main.java.com.zoran_jankov.model.HardDiskUtils;

public class HardDiskPanelController
{
	private static final String PARTITION_NAME = "C:";
	
	private HardDiskPanel hardDiskPanel;
	
	
	public HardDiskPanelController(HardDiskPanel hardDiskPanel)
	{
		this.hardDiskPanel = hardDiskPanel;
		setCPartition();
	}
	
	public void setCPartition()
	{
		hardDiskPanel.setCPartitionUsage(HardDiskUtils.getUsedSpacePercentage(PARTITION_NAME));
		
		String partitionInfo = HardDiskUtils.toSting(HardDiskUtils.getFreeSpace(PARTITION_NAME))
							 + " free of "
							 + HardDiskUtils.toSting(HardDiskUtils.getTotalSpace(PARTITION_NAME));
		
		hardDiskPanel.setPartitionInfo(partitionInfo);
	}
}