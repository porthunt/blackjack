package frames;


import javax.swing.*;

import paineis.MenuPainel;

public class Menu extends JFrame {

	public final int LARG_DEFAULT = 700;
	public final int ALT_DEFAULT = 525;

	public Menu() {

		setTitle("Blackjack");
		setVisible(true);
		setBounds(333, 122, LARG_DEFAULT, ALT_DEFAULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MenuPainel painel = new MenuPainel();
		this.getContentPane().add(painel);
		this.setResizable(false);
	}

}
