package aplicacao;

import frames.BancaJogo;
import frames.BetFrame;
import frames.DinheiroFrame;
import frames.Menu;
import frames.Mesa;
import frames.NumJogadores;
import frames.RulesFrame;
import frames.TelaJogador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

import paineis.*;

import componentes.CartaLabel;

public class Tratador implements MouseListener {

	private static int xsize = 230;
	private static int xsizejogador1 = 162;
	private static int xsizejogador2 = 162;
	private static int xsizejogador3 = 162;
	private static int xsizejogador4 = 162;
	public static final int TXT_X = 251;
	public static final int TXT_Y = 251;
	private int numjog;

	public void mouseClicked(MouseEvent arg0) {

		Tratador tt = new Tratador();

		if (arg0.getComponent().getName().equals("NovoJogo")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent()
					.getParent().getParent().getParent();
			zz.dispose();
			NumJogadores nj = new NumJogadores();
		}

		if (arg0.getComponent().getName().equals("Regras")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent()
					.getParent().getParent().getParent();
			zz.dispose();
			RulesFrame rf = new RulesFrame();
		}

		if (arg0.getComponent().getName().equals("Voltar")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent()
					.getParent().getParent();
			zz.dispose();
			Menu ms = new Menu();
		}

		if (arg0.getComponent().getName().equals("UmJogador")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent()
					.getParent().getParent();
			zz.dispose();
			TelaJogador ms1 = new TelaJogador(1);
			ms1.setBounds(69, 122, TXT_X, TXT_Y);
			Baralho brlh = null;
			brlh = brlh.getInstance();
			brlh.setNumjog(1);
			Mesa mv = new Mesa();
		}

		if (arg0.getComponent().getName().equals("DoisJogadores")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent()
					.getParent().getParent();
			zz.dispose();
			TelaJogador ms1 = new TelaJogador(1);
			ms1.setBounds(69, 122, TXT_X, TXT_Y);
			TelaJogador ms2 = new TelaJogador(2);
			ms2.setBounds(69, 395, TXT_X, TXT_Y);
			Baralho brlh = null;
			brlh = brlh.getInstance();
			brlh.setNumjog(2);
			Mesa mv = new Mesa();
		}

		if (arg0.getComponent().getName().equals("TresJogadores")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent()
					.getParent().getParent();
			zz.dispose();
			TelaJogador ms1 = new TelaJogador(1);
			ms1.setBounds(69, 122, TXT_X, TXT_Y);
			TelaJogador ms2 = new TelaJogador(2);
			ms2.setBounds(69, 395, TXT_X, TXT_Y);
			TelaJogador ms3 = new TelaJogador(3);
			ms3.setBounds(1046, 122, TXT_X, TXT_Y);
			Baralho brlh = null;
			brlh = brlh.getInstance();
			brlh.setNumjog(3);
			Mesa mv = new Mesa();
		}

		if (arg0.getComponent().getName().equals("QuatroJogadores")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent()
					.getParent().getParent();
			zz.dispose();
			TelaJogador ms1 = new TelaJogador(1);
			ms1.setBounds(69, 122, TXT_X, TXT_Y);
			TelaJogador ms2 = new TelaJogador(2);
			ms2.setBounds(69, 395, TXT_X, TXT_Y);
			TelaJogador ms3 = new TelaJogador(3);
			ms3.setBounds(1046, 122, TXT_X, TXT_Y);
			TelaJogador ms4 = new TelaJogador(4);
			ms4.setBounds(1046, 395, TXT_X, TXT_Y);
			Baralho brlh = null;
			brlh = brlh.getInstance();
			brlh.setNumjog(4);
			Mesa mv = new Mesa();
		}

		if (arg0.getComponent().getName().equals("Sair")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent()
					.getParent().getParent().getParent();
			zz.dispose();
		}

		if (arg0.getComponent().getName().equals("Draw1")) {
			JPanel zz = (JPanel) arg0.getComponent().getParent();
			Baralho brlh = null;
			brlh = brlh.getInstance();
			Jogador j1 = null;
			j1 = j1.getInstance1();

			int valortotal = brlh.ContaValores(1);
			int stopcheck = j1.getStop();
			JLabel numpoints = (JLabel) zz.getComponent(3);
			int num = Integer.parseInt(numpoints.getText());

			if (valortotal < 21 && stopcheck == 0) {
				Carta c = new Carta();
				c = brlh.RetornaCarta();

				CartaLabel jl = new CartaLabel(c);
				brlh.DiminuiCartas();
				c.setFlag(0);
				c.setJogador(1);
				jl.setVisible(true);
				jl.setBounds(xsizejogador1, 45, 70, 94);
				zz.add(jl);
				num += c.getValor();
				numpoints.setText(Integer.toString(num));
				zz.repaint();
				xsizejogador1 -= 25;
			} else {
				JOptionPane.showMessageDialog(null,
						"Você ultrapassou o limite de 21. Clique em STOP para finalizar o seu jogo.", "Baralho",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

		if (arg0.getComponent().getName().equals("Draw2")) {
			JPanel zz = (JPanel) arg0.getComponent().getParent();
			Baralho brlh = null;
			brlh = brlh.getInstance();

			Jogador j2 = null;
			j2 = j2.getInstance2();

			JLabel numpoints = (JLabel) zz.getComponent(3);
			int num = Integer.parseInt(numpoints.getText());

			int valortotal = brlh.ContaValores(2);
			int stopcheck = j2.getStop();

			if (valortotal < 21 && stopcheck == 0) {
				Carta c = new Carta();
				c = brlh.RetornaCarta();

				CartaLabel jl = new CartaLabel(c);
				brlh.DiminuiCartas();
				c.setFlag(0);
				c.setJogador(2);
				jl.setVisible(true);
				jl.setBounds(xsizejogador2, 45, 70, 94);
				zz.add(jl);
				num += c.getValor();
				numpoints.setText(Integer.toString(num));
				zz.repaint();
				xsizejogador2 -= 25;
			} else {
				JOptionPane.showMessageDialog(null,
						"Você ultrapassou o limite de 21. Clique em STOP para finalizar o seu jogo.", "Baralho",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

		if (arg0.getComponent().getName().equals("Draw3")) {
			JPanel zz = (JPanel) arg0.getComponent().getParent();
			Baralho brlh = null;
			brlh = brlh.getInstance();

			Jogador j3 = null;
			j3 = j3.getInstance3();

			JLabel numpoints = (JLabel) zz.getComponent(3);
			int num = Integer.parseInt(numpoints.getText());

			int valortotal = brlh.ContaValores(3);
			int stopcheck = j3.getStop();

			if (valortotal < 21 && stopcheck == 0) {
				Carta c = new Carta();
				c = brlh.RetornaCarta();

				CartaLabel jl = new CartaLabel(c);
				brlh.DiminuiCartas();
				c.setFlag(0);
				c.setJogador(3);
				jl.setVisible(true);
				jl.setBounds(xsizejogador3, 45, 70, 94);
				zz.add(jl);
				num += c.getValor();
				numpoints.setText(Integer.toString(num));
				zz.repaint();
				xsizejogador3 -= 25;
			} else {
				JOptionPane.showMessageDialog(null,
						"Você ultrapassou o limite de 21. Clique em STOP para finalizar o seu jogo.", "Baralho",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

		if (arg0.getComponent().getName().equals("Draw4")) {
			JPanel zz = (JPanel) arg0.getComponent().getParent();
			Baralho brlh = null;
			brlh = brlh.getInstance();

			Jogador j4 = null;
			j4 = j4.getInstance4();

			JLabel numpoints = (JLabel) zz.getComponent(3);
			int num = Integer.parseInt(numpoints.getText());

			int valortotal = brlh.ContaValores(4);
			int stopcheck = j4.getStop();

			if (valortotal < 21 && stopcheck == 0) {
				Carta c = new Carta();
				c = brlh.RetornaCarta();

				CartaLabel jl = new CartaLabel(c);
				brlh.DiminuiCartas();
				c.setFlag(0);
				c.setJogador(4);
				jl.setVisible(true);
				jl.setBounds(xsizejogador4, 45, 70, 94);
				zz.add(jl);
				num += c.getValor();
				numpoints.setText(Integer.toString(num));
				zz.repaint();
				xsizejogador4 -= 25;
			}

			else {
				JOptionPane.showMessageDialog(null,
						"Você ultrapassou o limite de 21. Clique em STOP para finalizar o seu jogo.", "Baralho",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

		if (arg0.getComponent().getName().equals("Stop1")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent().getParent().getParent().getParent();
			Baralho brlh = null;
			brlh = brlh.getInstance();

			Jogador j1 = null;
			j1 = j1.getInstance1();

			Jogador j2 = null;
			j2 = j2.getInstance2();

			Jogador j3 = null;
			j3 = j3.getInstance3();

			Jogador j4 = null;
			j4 = j4.getInstance4();

			j1.setStop(1);
			j1.setValor(brlh.ContaValores(1));
			zz.dispose();
			if (brlh.getNumjog()==1){
				if (j1.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
			else if (brlh.getNumjog()==2){
				if (j1.getStop()==1 && j2.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
			else if (brlh.getNumjog()==3){
				if (j1.getStop()==1 && j2.getStop()==1 && j3.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
			else if (brlh.getNumjog()==4){
				if (j1.getStop()==1 && j2.getStop()==1 && j3.getStop()==1 && j4.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
		}

		if (arg0.getComponent().getName().equals("Stop2")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent().getParent().getParent().getParent();
			Baralho brlh = null;
			brlh = brlh.getInstance();

			Jogador j1 = null;
			j1 = j1.getInstance1();

			Jogador j2 = null;
			j2 = j2.getInstance2();

			Jogador j3 = null;
			j3 = j3.getInstance3();

			Jogador j4 = null;
			j4 = j4.getInstance4();

			j2.setStop(1);
			j2.setValor(brlh.ContaValores(2));
			zz.dispose();

			if (brlh.getNumjog()==2){
				if (j1.getStop()==1 && j2.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
			else if (brlh.getNumjog()==3){
				if (j1.getStop()==1 && j2.getStop()==1 && j3.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
			else if (brlh.getNumjog()==4){
				if (j1.getStop()==1 && j2.getStop()==1 && j3.getStop()==1 && j4.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
		}

		if (arg0.getComponent().getName().equals("Stop3")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent().getParent().getParent().getParent();
			Baralho brlh = null;
			brlh = brlh.getInstance();

			Jogador j1 = null;
			j1 = j1.getInstance1();

			Jogador j2 = null;
			j2 = j2.getInstance2();

			Jogador j3 = null;
			j3 = j3.getInstance3();

			Jogador j4 = null;
			j4 = j4.getInstance4();

			j3.setStop(1);			
			j3.setValor(brlh.ContaValores(3));
			zz.dispose();

			if (brlh.getNumjog()==3){
				if (j1.getStop()==1 && j2.getStop()==1 && j3.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}

			}
			else if (brlh.getNumjog()==4){
				if (j1.getStop()==1 && j2.getStop()==1 && j3.getStop()==1 && j4.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
		}

		if (arg0.getComponent().getName().equals("Stop4")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent().getParent().getParent().getParent();
			Baralho brlh = null;
			brlh = brlh.getInstance();

			Jogador j1 = null;
			j1 = j1.getInstance1();

			Jogador j2 = null;
			j2 = j2.getInstance2();

			Jogador j3 = null;
			j3 = j3.getInstance3();

			Jogador j4 = null;
			j4 = j4.getInstance4();

			j4.setStop(1);
			j4.setValor(brlh.ContaValores(4));
			zz.dispose();

			if (brlh.getNumjog()==4){
				if (j1.getStop()==1 && j2.getStop()==1 && j3.getStop()==1 && j4.getStop()==1){
					BancaJogo bjframe = new BancaJogo();
				}
			}
		}

		if (arg0.getComponent().getName().equals("ConfirmaOK")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent().getParent().getParent();
			zz.dispose();
			Controle cnt = null;
			cnt = cnt.getInstance();
			PainelBanca painel = null;
			
			if(cnt.getCount()==0){
				painel = painel.getInstance0();
			}
			if(cnt.getCount()==1){
				painel = painel.getInstance1();
			}
//			if(cnt.getCount()==2){
//				painel = painel.getInstance2();
//			}
//			if(cnt.getCount()==3){
//				painel = painel.getInstance3();
//			}
//			if(cnt.getCount()==4){
//				painel = painel.getInstance4();
//			}
//			if(cnt.getCount()==5){
//				painel = painel.getInstance5();
//			}
//			if(cnt.getCount()==6){
//				painel = painel.getInstance6();
//			}
//			if(cnt.getCount()==7){
//				painel = painel.getInstance7();
//			}
//			if(cnt.getCount()==8){
//				painel = painel.getInstance8();
//			}
//			if(cnt.getCount()==9){
//				painel = painel.getInstance9();
//			}
//			if(cnt.getCount()==10){
//				painel = painel.getInstance10();
//			}
//			if(cnt.getCount()==11){
//				painel = painel.getInstance11();
//			}
//			if(cnt.getCount()==12){
//				painel = painel.getInstance12();
//			}
//			if(cnt.getCount()==13){
//				painel = painel.getInstance13();
//			}
//			if(cnt.getCount()==14){
//				painel = painel.getInstance14();
//			}
//			if(cnt.getCount()==15){
//				painel = painel.getInstance15();
//			}
//			if(cnt.getCount()==16){
//				painel = painel.getInstance16();
//			}
//			if(cnt.getCount()==17){
//				painel = painel.getInstance17();
//			}
//			if(cnt.getCount()==18){
//				painel = painel.getInstance18();
//			}
//			if(cnt.getCount()==19){
//				painel = painel.getInstance19();
//			}
			
			Banca banca = new Banca();
			Baralho brlh = null;
			brlh = brlh.getInstance();
			Jogador j1 = null;
			j1 = j1.getInstance1();
			Jogador j2 = null;
			j2 = j2.getInstance2();
			Jogador j3 = null;
			j3 = j3.getInstance3();
			Jogador j4 = null;
			j4 = j4.getInstance4();
			int vetJogs[] = new int [4];
			int maior;
			int sizewinY=80;
			JLabel jlnumpoints = (JLabel) painel.getComponent(3);
			JLabel cartavirada = (JLabel) painel.getComponent(2);

			int pontosmesa = Integer.parseInt(jlnumpoints.getText());

			banca.setValor(brlh.ContaValores(5));

			vetJogs[0] = j1.getValor();
			vetJogs[1] = j2.getValor();
			vetJogs[2] = j3.getValor();
			vetJogs[3] = j4.getValor();

			maior = banca.MaiorValor(vetJogs);

			while (banca.getValor() <= maior && maior <= 21) {
				cartavirada.setVisible(false);
				Carta c = new Carta();
				c = brlh.RetornaCarta();
				CartaLabel jl = new CartaLabel(c);
				brlh.DiminuiCartas();
				c.setFlag(0);
				c.setJogador(5);
				jl.setVisible(true);
				jl.setBounds(xsize-80, 300, 70, 94);
				painel.add(jl);
				pontosmesa += c.getValor();
				jlnumpoints.setText(Integer.toString(pontosmesa));
				painel.repaint();
				banca.SomaValor(c.getValor());
				xsize += 80;
			}
			if (banca.getValor() < 21 && maior < 21){
				Font fonte2 = new Font("Arial", Font.BOLD, 32);
				JLabel bancwin = new JLabel("Mesa vence!");
				bancwin.setForeground(Color.WHITE);
				bancwin.setFont(fonte2);
				bancwin.setBounds(250, 60, 300, 50);
				bancwin.setVisible(true);
				painel.add(bancwin);
				painel.repaint();
			}

			else {
				Font fonte2 = new Font("Arial", Font.BOLD, 32);
				if (j1.getValor()==maior){
					JLabel jogwin = new JLabel("Jogador 1 vence!");
					j1.setDinheiro((j1.getBet()*2)+j1.getDinheiro());
					jogwin.setForeground(Color.WHITE);
					jogwin.setFont(fonte2);
					jogwin.setBounds(250, sizewinY, 400, 50);
					jogwin.setVisible(true);
					painel.add(jogwin);
					sizewinY+=40;
				}
				if (j2.getValor()==maior){
					JLabel jogwin = new JLabel("Jogador 2 vence!");
					j2.setDinheiro((j2.getBet()*2)+j2.getDinheiro());
					jogwin.setForeground(Color.WHITE);
					jogwin.setFont(fonte2);
					jogwin.setBounds(250, sizewinY, 400, 50);
					jogwin.setVisible(true);
					painel.add(jogwin);
					sizewinY+=40;
				}
				if (j3.getValor()==maior){
					JLabel jogwin = new JLabel("Jogador 3 vence!");
					j3.setDinheiro((j3.getBet()*2)+j3.getDinheiro());
					jogwin.setForeground(Color.WHITE);
					jogwin.setFont(fonte2);
					jogwin.setBounds(250, sizewinY, 400, 50);
					jogwin.setVisible(true);
					painel.add(jogwin);
					sizewinY+=40;
				}
				if (j4.getValor()==maior){
					JLabel jogwin = new JLabel("Jogador 4 vence!");
					j4.setDinheiro((j4.getBet()*2)+j4.getDinheiro());
					jogwin.setForeground(Color.WHITE);
					jogwin.setFont(fonte2);
					jogwin.setBounds(250, sizewinY, 400, 50);
					jogwin.setVisible(true);
					painel.add(jogwin);
					sizewinY+=40;
				}
			}

			if (banca.getValor() > 21){
				Font fonte2 = new Font("Arial", Font.BOLD, 32);
				if (j1.getValor() < 21 && j1.getValor() != maior && j1.getValor() != 0){
					JLabel jogwin = new JLabel("Jogador 1 vence!");
					j1.setDinheiro((j1.getBet()*2)+j1.getDinheiro());
					jogwin.setForeground(Color.WHITE);
					jogwin.setFont(fonte2);
					jogwin.setBounds(250, sizewinY, 400, 50);
					jogwin.setVisible(true);
					painel.add(jogwin);
					sizewinY+=40;
				}
				if (j2.getValor() < 21 && j2.getValor() != maior && j2.getValor() != 0){
					JLabel jogwin = new JLabel("Jogador 2 vence!");
					j2.setDinheiro((j2.getBet()*2)+j2.getDinheiro());
					jogwin.setForeground(Color.WHITE);
					jogwin.setFont(fonte2);
					jogwin.setBounds(250, sizewinY, 400, 50);
					jogwin.setVisible(true);
					painel.add(jogwin);
					sizewinY+=40;
				}
				if (j3.getValor() < 21 && j3.getValor() != maior && j3.getValor() != 0){
					JLabel jogwin = new JLabel("Jogador 3 vence!");
					j3.setDinheiro((j3.getBet()*2)+j3.getDinheiro());
					jogwin.setForeground(Color.WHITE);
					jogwin.setFont(fonte2);
					jogwin.setBounds(250, sizewinY, 400, 50);
					jogwin.setVisible(true);
					painel.add(jogwin);
					sizewinY+=40;
				}
				if (j4.getValor() < 21 && j4.getValor() != maior && j4.getValor() != 0){
					JLabel jogwin = new JLabel("Jogador 4 vence!");
					j4.setDinheiro((j4.getBet()*2)+j4.getDinheiro());
					jogwin.setForeground(Color.WHITE);
					jogwin.setFont(fonte2);
					jogwin.setBounds(250, sizewinY, 400, 50);
					jogwin.setVisible(true);
					painel.add(jogwin);
					sizewinY+=40;
				}
			}

			if(cnt.getCount() < painel.getControle()){
				JButton newgame = new JButton("Jogar Novamente?");
				newgame.setLayout(null);
				newgame.setName("JogarNovamente");
				newgame.addMouseListener(tt);
				newgame.setBounds(245, 425, 200, 30);
				newgame.setVisible(true);
				painel.add(newgame);
				painel.repaint();
			}
		}

		if (arg0.getComponent().getName().equals("Bet1")) {
			Jogador j1 = null;
			j1 = j1.getInstance1();
			BetFrame bf = new BetFrame(j1);
			bf.setVisible(true);
		}

		if (arg0.getComponent().getName().equals("Bet2")) {
			Jogador j2 = null;
			j2 = j2.getInstance2();
			BetFrame bf = new BetFrame(j2);
			bf.setVisible(true);
		}

		if (arg0.getComponent().getName().equals("Bet3")) {
			Jogador j3 = null;
			j3 = j3.getInstance3();
			BetFrame bf = new BetFrame(j3);
			bf.setVisible(true);
		}

		if (arg0.getComponent().getName().equals("Bet4")) {
			Jogador j4 = null;
			j4 = j4.getInstance4();
			BetFrame bf = new BetFrame(j4);
			bf.setVisible(true);
		}

		if (arg0.getComponent().getName().equals("BetMais")) {
			JPanel zz = (JPanel) arg0.getComponent().getParent();
			JLabel jl = (JLabel) zz.getComponent(0);
			JButton jb = (JButton) zz.getComponent(1);
			int dinheiro=0;
			Jogador j1 = null;
			j1 = j1.getInstance1();
			Jogador j2 = null;
			j2 = j2.getInstance2();
			Jogador j3 = null;
			j3 = j3.getInstance3();
			Jogador j4 = null;
			j4 = j4.getInstance4();

			int jog = Integer.parseInt(jl.getText());

			if (jog == 1){
				dinheiro = j1.getDinheiro();
			}

			if (jog == 2){
				dinheiro = j2.getDinheiro();
			}

			if (jog == 3){
				dinheiro = j3.getDinheiro();
			}

			if (jog == 4){
				dinheiro = j4.getDinheiro();
			}

			int aposta = Integer.parseInt(jb.getText());
			if ((aposta+100)<=dinheiro){
				aposta+=100;
			}
			jb.setText(Integer.toString(aposta));
		}

		if (arg0.getComponent().getName().equals("BetMenos")) {
			JPanel zz = (JPanel) arg0.getComponent().getParent();
			JButton jb = (JButton) zz.getComponent(1);
			int aposta = Integer.parseInt(jb.getText());
			aposta-=100;
			if (aposta>=0){
				jb.setText(Integer.toString(aposta));
			}
		}

		if (arg0.getComponent().getName().equals("ConfirmaAposta")) {
			JFrame frame = (JFrame) arg0.getComponent().getParent().getParent().getParent().getParent();
			JPanel panel = (JPanel) arg0.getComponent().getParent();
			JLabel jl = (JLabel) panel.getComponent(0);
			JButton jb = (JButton) panel.getComponent(1);
			Jogador j1 = null;
			j1 = j1.getInstance1();
			Jogador j2 = null;
			j2 = j2.getInstance2();
			Jogador j3 = null;
			j3 = j3.getInstance3();
			Jogador j4 = null;
			j4 = j4.getInstance4();

			int jog = Integer.parseInt(jl.getText());
			int bet = Integer.parseInt(jb.getText());

			if (jog == 1){
				j1.setBet(bet);
				j1.setDinheiro(j1.getDinheiro()-j1.getBet());
			}

			if (jog == 2){
				j2.setBet(bet);
				j2.setDinheiro(j2.getDinheiro()-j2.getBet());
			}

			if (jog == 3){
				j3.setBet(bet);
				j3.setDinheiro(j3.getDinheiro()-j3.getBet());
			}

			if (jog == 4){
				j4.setBet(bet);
				j4.setDinheiro(j4.getDinheiro()-j4.getBet());
			}
			frame.dispose();
		}

		if (arg0.getComponent().getName().equals("Dinheiro1")) {
			Jogador j1 = null;
			j1 = j1.getInstance1();
			DinheiroFrame bf = new DinheiroFrame(j1);
			bf.setVisible(true);
		}

		if (arg0.getComponent().getName().equals("Dinheiro2")) {
			Jogador j2 = null;
			j2 = j2.getInstance2();
			DinheiroFrame bf = new DinheiroFrame(j2);
			bf.setVisible(true);
		}

		if (arg0.getComponent().getName().equals("Dinheiro3")) {
			Jogador j3= null;
			j3 = j3.getInstance3();
			DinheiroFrame bf = new DinheiroFrame(j3);
			bf.setVisible(true);
		}

		if (arg0.getComponent().getName().equals("Dinheiro4")) {
			Jogador j4 = null;
			j4 = j4.getInstance4();
			DinheiroFrame bf = new DinheiroFrame(j4);
			bf.setVisible(true);
		}

		if (arg0.getComponent().getName().equals("JogarNovamente")) {
			JFrame zz = (JFrame) arg0.getComponent().getParent().getParent().getParent().getParent().getParent();
			zz.dispose();
			Controle cnt = null;
			cnt = cnt.getInstance();
			cnt.add();
			Banca banca = new Banca();
			Baralho brlh = null;
			brlh = brlh.getInstance();
			Jogador j1 = null;
			j1 = j1.getInstance1();
			Jogador j2 = null;
			j2 = j2.getInstance2();
			Jogador j3 = null;
			j3 = j3.getInstance3();
			Jogador j4 = null;
			j4 = j4.getInstance4();

			j1.ZeraJogador();
			j2.ZeraJogador();
			j3.ZeraJogador();
			j4.ZeraJogador();
			brlh.RefazerBaralho();
			Mesa mv = new Mesa();

			if(brlh.getNumjog()==1){
				TelaJogador ms1 = new TelaJogador(1);
				ms1.setBounds(69, 122, TXT_X, TXT_Y);
			}

			if(brlh.getNumjog()==2){
				TelaJogador ms1 = new TelaJogador(1);
				ms1.setBounds(69, 122, TXT_X, TXT_Y);
				TelaJogador ms2 = new TelaJogador(2);
				ms2.setBounds(69, 395, TXT_X, TXT_Y);
			}

			if(brlh.getNumjog()==3){
				TelaJogador ms1 = new TelaJogador(1);
				ms1.setBounds(69, 122, TXT_X, TXT_Y);
				TelaJogador ms2 = new TelaJogador(2);
				ms2.setBounds(69, 395, TXT_X, TXT_Y);
				TelaJogador ms3 = new TelaJogador(3);
				ms3.setBounds(1046, 122, TXT_X, TXT_Y);
			}

			if(brlh.getNumjog()==4){
				TelaJogador ms1 = new TelaJogador(1);
				ms1.setBounds(69, 122, TXT_X, TXT_Y);
				TelaJogador ms2 = new TelaJogador(2);
				ms2.setBounds(69, 395, TXT_X, TXT_Y);
				TelaJogador ms3 = new TelaJogador(3);
				ms3.setBounds(1046, 122, TXT_X, TXT_Y);
				TelaJogador ms4 = new TelaJogador(4);
				ms4.setBounds(1046, 395, TXT_X, TXT_Y);
			}
		}
	}

	public void mouseEntered(MouseEvent arg0) {

	}

	public void mouseExited(MouseEvent arg0) {

	}

	public void mousePressed(MouseEvent arg0) {

	}

	public void mouseReleased(MouseEvent arg0) {

	}
}
