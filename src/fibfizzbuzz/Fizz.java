package fibfizzbuzz;

public class Fizz extends FFBBase implements FormatChain {

	public String Format(int i) {
		if (i % 3 == 0) {
			String fzStr = "Fizz";
			if (this.chain != null) {
				fzStr += this.chain.Format(i);
			}
			return fzStr;
		} else {
			if (this.chain != null) {
				return this.chain.Format(i);
			}
		}
		return super.Format(i);
	}
}
