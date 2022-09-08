package fibfizzbuzz;

public interface FormatChain {
	FormatChain setNextChain(FormatChain nextChain);

	public String Format(int a);
}
