package frames;


import javax.swing.*;

import paineis.PainelJogador1;
import paineis.PainelJogador2;
import paineis.PainelJogador3;
import paineis.PainelJogador4;

public class TelaJogador extends JFrame {

	public TelaJogador(int i) {
		setTitle("Jogador " + Integer.toString(i));
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setResizable(false);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		if (i == 1) {
			PainelJogador1 painel1 = new PainelJogador1();
			this.getContentPane().add(painel1);
		}
		if (i == 2) {
			PainelJogador1 painel1 = new PainelJogador1();
			this.getContentPane().add(painel1);
			PainelJogador2 painel2 = new PainelJogador2();
			this.getContentPane().add(painel2);
		}
		if (i == 3) {
			PainelJogador1 painel1 = new PainelJogador1();
			this.getContentPane().add(painel1);
			PainelJogador2 painel2 = new PainelJogador2();
			this.getContentPane().add(painel2);
			PainelJogador3 painel3 = new PainelJogador3();
			this.getContentPane().add(painel3);
		}
		if (i == 4) {
			PainelJogador1 painel1 = new PainelJogador1();
			this.getContentPane().add(painel1);
			PainelJogador2 painel2 = new PainelJogador2();
			this.getContentPane().add(painel2);
			PainelJogador3 painel3 = new PainelJogador3();
			this.getContentPane().add(painel3);
			PainelJogador4 painel4 = new PainelJogador4();
			this.getContentPane().add(painel4);
		}
	}
}
