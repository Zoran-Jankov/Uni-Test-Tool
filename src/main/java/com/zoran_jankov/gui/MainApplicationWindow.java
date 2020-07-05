package main.java.com.zoran_jankov.gui;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;

public class MainApplicationWindow
{
	private JFrame frame = new JFrame("Uni Test Tool");
	private SystemInfoPanel systemInfo= new SystemInfoPanel();
	private NetworkInfoPanel networkInfo = new NetworkInfoPanel();

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
		frame.setBounds(100, 100, 603, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(mainTabbedPane, "cell 0 0,grow");
		
		mainTabbedPane.add("System Info", systemInfo);
		mainTabbedPane.add("Network Info", networkInfo);
	}

	public SystemInfoPanel getSystemInfoPanel()
	{
		return systemInfo;
	}
}
