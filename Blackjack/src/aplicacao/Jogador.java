package aplicacao;

public class Jogador {

	private static final Jogador INSTANCE1 = new Jogador();
	private static final Jogador INSTANCE2 = new Jogador();
	private static final Jogador INSTANCE3 = new Jogador();
	private static final Jogador INSTANCE4 = new Jogador();

	private int stop=0;
	private int valor=0;
	private int bet=0;
	private int dinheiro=10000;
	
	private Jogador (){

	}

	public int getStop() {
		return stop;
	}

	public void setStop(int stop) {
		this.stop = stop;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void ZeraJogador(){
		this.valor=0;
		this.stop=0;
		this.bet=0;
	}
	
	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	public static synchronized Jogador getInstance1(){
		return INSTANCE1;
	}
	public static synchronized Jogador getInstance2(){
		return INSTANCE2;
	}
	public static synchronized Jogador getInstance3(){
		return INSTANCE3;
	}
	public static synchronized Jogador getInstance4(){
		return INSTANCE4;
	}
}
