package componentes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

import aplicacao.Tratador;

public class DinheiroButton extends JButton {
	
	private BufferedImage i;
	
	public DinheiroButton()
	{
		
		try
		{
		i=ImageIO.read(new File("dinheiro.png"));
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		System.exit(1);
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(i, 0, 0, null);
	}
	
}

