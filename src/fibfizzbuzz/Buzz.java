package fibfizzbuzz;

public class Buzz extends FFBBase implements FormatChain {

	public String Format(int i) {
		if (i % 5 == 0) {
			String bzStr = "Buzz";
			if (this.chain != null) {
				bzStr += this.chain.Format(i);
			}
			return bzStr;
		} else {
			if (this.chain != null) {
				return this.chain.Format(i);
			}
		}
		return super.Format(i);
	}
}
