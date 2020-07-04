package main.java.com.zoran_jankov.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;

public class SystemInfoPanel extends JPanel
{
	private static final long serialVersionUID = 3371750325834534939L;

	/**
	 * Create the panel.
	 */
	public SystemInfoPanel()
	{
		setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblOperatingSystem = new JLabel("Operating System");
		add(lblOperatingSystem, "cell 0 0");
		
		JLabel lblOperatingSystemValue = new JLabel("Windows 10");
		lblOperatingSystemValue.setForeground(Color.GREEN);
		add(lblOperatingSystemValue, "cell 1 0");
		
	}
}