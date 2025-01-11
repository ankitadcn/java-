public class Insertion_Sort {
  public static void main(String[] args) {
    int arr[] = { 4, 2, 6, 5, 8, 9, 11, 1 };
    System.out.println(java.util.Arrays.toString(arr));
    int i = 1;
    while (i < arr.length) {
      int current = arr[i];
      int j = i - 1;
      while (j > 0 && current < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
      i++;
    }
    System.out.println(java.util.Arrays.toString(arr));
  }
}
