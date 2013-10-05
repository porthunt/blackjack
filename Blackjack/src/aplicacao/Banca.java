package aplicacao;

public class Banca {
	
	private int valor=0;

	public Banca(){

	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int MaiorValor (int vetJogs[]) {
		int i;
		int maiorvalor=0;
		
		if (vetJogs != null){
			for (i=0; i<vetJogs.length;i++){
				if (vetJogs[i] > maiorvalor && vetJogs[i] <= 21){
					maiorvalor = vetJogs[i];
				}
			}
		}
		return maiorvalor;
	}
	
	public void SomaValor (int n){
		this.valor += n;
	}
	
}
