package main.java.com.zoran_jankov.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class HardDiskPanel extends JPanel
{
	private static final long serialVersionUID = 2722800090244927075L;
	
	private JProgressBar cPartitionBar = new JProgressBar();
	private JLabel lblPartitionInfo = new JLabel();

	/**
	 * Create the panel.
	 */
	public HardDiskPanel()
	{
		setLayout(new MigLayout("", "[300px:n]", "[][30px:n][]"));
		
		JLabel lblLocalDiskC = new JLabel("Local Disk (C:)");
		lblLocalDiskC.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblLocalDiskC, "cell 0 0");
		
		add(cPartitionBar, "cell 0 1,grow");
		lblPartitionInfo.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		add(lblPartitionInfo, "cell 0 2");
	}
	
	public void setCPartitionUsage(int partitionUsage)
	{
		cPartitionBar.setValue(partitionUsage);
	}
	
	public void setPartitionInfo(String info)
	{
		lblPartitionInfo.setText(info);
	}
}