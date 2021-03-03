
class A {

     static void FibonacciExample() {
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;
         int sum=0;
         System.out.print("Fibonacci Series of "+maxNumber +" numbers:");

            for(int i = 1;i <=maxNumber; ++i)

        {
            System.out.print(previousNumber + " ");
             sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

        }  System.out.println();
            System.out.println(sum+" ");
    }
}
class Main {
    public static void main(String[] args) {

        A.FibonacciExample();
    }
}