package waldock;

import org.junit.Assert;
import org.junit.Test;

public class Check2 {

	
	public void testByValue(int n){
		double erg1 = 25 * Math.pow(ZahlenUtils.fibonacciArr(n), 2);
		double erg2 = 2 * Math.pow(ZahlenUtils.lukasRec(n + 1), 2)
				- Math.pow(ZahlenUtils.lukasRec(n), 2)
				+ 2 * Math.pow(ZahlenUtils.lukasRec(n - 1), 2);
		
		// Kleine abweichung bei den letzten Kommastellen --> deswegen nach int!
		Assert.assertEquals("Values must be the same!", (int)erg1, (int)erg2);
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
