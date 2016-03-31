package waldock;

public class ZahlenUtils {
	public static int lukasRec(int n){
		if(n < 0)
			throw new ArithmeticException("n is smaller than 0!");
		
		if(n == 1)
			return 1;
		if(n == 0)
			return 2;
		
		return lukasRec(n - 2) + lukasRec(n - 1);
	}
	
	public static long fibonacciArr(int n){
		if(n < 0)
			throw new ArithmeticException("n is smaller than 0!");

		int arrLen = n + 1;
		int fibVals[] = new int[arrLen];

		for(int i = 0; i < arrLen; i++){
			if(i <= 1)
				fibVals[i] = i;
			else
				fibVals[i] = fibVals[i - 1] + fibVals[i - 2];
		}
		
		return fibVals[n];
	}
	
}
