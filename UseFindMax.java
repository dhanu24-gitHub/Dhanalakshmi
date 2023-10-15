package FunctionsClass;

public class UseFindMax {
	public static void main(String[]args) {
		FindMax f = new FindMax();
		int[] nums = {95,35,57,38,89,100};
		System.out.println(f.findMax(nums));
		int[] nums1 = {35,57,78,39,99,70};
		System.out.println(f.findMax(nums1));
	}

}
