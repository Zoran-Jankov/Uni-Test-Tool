package main.java.com.zoran_jankov.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JProgressBar;

public class HardDiskPanel extends JPanel
{
	private static final long serialVersionUID = 2722800090244927075L;
	
	private JProgressBar cPartitionBar = new JProgressBar();

	/**
	 * Create the panel.
	 */
	public HardDiskPanel()
	{
		setLayout(new MigLayout("", "[150px:n]", "[50px:n]"));
		
		add(cPartitionBar, "cell 0 0,grow");
	}
	
	public void setCPartitionUsage(int partitionUsage)
	{
		cPartitionBar.setValue(partitionUsage);
	}
}