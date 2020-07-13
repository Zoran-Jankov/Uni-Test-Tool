package main.java.com.zoran_jankov.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import main.java.com.zoran_jankov.app.listener.RunDiskCleanup;

import javax.swing.JButton;

public class HardDiskPanel extends JPanel
{
	private static final long serialVersionUID = 2722800090244927075L;
	
	private JProgressBar cPartitionBar = new JProgressBar();
	private JLabel lblPartitionInfo = new JLabel();
	private final JButton btnDiskCleanup = new JButton("Run Disk Cleanup");

	/**
	 * Create the panel.
	 */
	public HardDiskPanel()
	{
		setLayout(new MigLayout("", "[300px:n][][]", "[][30px:n][]"));
		
		JLabel lblLocalDiskC = new JLabel("Local Disk (C:)");
		lblLocalDiskC.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblLocalDiskC, "cell 0 0");
		
		add(cPartitionBar, "cell 0 1,grow");
		btnDiskCleanup.addActionListener(new RunDiskCleanup());
		
		add(btnDiskCleanup, "cell 2 1");
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