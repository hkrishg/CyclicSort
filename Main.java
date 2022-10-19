import java.util.*;

class Main {
  // We are given an array containing ‘n’ objects. Each object, when created, was
  // assigned a unique number from 1 to ‘n’ based on their creation sequence. This
  // means that the object with sequence number ‘3’ was created just before the
  // object with sequence number ‘4’.

  // Write a function to sort the objects in-place on their creation sequence
  // number in
  // O
  // (
  // n
  // )
  // O(n) and without any extra space. For simplicity, let’s assume we are passed
  // an integer array containing only the sequence numbers, though each number is
  // actually an object.

  // Example 1:

  // Input: [3, 1, 5, 4, 2]
  // Output: [1, 2, 3, 4, 5]
  // Example 2:

  // Input: [2, 6, 4, 3, 1, 5]
  // Output: [1, 2, 3, 4, 5, 6]
  // Example 3:

  // Input: [1, 5, 6, 4, 3, 2]
  // Output: [1, 2, 3, 4, 5, 6]

  private static void sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int j = arr[i] - 1;
      if (arr[i] != arr[j]) {
        Main.swap(arr, i, j);
      } else {
        i++;
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  public static void main(String[] args) {
    int[] result = new int[] { 3, 1, 5, 4, 2 };
    Main.sort(result);
    System.out.println(Arrays.toString(result));
    int[] result2 = new int[] { 2, 6, 4, 3, 1, 5 };
    Main.sort(result2);
    System.out.println(Arrays.toString(result2));
  }
}