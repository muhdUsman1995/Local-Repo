import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//     int i  = 1;
//     while(i<=3)
//     {
//         System.out.println(i);
//         i ++;
//     }
//        System.out.println("finish running while loop!");
//    }

//        int x = 1;
//        while(x<=10)
//        {
//            System.out.println(x);
//            x++;
//        }
//        System.out.println("print 10 numbers from 1 to 10");

//        int i = 1;
//        int fact = 5;
//        while ( i<5)
//        {
//
//            fact = fact *i;
//            i++;
//
//            System.out.println("factorial of a number is  " + fact);
//        Scanner sc = new Scanner(System.in);
//        ------------------------------------?????????
        // Get user input for the number
//        System.out.print("Enter a number to reverse: ");
//        int number = scanner.nextInt();
//
//        // Reverse the number using a while loop
//        int reversedNumber = 0;
//        while (number > 0) {
//            int lastDigit = number % 10;
//            reversedNumber = reversedNumber * 10 + lastDigit;
//            number /= 10;
//        }
//
//        // Display the reversed number
//        System.out.println("The reversed number is: " + reversedNumber);
//
//
//        }

//DO while
//        Scanner sc   = new Scanner (System.in);
//        int x = 10;
//        do{
//            System.out.println(x);
//            x++;
//        }
//        while(x < 5);

//      For Loop
//        for (int i =1; i<10; i++){
//            System.out.println(i);
//        }

//        for (int n = 10; n>=1 ; n--){
//            System.out.println(n);

//        int sumofsquare = 0;
//            for (int i = 1; i<5;  i++)
//            {
//                int square = i*i;
//                sumofsquare = sumofsquare + square;
//            }
//        System.out.println("sum of square is " +sumofsquare );
//      int   int n = 5;
//        int sumOfSquares = 0;
//
//        for (int i = 1; i < n; i++) {
//            int square = i * i;
//            sumOfSquares += square;
//        }
//
//        System.out.println("Sum of the squares from 1 to " + n + " is: " + sumOfSquares);

//        for (int counter  = 0; counter<3 ; counter++)
//        {
//            System.out.println("Hello dear");
//        }
//
//        int i =10;
//        for (int j = 0; j<i ; j++)
//        {
//            System.out.println(j);
//        }
//int  i = 0;
//while(i<10)
//{
//    System.out.println(i);
//    i++;
//}

//int  j =5;
//do{
//    System.out.println(j);
//    j++;
//}while (j<10);
//        Scanner Sc = new Scanner(System.in);
//        int n = Sc.nextInt();

//        int sum =0;
//        for (int i =1; i<n ;i++)
//        {
//           sum = sum+i;
//
//        }
//        System.out.println("sum of natural number  is " + sum);
//
//    }}
//        -----------------------

//pattern questions

// for (int i = 1; i <= 4; i++)
// {
//     for (int j=1; j<=5; j++)
//            {
//                System.out.print("*");
//            }
//     System.out.println("*");    ;
//
//        }
//        --------------------

        //hollow rectangle

//        int n = 4;
//        int m = 5;
//
//        for (int i =1; i<=n;i++)
//        {
//            for(int j= 1; j<=m; j++)
//            {
//                if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//--------------------
//        half Paramid

//        for(int i =4; i>=1; i--)
//        {
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=4;
//        for (int i =1; i<=n; i++)
//        {
//            for (int j = 1; j<=n-i; j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        ---------------

//        numbers pattern
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        ------------------
//inverted half
//int n =5;
//for(int i=1; i<=n; i++){
//    for(int j=1 ; j<=n-i+1; j++)
//    {
//        System.out.print(j);
//
//}
//    System.out.println();
//
//    }}
//---------------------
//        floyd's triangle'

//        int n =5;
//        int number = 1;
//        for(int i =1; i<=n; i++)
//        {
//            for (int j=1; j<=i; j++){
//                System.out.print(number + " ");
//                number = number+1;
////                number = number +2; This will print floyd's triangle in odd number like 1 3 5 7 9...
//            }
//            System.out.println();
//        }
//        ---------------
//        int n =5;
////        int number = 1;
////        for(int i =2; i<=n; i++)
////        {
////            for (int j=2; j<=i; j++){
////                System.out.print(number + " ");
////                number = number% 2;
//////                number = number +2; This will print floyd's triangle in odd number like 1 3 5 7 9...
////            }
////            System.out.println();
////        }

//        ---------------

//        int n =5;
//        for (int i =1; i<=n; i++)
//        {
//            for(int j =1; j<=i; j++)
//            {
//                int sum = i + j;
//
//                if (sum % 2 ==0)
//                {
//                    System.out.print("1 ");
//                }
//                else {
//                    System.out.print("0 ");
//                }
//
//            }
//            System.out.println();
//        }

//-------------------
        //butterfly code example pattern

//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            //spaces
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//
//            }
//            //2nd part
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        //lower part
//
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            //spaces
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//
//            }
//            //2nd part
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }}
//        ----------------------------

//        int n = 5;
//        for(int i =1; i<=n; i++)
//        {
//            for (int j=1; j<=n-i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int j=1; j<=n; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        ----------------------------

//        holow rhombys

//        int n = 5;
//        int m = 9;
//// Outer loop for rows (controls the height of the rhombus)
//        for (int i = 1; i <= n; i++) {
//            // Inner loop 1: prints leading spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // Inner loop 2: prints '*' for the rhombus shape
//            for (int j = 1; j <= m; j++) {
//                // Condition to determine whether to print '*' or ' '
//                if (i == 1 || i == n || j == 1 || j == m) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //Diamond stars
        int n = 4;
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i=n; i>=1; i--)
        {
            for (int j =1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    }