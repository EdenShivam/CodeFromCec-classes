
import java.util.*;
class Series
{
    static int fibo(int n)
    {
        if(n<=1)
            return n;
       return fibo(n-1)+fibo(n-2);
    }
}
class Main{
    // Driver method to test above
    public static void main(String []args)
    {
        Series ob = new Series();
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        System.out.println(ob.fibo(l));
    }
    }
