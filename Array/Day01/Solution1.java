


// day 1

class Solution1 {
    public int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}


 //  second Largest number
 // time complexity O(n)
 /*
  * Approach 1 (using Sorting)
  =>  Sort all the elements
  => return the second largest
  => T.c = O(nlogn)
  => S.c = O(1)

  * Approach 2 (In two iterations)
  => in two interaction 
  => Find max value in 1st iterations
  => Find max value (less than the previous ) in the 2nd iterations
  => T.c = O(2n) = O(n)
  => S.c. = O(1)

  * Approach 3 (In one iterations
  => look for max and keep track of the previous updated value .and the second max value
  => T.c. = O(n)
  => S.c. = O(1)
 */






