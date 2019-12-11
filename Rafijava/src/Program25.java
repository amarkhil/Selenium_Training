//Trying to get larger value between first and last element of a array of integers.
import java.util.Arrays;


public class Program25 {

	public static void main(String[] args) {
		int[]array_nums= {10, 30, 5};
		System.out.println("Original Array: " +Arrays.toString(array_nums));
		
		int max_val = array_nums[0];
		if(array_nums[2] >= max_val)
			max_val = array_nums[2];
		
		System.out.println("Larger value between first and last element: "+max_val);
		
	}}
