package code2;

public class FibbonacciSeies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(fibonacci(0));
	}
	private static int fibonacci(int number) {
		/*
		 * int fir=0,sec=1,i=0,fib=0; while(i<number-1) { fib =fir+sec; fir=sec;
		 * sec=fib; i++; } System.out.println(fib);
		 */
		if(number<=1) return number;
		return fibonacci(number-1) + fibonacci(number-2);
	}

}
