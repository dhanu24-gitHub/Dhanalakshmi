package FunctionsClass;

public class FindMin1 {
	public String FindMin(int[] a){
		int b = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < b ) {
				b = a[i];
			}
		}
		return "The Min Number Is "+ b;
	}

}
