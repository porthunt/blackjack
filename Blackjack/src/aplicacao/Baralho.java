package aplicacao;

public final class Baralho {

	private static final Baralho INSTANCE = new Baralho();
	private int numcartas = 52;
	private int numjog;
	Carta brl[] = new Carta[52];
	
	
	
	private Baralho(){
		brl[0] = new Carta ("espadas/adeespadas.png", 1);
		brl[1] = new Carta ("espadas/2deespadas.png", 2);
		brl[2] = new Carta ("espadas/3deespadas.png", 3);
		brl[3] = new Carta ("espadas/4deespadas.png", 4);
		brl[4] = new Carta ("espadas/5deespadas.png", 5);
		brl[5] = new Carta ("espadas/6deespadas.png", 6);
		brl[6] = new Carta ("espadas/7deespadas.png", 7);
		brl[7] = new Carta ("espadas/8deespadas.png", 8);
		brl[8] = new Carta ("espadas/9deespadas.png", 9);
		brl[9] = new Carta ("espadas/10deespadas.png", 10);
		brl[10] = new Carta ("espadas/jdeespadas.png", 10);
		brl[11] = new Carta ("espadas/qdeespadas.png", 10);
		brl[12] = new Carta ("espadas/kdeespadas.png", 10);
		brl[13] = new Carta ("copas/adecopas.png", 1);
		brl[14] = new Carta ("copas/2decopas.png", 2);
		brl[15] = new Carta ("copas/3decopas.png", 3);
		brl[16] = new Carta ("copas/4decopas.png", 4);
		brl[17] = new Carta ("copas/5decopas.png", 5);
		brl[18] = new Carta ("copas/6decopas.png", 6);
		brl[19] = new Carta ("copas/7decopas.png", 7);
		brl[20] = new Carta ("copas/8decopas.png", 8);
		brl[21] = new Carta ("copas/9decopas.png", 9);
		brl[22] = new Carta ("copas/10decopas.png", 10);
		brl[23] = new Carta ("copas/jdecopas.png", 10);
		brl[24] = new Carta ("copas/qdecopas.png", 10);
		brl[25] = new Carta ("copas/kdecopas.png", 10);
		brl[26] = new Carta ("ouros/adeouros.png", 1);
		brl[27] = new Carta ("ouros/2deouros.png", 2);
		brl[28] = new Carta ("ouros/3deouros.png", 3);
		brl[29] = new Carta ("ouros/4deouros.png", 4);
		brl[30] = new Carta ("ouros/5deouros.png", 5);
		brl[31] = new Carta ("ouros/6deouros.png", 6);
		brl[32] = new Carta ("ouros/7deouros.png", 7);
		brl[33] = new Carta ("ouros/8deouros.png", 8);
		brl[34] = new Carta ("ouros/9deouros.png", 9);
		brl[35] = new Carta ("ouros/10deouros.png", 10);
		brl[36] = new Carta ("ouros/jdeouros.png", 10);
		brl[37] = new Carta ("ouros/qdeouros.png", 10);
		brl[38] = new Carta ("ouros/kdeouros.png", 10);
		brl[39] = new Carta ("paus/adepaus.png", 1);
		brl[40] = new Carta ("paus/2depaus.png", 2);
		brl[41] = new Carta ("paus/3depaus.png", 3);
		brl[42] = new Carta ("paus/4depaus.png", 4);
		brl[43] = new Carta ("paus/5depaus.png", 5);
		brl[44] = new Carta ("paus/6depaus.png", 6);
		brl[45] = new Carta ("paus/7depaus.png", 7);
		brl[46] = new Carta ("paus/8depaus.png", 8);
		brl[47] = new Carta ("paus/9depaus.png", 9);
		brl[48] = new Carta ("paus/10depaus.png", 10);
		brl[49] = new Carta ("paus/jdepaus.png", 10);
		brl[50] = new Carta ("paus/qdepaus.png", 10);
		brl[51] = new Carta ("paus/kdepaus.png", 10);
	}
	
	public Carta RetornaCarta() {
		
		
		InteiroRandom rdm = new InteiroRandom();
		int numrandom = rdm.NumRandom();
		
		while(brl[numrandom].getFlag()==0){
			numrandom = rdm.NumRandom();
		}
		return this.brl[numrandom];
	}

	public int getNumcartas() {
		return numcartas;
	}

	public void DiminuiCartas() {
		this.numcartas--;
	}
	
	public int SomaValoresJogador(int jg){
		int somajogador=0;
		int i;
		for(i=0;i<=51;i++){
			if(brl[i].getJogador()==jg){
			somajogador += brl[i].getValor();
			}
		}
		return somajogador;
	}

	public int ContaValores(int jg) {
		int soma = this.SomaValoresJogador(jg);
		return soma;
	}
	
	public void RefazerBaralho() {
		int i;
		for (i=0; i<52; i++){
			this.brl[i].setFlag(1);
			this.brl[i].setJogador(0);
		}
	}
	
	 public int getNumjog() {
		return numjog;
	}

	public void setNumjog(int numjog) {
		this.numjog = numjog;
	}

	public static synchronized Baralho getInstance(){
         return INSTANCE;
   }
}
