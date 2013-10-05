package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import componentes.BetButton;
import componentes.DinheiroButton;
import componentes.DrawButton;
import componentes.StopButton;

import aplicacao.Baralho;
import aplicacao.Jogador;
import aplicacao.Tratador;

public class PainelJogador2 extends JPanel {
	
	public static final int TXT_X = 262;
	public static final int TXT_Y = 262;
	private BufferedImage i;
	Tratador tt = new Tratador();
	
	public PainelJogador2(){
		Baralho brlh = null;
		brlh = brlh.getInstance();
		Jogador j2 = null;
		j2 = j2.getInstance2();
		try
		{
		i=ImageIO.read(new File("telajogador.png"));
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		System.exit(1);
		}
		
		this.setLayout(null);
		DrawButton db = new DrawButton();
		db.setBounds(185, 195, 48, 27);
		this.add(db);
		db.setName("Draw2");
		db.addMouseListener(tt);
		BetButton bb = new BetButton();
		bb.setName("Bet2");
		bb.addMouseListener(tt);
		bb.setBounds(130, 195, 48, 27);
		this.add(bb);
		StopButton sb = new StopButton();
		sb.setName("Stop2");
		sb.addMouseListener(tt);
		sb.setBounds(75, 195, 48, 27);
		this.add(sb);
		JLabel pontos = new JLabel("0");
		pontos.setFont(new Font("Arial",Font.BOLD, 26));
		pontos.setForeground(Color.WHITE);
		pontos.setBounds(25, 190, 30, 30);
		this.add(pontos);
		DinheiroButton dl = new DinheiroButton();
		dl.setName("Dinheiro2");
		dl.addMouseListener(tt);
		dl.setBounds(185, -1, 50, 26);
		this.add(dl);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(i, 0, 0, null);
	}
}
