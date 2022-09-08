package fibfizzbuzz;

public class TesterTemp {
	public static void main(String[] args) {
		int min = 1;
		int max = 100;

		// try max = Integer.MAX_VALUE
		// ;)

		Fizz test1 = new Fizz();
		test1.PrintRange(min, max);

		Buzz test2 = new Buzz();
		test2.PrintRange(min, max);

		Fibon test3 = new Fibon();
		test3.PrintRange(min, max);

		FFBBase c1 = new Fibon();
		FFBBase c2 = new Fizz();
		FFBBase c3 = new Buzz();
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		c1.PrintRange(min, max);
	}
}
