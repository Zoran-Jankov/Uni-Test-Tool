package main.java.com.zoran_jankov.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class SystemPanel extends JPanel
{
	private static final long serialVersionUID = 3371750325834534939L;
	
	private JLabel lblOperatingSystemNameValue = ValueLabel.createJLabel(Color.GREEN);
	private JLabel lblOperatingSystemVersionValue = ValueLabel.createJLabel(Color.GREEN);
	private JLabel lblOperatingSystemArchitectureValue = ValueLabel.createJLabel(Color.GREEN);
	
	/**
	 * Create the panel.
	 */
	public SystemPanel()
	{
		setLayout(new MigLayout("", "[][20px:n][120px:n]", "[][][][]"));
		
		JLabel lblOperatingSystem = new JLabel("Operating System");
		lblOperatingSystem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblOperatingSystem, "cell 0 0 3 1,alignx center,growy");
		
		JLabel lblOperatingSystemName = new JLabel("Name");
		add(lblOperatingSystemName, "cell 0 1");
		add(lblOperatingSystemNameValue, "cell 2 1");
		
		JLabel lblOperatingSystemVersion = new JLabel("Version");
		add(lblOperatingSystemVersion, "cell 0 2");
		
		add(lblOperatingSystemVersionValue, "cell 2 2");
		
		JLabel lblOperatingSystemArchitecture = new JLabel("Architecture");
		add(lblOperatingSystemArchitecture, "cell 0 3");
		
		add(lblOperatingSystemArchitectureValue, "cell 2 3");
	}
	
	public void setOSName(String property)
	{
		lblOperatingSystemNameValue.setText(property);
	}

	public void setOSVersion(String property)
	{
		lblOperatingSystemVersionValue.setText(property);
	}

	public void setOSArchitecture(String property)
	{
		lblOperatingSystemArchitectureValue.setText(property);
	}
}