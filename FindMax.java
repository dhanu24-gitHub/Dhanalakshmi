package FunctionsClass;

public class FindMax {
	public String findMax(int[]a) {
		int b = a[0];
		for(int i = 0; i< a.length; i++) {
			if (a[i] > b) {
				b = a[i];
			}
		}
		return "The Max Number Is "+ b;
	}

}
