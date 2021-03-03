

import java.util.Arrays;

class A {
    static int medium(int[] arr) {
        int s=0,s1=0;
        int l = arr.length;
        if (l % 2 == 0) {
            s = l / 2;
            return s;
        } else {
            s1 =(int) Math.ceil((l/2 + (l/2 + 1)) / 2);
            return s1+1;
        }
    }
}
class Main {
        public static void main(String[] args) {

            int[] arr = {13, 7, 6, 45, 21};

            Arrays.sort(arr);
            int k = A.medium(arr);
            System.out.println(k);

        }
    }
