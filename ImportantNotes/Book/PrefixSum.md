### 1. Prefix Sum


![image](https://github.com/user-attachments/assets/fdeb2d5f-bedd-4c9b-997d-20449b54ba9a)


### Given an array nums, answer multiple queries about the sum of elements within a specific range [i, j].


- Prefix Sum involves preprocessing an array to create a new array where each element at index i represents the sum of the array from the start up to i. This allows for efficient sum queries on subarrays.

- Use this pattern when you need to perform multiple sum queries on a subarray or need to calculate cumulative sums.

# Example:

`Input: nums = [1, 2, 3, 4, 5, 6], i = 1, j = 3`

`Output: 9`

### Explanation:
## Preprocess the array A to create a prefix sum array: `P = [1, 3, 6, 10, 15, 21].`

### To find the sum between indices i and j, use the formula: `P[j] - P[i-1].`




## **Prefix Sum - A Beginner-Friendly Guide**

### **What is Prefix Sum?**
Prefix Sum is a common algorithmic technique used to preprocess an array, allowing us to quickly calculate the sum of elements in any subarray. Instead of summing the elements repeatedly, we store the cumulative sums in an auxiliary array.

---

### **Why Use Prefix Sum?**
Calculating the sum of elements in an array repeatedly can be inefficient for large arrays. Prefix Sum optimizes this by preprocessing the array, reducing time complexity from \(O(n \times q)\) (where \(q\) is the number of queries) to \(O(n + q)\).

---

### **How It Works?**

1. **Preprocessing:**
   Create an array `prefix[]` where each element at index `i` stores the sum of elements from index `0` to `i` in the original array.

   Formula:
   \[
   prefix[i] = prefix[i-1] + arr[i]
   \]
   (For \(i = 0\), \(prefix[0] = arr[0]\))

2. **Querying a Range Sum:**
   For a subarray \([L, R]\), the sum is:
   \[
   sum(L, R) = prefix[R] - prefix[L-1]
   \]
   (If \(L = 0\), \(sum(L, R) = prefix[R]\))

---

### **Example**

#### Given Array:
\[ arr = [2, 4, 5, 6, 8] \]

#### Step 1: Build Prefix Array
\[
prefix = [2, 6, 11, 17, 25]
\]

- prefix[0] = arr[0] = 2  
- prefix[1] = prefix[0] + arr[1] = 2 + 4 = 6  
- prefix[2] = prefix[1] + arr[2] = 6 + 5 = 11  
- prefix[3] = prefix[2] + arr[3] = 11 + 6 = 17  
- prefix[4] = prefix[3] + arr[4] = 17 + 8 = 25  

#### Step 2: Query Example
Find the sum of elements in the range \([1, 3]\):
\[
sum(1, 3) = prefix[3] - prefix[0] = 17 - 2 = 15
\]

---

### **Code Implementation**

#### **Java Code**:
```java
public class PrefixSumExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8};
        int n = arr.length;

        // Step 1: Build Prefix Sum Array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Query Example: Sum from index 1 to 3
        int L = 1, R = 3;
        int sum = prefix[R] - (L > 0 ? prefix[L - 1] : 0);
        System.out.println("Sum from index " + L + " to " + R + " is: " + sum);
    }
}
```

---

### **Visualization**
#### Step-by-step visualization:
| Index \(i\) | Array \(arr[i]\) | Prefix Sum \(prefix[i]\) |
|-------------|-----------------|--------------------------|
| 0           | 2               | 2                        |
| 1           | 4               | 6                        |
| 2           | 5               | 11                       |
| 3           | 6               | 17                       |
| 4           | 8               | 25                       |

#### Range Sum Calculation:
If you need the sum of elements from index 1 to 3:
- Use the **Prefix Array** values:
  \[
  prefix[3] = 17,\ prefix[0] = 2
  \]
- Apply the formula:
  \[
  sum(1, 3) = prefix[3] - prefix[0] = 17 - 2 = 15
  \]

---

### **Applications of Prefix Sum**
1. **Range Queries:** Quickly solve sum-related queries in subarrays.
2. **2D Prefix Sum:** Extend this logic to 2D arrays for matrix-based problems.
3. **Optimization Problems:** Often used in dynamic programming and sliding window techniques.

---

### **Practice Problems**
- [Range Sum Query - LeetCode](https://leetcode.com/problems/range-sum-query-immutable/)
- [Subarray Sum Equals K - LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)
- [Prefix Sum and Queries - GeeksforGeeks](https://practice.geeksforgeeks.org/)

---

### **Additional Notes**
1. **Space Optimization:** If memory is a concern, you can directly modify the original array to store the prefix sums.
2. **Edge Cases:** Handle queries like \(L = 0\) carefully to avoid accessing negative indices.



