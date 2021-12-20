package finalTerm;

import java.util.Arrays;

public class SortInsertion {

   public  String insert(int arr[]){
//    int arr[] = {8,4,23,42,16,15};
    for (int i=1 ; i< arr.length ; i++){
      int j= i-1;
      int temp = arr[i];
      while (j>=0 && arr[j]< temp) {
        arr[j+1]= arr[j];
        j=j-1;

      }
      arr[j+1]=temp ;
    }
    return Arrays.toString(arr);
  }


}
