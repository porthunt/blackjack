package frames;


import javax.swing.*;

import paineis.PainelBanca;

import aplicacao.Baralho;
import aplicacao.Controle;

public class Mesa extends JFrame {

	public final int LARG_DEFAULT = 700;
	public final int ALT_DEFAULT = 525;

	public Mesa() {
		Controle cnt = null;
		cnt = cnt.getInstance();
		setTitle("Blackjack");
		setBounds(333, 122, LARG_DEFAULT, ALT_DEFAULT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		PainelBanca painel = null;
		
		if(cnt.getCount()==0){
			painel = painel.getInstance0();
		}
		if(cnt.getCount()==1){
			painel = painel.getInstance1();
		}
//		if(cnt.getCount()==2){
//			painel = painel.getInstance2();
//		}
//		if(cnt.getCount()==3){
//			painel = painel.getInstance3();
//		}
//		if(cnt.getCount()==4){
//			painel = painel.getInstance4();
//		}
//		if(cnt.getCount()==5){
//			painel = painel.getInstance5();
//		}
//		if(cnt.getCount()==6){
//			painel = painel.getInstance6();
//		}
//		if(cnt.getCount()==7){
//			painel = painel.getInstance7();
//		}
//		if(cnt.getCount()==8){
//			painel = painel.getInstance8();
//		}
//		if(cnt.getCount()==9){
//			painel = painel.getInstance9();
//		}
//		if(cnt.getCount()==10){
//			painel = painel.getInstance10();
//		}
//		if(cnt.getCount()==11){
//			painel = painel.getInstance11();
//		}
//		if(cnt.getCount()==12){
//			painel = painel.getInstance12();
//		}
//		if(cnt.getCount()==13){
//			painel = painel.getInstance13();
//		}
//		if(cnt.getCount()==14){
//			painel = painel.getInstance14();
//		}
//		if(cnt.getCount()==15){
//			painel = painel.getInstance15();
//		}
//		if(cnt.getCount()==16){
//			painel = painel.getInstance16();
//		}
//		if(cnt.getCount()==17){
//			painel = painel.getInstance17();
//		}
//		if(cnt.getCount()==18){
//			painel = painel.getInstance18();
//		}
//		if(cnt.getCount()==19){
//			painel = painel.getInstance19();
//		}
		
		this.add(painel);
	}
}
