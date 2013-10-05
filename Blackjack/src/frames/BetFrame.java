package frames;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import aplicacao.Jogador;
import aplicacao.Tratador;

public class BetFrame extends JFrame {

	public final int LARG_DEFAULT = 220;
	public final int ALT_DEFAULT = 110;
	Tratador tt = new Tratador();

	public BetFrame(Jogador jm){

		setBounds(550, 310, LARG_DEFAULT, ALT_DEFAULT);
		this.setTitle("Aposta");
		this.setResizable(false);
		this.setLayout(null);
		Jogador j1 = null;
		j1 = j1.getInstance1();
		Jogador j2 = null;
		j2 = j2.getInstance2();
		Jogador j3 = null;
		j3 = j3.getInstance3();
		Jogador j4 = null;
		j4 = j4.getInstance4();
		JLabel jg;

		if (jm == j1){
			jg = new JLabel("1");
			jg.setVisible(false);
			this.getContentPane().add(jg);
		}
		if (jm == j2) {
			jg = new JLabel("2");
			jg.setVisible(false);
			this.getContentPane().add(jg);
		}
		if (jm == j3) {
			jg = new JLabel("3");
			jg.setVisible(false);
			this.getContentPane().add(jg);
		}
		if (jm == j4) {
			jg = new JLabel("4");
			jg.setVisible(false);
			this.getContentPane().add(jg);
		}
		
		JButton duzentos = new JButton("100");
		duzentos.setEnabled(false);
		duzentos.setFont(new Font("Arial", Font.BOLD, 16));
		duzentos.setBounds(52, 10, 110, 30);
		this.getContentPane().add(duzentos); //1

		JButton mais = new JButton("+");
		mais.setName("BetMais");
		mais.setFont(new Font("Arial",Font.PLAIN, 14));
		mais.setBounds(167, 10, 44, 30);
		this.getContentPane().add(mais); // 2

		JButton menos = new JButton("-");
		menos.setName("BetMenos");
		menos.setFont(new Font("Arial",Font.PLAIN, 14));
		menos.setBounds(3, 10, 44, 30);
		this.getContentPane().add(menos); // 3

		JButton confirma = new JButton("Confirmar Aposta.");
		confirma.setName("ConfirmaAposta");
		confirma.setBounds(3, 46, 208, 30);
		this.getContentPane().add(confirma); // 4

		mais.addMouseListener(tt);
		menos.addMouseListener(tt);
		confirma.addMouseListener(tt);
	}

}
