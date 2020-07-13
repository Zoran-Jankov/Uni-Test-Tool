package main.java.com.zoran_jankov.app.controller;

import main.java.com.zoran_jankov.gui.NetworkPanel;
import main.java.com.zoran_jankov.model.NetworkUtils;

public class NetworkPanelController
{
	private NetworkPanel panel;
	
	public NetworkPanelController(NetworkPanel panel)
	{
		this.panel = panel;
		setNetworkInfo();
	}
	
	private void setNetworkInfo()
	{
		panel.setIPAddress(NetworkUtils.getIPAddress());
		panel.setSubnetMask(NetworkUtils.getSubnetMask());
		panel.setDefaultGateway(NetworkUtils.getDefaultGateway());
		panel.setPreferredDNSServer(NetworkUtils.getPreferredDNSServer());
		panel.setAlternateDNSServer(NetworkUtils.getAlternateDNSServer());
	}
}