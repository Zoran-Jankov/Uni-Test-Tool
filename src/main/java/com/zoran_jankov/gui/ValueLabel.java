package main.java.com.zoran_jankov.gui;
import javax.swing.JLabel;
import java.awt.Color;

public final class ValueLabel
{
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source foreground java.awt.Color.GREEN
	 */
	public static JLabel createJLabel(Color foreground)
	{
		JLabel label = new JLabel();
		label.setForeground(foreground);
		return label;
	}
}