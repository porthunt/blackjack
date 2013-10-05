package frames;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import aplicacao.Tratador;

public class RulesFrame extends JFrame {
	
	public final int LARG_DEFAULT = 700;
	public final int ALT_DEFAULT = 525;
	
	public RulesFrame() {
		setBounds(333, 122, LARG_DEFAULT, ALT_DEFAULT);
		setLayout(null);
		Tratador tt = new Tratador();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JTextArea regras = new JTextArea();
		regras.setEditable(false);
		regras.setText("- Valor das cartas corresponde ao seu número, as cartas figuradas (J, Q, K) tem valor dez e o ás recebe valor um.\n\n"+
					   "- Se a soma das cartas de um jogador exceder vinte e um, o jogador perde automaticamente, isso também vale para a banca.\n\n"+
					   "- Para comprar uma carta, clique em DRAW.\n\n" +
					   "- Para encerrar sua jogada, clique em STOP.\n\n"+
					   "- Para apostar, clique em BET.\n\n"+
					   "- O jogador começa com $10,000.\n\n"+
					   "- O jogador vencedor recebe da banca o dobro do apostado.\n\n"+
					   "- Ganha o jogo quem se aproximar mais de vinte e um.\n\n"+
					   "- Em caso de empate, o jogador vence.");
		regras.setBounds(10, 10, 675, 450);
		regras.setLineWrap(true);
		regras.setWrapStyleWord(true);
		Border b=BorderFactory.createEtchedBorder();
		regras.setVisible(true);
		regras.setBorder(b);
		this.add(regras);
		
		JButton voltar = new JButton("<< Voltar");
		voltar.setName("Voltar");
		voltar.setBounds(585, 462, 100, 30);
		voltar.setVisible(true);
		voltar.addMouseListener(tt);
		this.add(voltar);
	}	
}
