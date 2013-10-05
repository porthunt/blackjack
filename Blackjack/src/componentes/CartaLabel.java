package componentes;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import aplicacao.*;

public class CartaLabel extends JPanel {
	public static final int TXT_X = 700;
	public static final int TXT_Y = 525;
	private BufferedImage i;
	
	public CartaLabel(Carta c)
	{
		
		try
		{
		i=ImageIO.read(new File(c.getNomecarta()));
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		System.exit(1);
		}
		
		this.setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(i, 0, 0, null);
	}
}