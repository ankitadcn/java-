import java.util.*;

class Demo {
  public static void main(String[] args) {
    int count = 0;
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
        count++;
      }
      System.out.println();
      i = i + 1;
    }
    System.out.println(count);
  }
}
