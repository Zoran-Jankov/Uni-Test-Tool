package main.java.com.zoran_jankov.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class NetworkInfoPanel extends JPanel
{
	private static final long serialVersionUID = -3200569870685912460L;
	
	private JLabel lblIPAddressValue = ValueLabel.createJLabel(Color.GREEN);
	private JLabel lblSubnetMaskValue = ValueLabel.createJLabel(Color.GREEN);
	private JLabel lblDefaultGatewayValue = ValueLabel.createJLabel(Color.GREEN);
	private JLabel lblPreferredDNSServerValue = ValueLabel.createJLabel(Color.GREEN);
	private JLabel lblAlternateDNSServerValue = ValueLabel.createJLabel(Color.GREEN);
	
	/**
	 * Create the panel.
	 */
	public NetworkInfoPanel()
	{
		setLayout(new MigLayout("", "[][120px:n]", "[][][][][][]"));
		
		JLabel lblNetworkInfo = new JLabel("Network Info");
		lblNetworkInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblNetworkInfo, "cell 0 0 2 1,alignx center");
		
		JLabel lblIPAddress = new JLabel("IP Address");
		add(lblIPAddress, "cell 0 1");
		
		add(lblIPAddressValue, "cell 1 1");
		
		JLabel lblSubnetMask = new JLabel("Subnet Mask");
		add(lblSubnetMask, "cell 0 2");
		
		add(lblSubnetMaskValue, "cell 1 2");
		
		JLabel lblDefaultGateway = new JLabel("Default Gateway");
		add(lblDefaultGateway, "cell 0 3");
		
		
		add(lblDefaultGatewayValue, "cell 1 3");
		
		JLabel lblPreferredDNSServer = new JLabel("Preferred DNS Server");
		add(lblPreferredDNSServer, "cell 0 4");
		
		add(lblPreferredDNSServerValue, "cell 1 4");
		
		JLabel lblAlternateDNSServer = new JLabel("Alternate DNS Server");
		add(lblAlternateDNSServer, "cell 0 5");
		
		add(lblAlternateDNSServerValue, "cell 1 5");
	}

	public void setIPAddress(String ipAddress)
	{
		lblIPAddressValue.setText(ipAddress);
	}

	public void setSubnetMask(String subnetMask)
	{
		lblSubnetMaskValue.setText(subnetMask);
	}

	public void setDefaultGateway(String defaultGateway)
	{
		lblDefaultGatewayValue.setText(defaultGateway);
	}

	public void setPreferredDNSServer(String preferredDNSServer)
	{
		lblPreferredDNSServerValue.setText(preferredDNSServer);
	}

	public void setAlternateDNSServer(String alternateDNSServer)
	{
		lblAlternateDNSServerValue.setText(alternateDNSServer);
	}
}