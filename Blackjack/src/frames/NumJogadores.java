package frames;

import javax.swing.*;

import aplicacao.Tratador;

public class NumJogadores extends JFrame {
	
	public final int LARG_DEFAULT = 350;
	public final int ALT_DEFAULT = 263;
	
	public NumJogadores() {
		setTitle("Blackjack");
		setBounds(550, 260, LARG_DEFAULT, ALT_DEFAULT);
		setLayout(null);
		Tratador tt = new Tratador();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JButton jr1 = new JButton("Um Jogador.");
		jr1.setBounds(30, 20, 290, 40);
		this.add(jr1);
		JButton jr2 = new JButton("Dois Jogadores.");
		this.add(jr2);
		jr2.setBounds(30, 65, 290, 40);
		JButton jr3 = new JButton("Três Jogadores.");
		this.add(jr3);
		jr3.setBounds(30, 110, 290, 40);
		JButton jr4 = new JButton("Quatro Jogadores.");
		this.add(jr4);
		jr4.setBounds(30, 155, 290, 40);
		
		jr1.setName("UmJogador");
		jr2.setName("DoisJogadores");
		jr3.setName("TresJogadores");
		jr4.setName("QuatroJogadores");

		jr1.addMouseListener(tt);
		jr2.addMouseListener(tt);
		jr3.addMouseListener(tt);
		jr4.addMouseListener(tt);
		
	}
	
}
