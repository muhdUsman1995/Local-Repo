import java.util.Scanner;

public class recursion {

//    printing numbers from 5 to 1

//    public static void printNumbers(int n)
//    {
//        if (n ==0 ) //when value is matched so it returns nothing
//        {
//            return;
//        }
//        System.out.println(n);//printing a value of n
//        printNumbers(n-1); //calling itself
//    }
//
//    public static void main(String[] args) {
//        Scanner Sc  = new Scanner(System.in);
//        System.out.print("Enter a number ");
//
//        int n = Sc.nextInt();
//        //calling a function
//        printNumbers(n);
//    }


    //print numbers from 1 to 5
//    public static void Numbers(int n)
//    {
//        if (n == 10)
//            {
//                System.out.println("This is a base case ,loop will terminate here");
//            return;
//        }
//        System.out.println(n);
//        Numbers(n+1 );
//    }
//
//    public static void main(String[] args) {
//        int n = 1;
//        Numbers(n);
//
//    }

//    sum of natural numbers
//    public static void printSum( int i , int n , int sum){
//        if (i == n )
//        {
//            sum = sum + i;
//            System.out.println(sum);
//            return;
//        }
//
//        sum = sum + i;
//        printSum(i + 1  , n , sum);
//
//    }
//
//    public static void main(String[] args) {
////        int y = 20;
//        System.out.println("sum of natural numbers is ");
//        printSum(1,5,0);
//    }
//factorial of a number
//    public static int factorial(int n ) {
//
//        if (n == 1 || n==0) //base case
//        {
//            return 1;
//        }
////       int fact = n * factorial(n-1);
////        System.out.println(fact);
////        return  fact;
////        return n * factorial(n-1);
//
//        int fact1 = factorial(n-1);
//        int fact2 = n * fact1;
//        return  fact2;
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println("the value of factorial is " + factorial(n));
//    }
    public static void fibonacci(int a, int b, int n)
    {
        if (n == 0)
        {
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibonacci(a, b, n-2);
    }

}
