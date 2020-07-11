package main.java.com.zoran_jankov.gui;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;

public class MainApplicationWindow
{
	private JFrame frame = new JFrame("Uni Test Tool");
	private SystemPanel systemPanel= new SystemPanel();
	private NetworkPanel networkPanel = new NetworkPanel();
	private HardDiskPanel hardDiskPanel = new HardDiskPanel();

	/**
	 * Create the application.
	 */
	public MainApplicationWindow()
	{
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(mainTabbedPane, "cell 0 0,grow");
		
		mainTabbedPane.add("System", systemPanel);
		mainTabbedPane.add("Network", networkPanel);
		mainTabbedPane.add("Hard Disk",hardDiskPanel);
	}

	public SystemPanel getSystemPanel()
	{
		return systemPanel;
	}

	public NetworkPanel getNetworkPanel()
	{
		return networkPanel;
	}

	public HardDiskPanel getHardDiskPanel()
	{
		return hardDiskPanel;
	}
}