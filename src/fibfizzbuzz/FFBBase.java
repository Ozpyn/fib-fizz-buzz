//Name: Gabriel (ozpyn) Mingle
//Date: 9/5/2022

package fibfizzbuzz;

public abstract class FFBBase implements FormatChain {

	public FormatChain chain;

	public FormatChain setNextChain(FormatChain nextChain) {
		this.chain = nextChain;
		return this.chain;
	}

	public void PrintRange(int start, int end) {
		if (end < start) {
			int temp = start;
			start = end;
			end = temp;
		}
		for (int l = start; l <= end; l++) {
			String retStr2 = Format(l);
			System.out.println(l + " " + retStr2);
		}
	}

	public String Format(int i) {
		String retStr = "";
		if (this.chain != null) {

			retStr += this.chain.Format(i);
		}
		return retStr;
	}

}
