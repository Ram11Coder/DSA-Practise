# Sorting Algorithms 
Sorting -> Arranging element in particular order either in ascending or descending 

Classification
1.Comparison
2.Swapping or inversion count
3.Space /in-place 
4.recursive or iterative
5.Stability
6.Time complexity


### Bubble sort
- Compare the two elements if first elements is greater than second element then swap it.
- Once iterate the with swapping you will find the last element as highest value
- iteration - n+(n-1)+(n-2)+.. -> sum of natural number
- formula n*(n+1)/2
- Time complexity O(n^2)
- Space complexity O(1)
- Best case complexity -O(n) -> Array already sorted

### Selection sort
- Find the smaller value and move it to start of the array 
Approach 
- Create a min var, Consider the current element as smaller value and Compare the remaining elements in the array.
- If the element smaller than current element then update the min value as smaller value index
- Once find the smaller element index swap the value with current index
- iteration - n+(n-1)+(n-2)+.. -> sum of natural number
- formula n*(n+1)/2
- Time complexity O(n^2)
- Space complexity O(1)

### Insertion sort
- Pick the element place it in right position 
Approach 
- Break the array into 2 part one is sorted array and unsorted array
- First element is sorted array and remaining part unsorted array
- So start pick the one element from the unsorted array and place it in sorted array in right position
- Once find the right position update the value
- Time complexity O(n^2)
- Space complexity O(1)
- Best time complexity O(n)-> if the array is already sorted 
Note:
partially sorted array insertion sort is best algorithm

