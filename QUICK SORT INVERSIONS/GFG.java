import java.util.Arrays;
class A {

     static void Majority(int arr[], int n) {
        Arrays.sort(arr);
        int l=n/2;
        int c=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1])
                c++;
        }
        if (c == l)
            System.out.println("Majority Element" + arr[c]);
        else
        System.out.println("Not Present");
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;
        Majority(arr,n-1);

    }

}

