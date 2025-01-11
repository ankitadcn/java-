import java.util.Arrays;

public class Selection_Sort {
  public static void main(String[] args) {
    int arr[] = { 4, 1, 2, 7, 9, 5 };
    int i = 0;
    while (i < arr.length - 1) {
      int smallest = i;
      int j = i + 1;
      while (j < arr.length) {
        if (arr[smallest] > arr[j]) {
          smallest = j;
        }
        System.out.println(Arrays.toString(arr));
        j++;
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;
      i++;
      System.out.println();
    }
    System.out.println(Arrays.toString(arr));
  }
}
