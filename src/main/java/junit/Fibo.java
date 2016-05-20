package junit;

public class Fibo {

	
	public static int fib(int n) {
		if(n<0)
			throw new IllegalArgumentException();
		if(n>46)
			throw new IllegalArgumentException();
		if(n == 0)
			return 0;
		if(n <= 2)
			return 1;
		return fib(n-1)+fib(n-2);
	}

}
