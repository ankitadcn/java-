import java.util.*;

class Custom_Sort1 {
  public static void main(String[] args) {
    int arr[] = { 6, 1, 2, 5, 7, 3 };
    int i = 0;
    while (i < arr.length - 1) {
      int j = 0;
      while (j < arr.length - i - 1) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
        j = j + 1;
        System.out.println(Arrays.toString(arr));
      }
      System.out.println();
      i = i + 1;
    }
  }
}
