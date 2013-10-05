package aplicacao;

public class Carta {
	
	private int valor;
	private String nomecarta;
	private int flag=1;
	private int jogador;
	
	public Carta() {
		
	}
	
	public Carta(String s, int v) {
		valor = v;
		nomecarta = s;	
	}

	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getFlag() {
		return flag;
	}


	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getNomecarta() {
		return nomecarta;
	}

	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}
	
	

}