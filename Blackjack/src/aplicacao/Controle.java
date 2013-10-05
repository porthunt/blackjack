package aplicacao;

public class Controle {
	
	private static final Controle INSTANCE = new Controle();
	private int count=0;
	
	private Controle(){
		
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void add(){
		count+=1;
	}

	public static synchronized Controle getInstance(){
		return INSTANCE;
	}
}
