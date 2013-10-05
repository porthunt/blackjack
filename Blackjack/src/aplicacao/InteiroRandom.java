package aplicacao;

import java.util.Random;

public class InteiroRandom {

	public InteiroRandom(){
	}
	
	public int NumRandom (){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(51);
		return randomInt;
	}
	
}
