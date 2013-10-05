package frames;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import aplicacao.Jogador;
import aplicacao.Tratador;

public class DinheiroFrame extends JFrame {
	
	public final int LARG_DEFAULT = 150;
	public final int ALT_DEFAULT = 110;
	Tratador tt = new Tratador();
	
	public DinheiroFrame(Jogador jm){
		setBounds(600, 310, LARG_DEFAULT, ALT_DEFAULT);
		this.setTitle("Dinheiro");
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
		
		JButton dinheiro = new JButton("$"+Integer.toString(jm.getDinheiro()));
		dinheiro.setEnabled(false);
		dinheiro.setFont(new Font("Arial", Font.BOLD, 16));
		dinheiro.setBounds(50, 10, 90, 30);
		this.getContentPane().add(dinheiro);
		
		JButton bet = new JButton("$"+Integer.toString(jm.getBet()));
		bet.setEnabled(false);
		bet.setFont(new Font("Arial", Font.BOLD, 16));
		bet.setBounds(50, 45, 90, 30);
		this.getContentPane().add(bet);
		
		JLabel dinheirolabel = new JLabel("Dinheiro:");
		//dinheirolabel.setFont(new Font("Arial", Font.PLAIN, 16));
		dinheirolabel.setBounds(6, 10, 90, 30);
		this.getContentPane().add(dinheirolabel);
		
		JLabel apostalabel = new JLabel("Aposta:");
		//dinheirolabel.setFont(new Font("Arial", Font.PLAIN, 16));
		apostalabel.setBounds(6, 45, 90, 30);
		this.getContentPane().add(apostalabel);
	}
}
