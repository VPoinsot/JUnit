package junit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloJUnit hello = new HelloJUnit();
		System.out.println(hello.hello());
		System.out.println(Math.exp(Double.MAX_VALUE));
		for(int i = 0; i<Integer.MAX_VALUE; i++)
			System.out.println("i = "+ i + "; " + Fibo.fib(i));
	}

}
