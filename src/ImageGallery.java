import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageGallery 
{
	// 
	private JFrame gui;
	private JPanel mainPanel;
	private JPanel buttons;
	
	public ImageGallery() throws IOException
	{
		this.gui = new JFrame("Test Image Gallery");
		
		
		this.buttons = new JPanel(new GridLayout(3, 3));
		
		for (int i = 0; i < 9; i++)
		{
			JButton button = new JButton();
			BufferedImage img = ImageIO.read(new File("pokemon_00"+(i+1)+".png"));
			
			
			ImageIcon icon = new ImageIcon(img);
			button.setIcon(icon);
			this.buttons.add(button);
		}
		
		
		
		
		// adding components to GUI
		this.gui.add(buttons);
		
		// GUI settings
		this.gui.setSize(600, 600);
		this.gui.setResizable(false);
		this.gui.setLocation(350, 75);
		this.gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.gui.setVisible(true);	
	}
	
	
	public static void main(String[] args) throws IOException
	{
		new ImageGallery();
	}

}
