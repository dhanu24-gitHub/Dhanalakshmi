package FunctionsClass;

public class UseFindMin {
	public static void main(String[]args) {
		FindMin1 m = new FindMin1();
		int[] nums = {35,57,89,14,24,47,79};
		System.out.println(m.FindMin(nums));
		int[] nums1 = {35,289,1,37,9,24,6};
		System.out.println(m.FindMin(nums1));
	}

}
