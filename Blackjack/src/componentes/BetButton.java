package componentes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

import aplicacao.Tratador;

public class BetButton extends JButton {

	public static final int TXT_X = 48;
	public static final int TXT_Y = 27;
	private BufferedImage i;
	Tratador tt = new Tratador();
	
	public BetButton()
	{
		
		try
		{
		i=ImageIO.read(new File("betbutton.png"));
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
