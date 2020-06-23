

import java.util.*; 


public class Main {
	public static void main(String[] args) {

		int[] nums = {23,34,5,2,12,3,4,5,7,8,9,67,4,12,33,87};
		ArrayList<Integer> NumsList = new ArrayList<Integer>();
    Collections.addAll(NumsList ,nums);

		for (int i = 0; i<nums.length; i++ ) {
				System.out.print(nums[i]+", "); 
		}

		System.out.print("\n"); 


		// 2. enhanced for loop 
		for ( int num : nums ) {
			System.out.print(num+", "); 
		}

			System.out.print("\n"); 

			// 3. a forEach loop 

			NumsList.forEach(num -> System.out.print(num+", ")); 


	}
}
//1.) 



//output the results of the above array using the 3 types of for loops:

//1. traditional for loop

//2. an enhanced for loop

//3. a forEach() loop



//2.) There is another javascript file here called legoTime.js The function is called legoTime().  Rewrite that function in java, and convert the if statements into a swtich statement.
