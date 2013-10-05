package paineis;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import componentes.CartaLabel;
import componentes.CoverLabel;

import aplicacao.*;

public class PainelBanca extends JPanel {
	public static final int TXT_X = 700;
	public static final int TXT_Y = 525;
	private BufferedImage i;
	Tratador tt = new Tratador();
	private int controle = 1;

	private static final PainelBanca INSTANCE0 = new PainelBanca();
	private static final PainelBanca INSTANCE1 = new PainelBanca();
//	private static final PainelBanca INSTANCE2 = new PainelBanca();
//	private static final PainelBanca INSTANCE3 = new PainelBanca();
//	private static final PainelBanca INSTANCE4 = new PainelBanca();
//	private static final PainelBanca INSTANCE5 = new PainelBanca();
//	private static final PainelBanca INSTANCE6 = new PainelBanca();
//	private static final PainelBanca INSTANCE7 = new PainelBanca();
//	private static final PainelBanca INSTANCE8 = new PainelBanca();
//	private static final PainelBanca INSTANCE9 = new PainelBanca();
//	private static final PainelBanca INSTANCE10 = new PainelBanca();
//	private static final PainelBanca INSTANCE11 = new PainelBanca();
//	private static final PainelBanca INSTANCE12 = new PainelBanca();
//	private static final PainelBanca INSTANCE13 = new PainelBanca();
//	private static final PainelBanca INSTANCE14 = new PainelBanca();
//	private static final PainelBanca INSTANCE15 = new PainelBanca();
//	private static final PainelBanca INSTANCE16 = new PainelBanca();
//	private static final PainelBanca INSTANCE17 = new PainelBanca();
//	private static final PainelBanca INSTANCE18 = new PainelBanca();
//	private static final PainelBanca INSTANCE19 = new PainelBanca();
	
	private PainelBanca()
	{
		try
		{
			i=ImageIO.read(new File("tela.png"));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}

		this.setLayout(null);

		CoverLabel cover = new CoverLabel();
		cover.setBounds(30, 30, 70, 94);
		this.add(cover);

		Baralho brlh = null;
		brlh = brlh.getInstance();

		Carta c = new Carta();
		c = brlh.RetornaCarta();

		CartaLabel jl = new CartaLabel(c);
		brlh.DiminuiCartas();
		c.setFlag(0);
		jl.setVisible(true);
		c.setJogador(5);
		jl.setBounds(70, 300, 70, 94);
		this.add(jl);
		this.repaint();
		
		CoverLabel cartavirada = new CoverLabel();
		cartavirada.setBounds(150, 300, 70, 94);
		this.add(cartavirada);
		
		JLabel numpoints = new JLabel(Integer.toString(c.getValor()));
		numpoints.setFont(new Font("Arial",Font.BOLD, 40));
		numpoints.setForeground(Color.WHITE);
		numpoints.setBounds(630, 450, 50, 30);
		this.add(numpoints);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(i, 0, 0, null);
	}
	
	public static synchronized PainelBanca getInstance0(){
		return INSTANCE0;
	}

	public static synchronized PainelBanca getInstance1(){
		return INSTANCE1;
	}

//	public static synchronized PainelBanca getInstance2(){
//		return INSTANCE2;
//	}

//	public static synchronized PainelBanca getInstance3(){
//		return INSTANCE3;
//	}
	
//	public static synchronized PainelBanca getInstance4(){
//		return INSTANCE4;
//	}
//
//	public static synchronized PainelBanca getInstance5(){
//		return INSTANCE5;
//	}
//
//	public static synchronized PainelBanca getInstance6(){
//		return INSTANCE6;
//	}
//
//	public static synchronized PainelBanca getInstance7(){
//		return INSTANCE7;
//	}
//	
//	public static synchronized PainelBanca getInstance8(){
//		return INSTANCE8;
//	}
//
//	public static synchronized PainelBanca getInstance9(){
//		return INSTANCE9;
//	}
//
//	public static synchronized PainelBanca getInstance10(){
//		return INSTANCE10;
//	}
//
//	public static synchronized PainelBanca getInstance11(){
//		return INSTANCE11;
//	}
//	
//	public static synchronized PainelBanca getInstance12(){
//		return INSTANCE12;
//	}
//	
//	public static synchronized PainelBanca getInstance13(){
//		return INSTANCE13;
//	}
//
//	public static synchronized PainelBanca getInstance14(){
//		return INSTANCE14;
//	}
//
//	public static synchronized PainelBanca getInstance15(){
//		return INSTANCE15;
//	}
//
//	public static synchronized PainelBanca getInstance16(){
//		return INSTANCE16;
//	}
//	
//	public static synchronized PainelBanca getInstance17(){
//		return INSTANCE17;
//	}
//
//	public static synchronized PainelBanca getInstance18(){
//		return INSTANCE18;
//	}
//
//	public static synchronized PainelBanca getInstance19(){
//		return INSTANCE19;
//	}
	
	public int getControle() {
		return controle;
	}

	public void setControle(int controle) {
		this.controle = controle;
	}
	
	
}