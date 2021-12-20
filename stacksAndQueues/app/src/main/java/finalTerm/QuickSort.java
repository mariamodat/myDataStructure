package finalTerm;

import java.util.Arrays;

public class QuickSort {

  int[] arr = {8,4,23,42,16,15};
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int partition(int[] arr, int left, int right) {


    int pivot = arr[right];

    int low = (left - 1);

    for (int i = left; i <= right - 1; i++) {

      if (arr[i] < pivot) {
        low++;
        swap(arr, low, i);
      }
    }
    swap(arr, low + 1, right);
    return (low + 1);
  }

  public static void quickSort(int[] arr, int left, int right) {
    if (left < right) {

      int position = partition(arr, left, right);

      quickSort(arr, left, position - 1);
      quickSort(arr, position + 1, right);
    }
  }
}



