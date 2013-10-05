package frames;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import aplicacao.Jogador;
import aplicacao.Tratador;

public class BancaJogo extends JFrame {

	public final int LARG_DEFAULT = 200;
	public final int ALT_DEFAULT = 120;
	
	public BancaJogo() {
		setBounds(600, 310, LARG_DEFAULT, ALT_DEFAULT);
		setLayout(null);
		Tratador tt = new Tratador();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		Font fonte = new Font("Arial", Font.BOLD, 12);
		JLabel a = new JLabel("Conferir vitorioso?");
		a.setFont(fonte);
		a.setBounds(45, 10, 150, 30);
		this.add(a);
		
		JButton jr1 = new JButton("OK.");
		jr1.setName("ConfirmaOK");
		jr1.setBounds(7, 45, 180, 40);
		jr1.addMouseListener(tt);
		this.add(jr1);
	}	
	
}
