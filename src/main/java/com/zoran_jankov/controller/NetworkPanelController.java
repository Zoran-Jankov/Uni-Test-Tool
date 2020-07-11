package main.java.com.zoran_jankov.controller;

import main.java.com.zoran_jankov.gui.NetworkPanel;
import main.java.com.zoran_jankov.model.NetworkModel;

public class NetworkPanelController
{
	NetworkPanel panel;
	
	NetworkPanelController(NetworkPanel panel)
	{
		this.panel = panel;
		setNetworkInfo();
	}
	
	private void setNetworkInfo()
	{
		panel.setIPAddress(NetworkModel.getIPAddress());
		panel.setSubnetMask(NetworkModel.getSubnetMask());
		panel.setDefaultGateway(NetworkModel.getDefaultGateway());
		panel.setPreferredDNSServer(NetworkModel.getPreferredDNSServer());
		panel.setAlternateDNSServer(NetworkModel.getAlternateDNSServer());
	}
}