public class Sum {
​
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
    for(int num: arr1) sum += num;
    for(int num: arr2) sum += num;
    return sum;
  }
​
}