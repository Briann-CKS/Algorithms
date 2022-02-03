/* 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * Simple algorithm in java
*/

import java.util.*;

public class ArrayMedian {

        public static void main (String[] args)
        {
                int [] nums1 = new int[] {1, 2, 8, 9};
                int [] nums2 = new int[] {3, 5, 10, 6};
                int [] nums3 = new int [nums1.length + nums2.length];
                int counter = 0;
                for (int i = 0; i < nums1.length; i++)
                {
                    nums3[counter] = nums1[i];
                    counter++;
                }       
                for (int i = 0; i < nums2.length;i++)
                {
                    nums3[counter] = nums2[i];
                    counter++;
                }   
      
		//Before sorting the array          
		for (int i=0;i<nums3.length;i++)
      		{
	 	    System.out.println(nums3[i]);
                }
                System.out.println("");

		// Sorting the array
                Arrays.sort(nums3);

		// After sorting the array
                for (int i=0;i<nums3.length;i++)
                {
	    	    System.out.println(nums3[i]);
                }
                System.out.println ("");

		// Check if array length is even or odd
                // If array length is even, add the middle two elements and divide two 
		if ((nums3.length % 2) == 0)
                {
                    int firstNum = nums3[nums3.length/2 - 1];
                    int secondNum = nums3[(nums3.length/2)];
                    double median = (double) (firstNum + secondNum)/2.0;
                    System.out.println("The median for this array is " + median);
                }
		// If array length is odd, the middle element of the array is its median
                else
                {
                    double median = (double)nums3[(nums3.length+1)/2 - 1];
                    System.out.println("The median of this array is " + median);
                }
        }
}
	
