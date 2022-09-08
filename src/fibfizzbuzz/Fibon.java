package fibfizzbuzz;

import java.util.ArrayList;

public class Fibon extends FFBBase implements FormatChain {

	private static ArrayList<Integer> fibArray = new ArrayList<Integer>();

	public String Format(int i) {
		String retStr = "";
		GenFibArray(1, i);
		if (CheckFib(i)) {
			retStr += "Fibonacci!";
			return retStr;
		} else {
			if (this.chain != null) {
				retStr += this.chain.Format(i);
			}
		}
		return retStr;
	}

	private static void GenFibArray(int start, int end) {
		fibArray.clear();
		int prevOne = 0;
		fibArray.add(prevOne);
		int prevTwo = 1;
		fibArray.add(prevTwo);
		int fibNum = 0;
		while (fibNum <= end) {
			fibNum = prevOne + prevTwo;
			prevOne = prevTwo;
			prevTwo = fibNum;
			fibArray.add(fibNum);
		}
	}

	private Boolean CheckFib(int end) {
		for (int i = 0; i < fibArray.size(); i++) {
			if (fibArray.get(i) == end) {
				return true;
			}
		}
		return false;
	}

}
