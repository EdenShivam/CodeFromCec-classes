

class Sort {
   void Sort(int [] arr) {
       int temp ;
       int j ;
       int n = arr.length;
       for (int i = 1; i < n; i++) {
           temp = arr[i];
           j = i - 1;
           while (j >= 0 && arr[j] > temp) {
               arr[j + 1] = arr[j];
               j--;
           }
           arr[j + 1] = temp;
       }
   }

    void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

}
class Main{
    public static void main(String[] args)
    {

        int [] arr = {64, 34, 25, 12, 22, 11, 90};
        Sort ob = new Sort();
        ob.Sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
















