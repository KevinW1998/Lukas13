package waldock;

import org.junit.Assert;
import org.junit.Test;



public class Check1 {
	
	static final double alpha = (1 + Math.sqrt(5)) / 2;
	static final double beta = (1 - Math.sqrt(5)) / 2;
	
	
	public void testByValue(int n){
		double erg1 = (double)ZahlenUtils.lukasRec(n);
		double erg2 = Math.pow(alpha, n) + Math.pow(beta, n);
		
		// Kleine abweichung bei den letzten Kommastellen --> deswegen nach int!
		Assert.assertEquals("Values must be same!", (int)erg1, (int)erg2);
	}
	
	@Test
	public void test10(){
		testByValue(10);
	}
	
	@Test
	public void test19(){
		testByValue(19);
	}
	
	
}
