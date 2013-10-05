package paineis;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import aplicacao.*;

public class MenuPainel extends JPanel {
	public static final int TXT_X = 700;
	public static final int TXT_Y = 525;
	private BufferedImage i;
	Tratador tt = new Tratador();
	
	public MenuPainel()
	{
		
		try
		{
		i=ImageIO.read(new File("21.jpg"));
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		System.exit(1);
		}
		
		this.setLayout(null);
		
		JButton newgame = new JButton("Iniciar Jogo");
		newgame.setBounds(20, 240, 200, 30);		
		newgame.setName("NovoJogo");
		newgame.addMouseListener(tt);
		
		JButton rules = new JButton("Regras");
		rules.setBounds(20, 280, 200, 30);		
		rules.setName("Regras");
		rules.addMouseListener(tt);
		
		JButton exit = new JButton("Sair");
		exit.setBounds(20, 320, 200, 30);
		exit.setName("Sair");
		exit.addMouseListener(tt);
		
		this.add(newgame);
		this.add(rules);
		this.add(exit);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(i, 0, 0, null);
	}
}