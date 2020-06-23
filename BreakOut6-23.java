

import java.util.*; 


public class Main {
	public static void main(String[] args) {

		int[] nums = {23,34,5,2,12,3,4,5,7,8,9,67,4,12,33,87};

		
		System.out.print("Problem 1: "+"\n"); 
		for (int i = 0; i<nums.length; i++ ) {
				System.out.print(nums[i]+", "); 
		}

		System.out.print("\n"); 


		// 2. enhanced for loop 
		System.out.print("Problem 2: "+"\n"); 
		for ( int num : nums ) {
			System.out.print(num+", "); 
		}

			System.out.print("\n"); 

			// 3. a forEach loop 
			System.out.print("Problem 3: "+"\n"); 
			ArrayList<Integer> numList = new ArrayList<Integer>();
			for ( int n : nums ) {
				numList.add(n); 
			}
			numList.forEach((n) -> System.out.print(n + ", "));

	}
}
//1.) 



//output the results of the above array using the 3 types of for loops:

//1. traditional for loop

//2. an enhanced for loop

//3. a forEach() loop



//2.) There is another javascript file here called legoTime.js The function is called legoTime().  Rewrite that function in java, and convert the if statements into a swtich statement.

