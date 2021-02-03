package src;

public class Maths {
	
	
	public int sum(int[] nums) {
		int total = 0;
		for(int x : nums) {
			total += x;
		}
		return total;
	}
	
	//Used to test assertTrue and assertFalse
	public boolean isEqual(int var1, int var2) {
		return var1 == var2;
	}
}
