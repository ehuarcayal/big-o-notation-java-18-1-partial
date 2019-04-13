package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

	public static void main(String[] args) {
		long N = 80;
		Exponential exponential = new Exponential();
		Stopwatch stopwatch = Stopwatch.createStarted();
		for (int i = 1; i <= N; i++) {
			try {
				long fibonacci = exponential.fibonacciOpt(i);
				System.out.println(i + " => " + fibonacci);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
		System.out.println(String.format("Time elapsed: %d seconds", stopwatch.elapsed(TimeUnit.SECONDS)) + "\n");
	}
	
	
	//Optimización del Algoritmo de fibonacci
	public long fibonacciOpt(int n) throws Exception{
		long a = 0, b = 1, c;
		
		if (n < 0) {
            throw new Exception("N can not be less than zero");
        }
		
	    for (int i = 0; i < n; i++) {
	    	c = a + b; 	 //Obtenemos el valor N-2
	        a = b;		//Asignamos el valor N al N-1  		 
	        b = c;		//Asignamos el valor N-2 al N-1 
	    }
			           
		return a;
	}
	
	public long fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("N can not be less than zero");
        }
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
