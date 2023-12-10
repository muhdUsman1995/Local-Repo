import java.util.Scanner;


    //declaring function
//    public static void printMYName(String name){
//        System.out.println(name);
//        return;
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String name = sc.next();
//
//        //calling function
//
//        printMYName(name);


//-----------------
//function to add sum

//    public static int calculateSum(int a , int b) {
//
//        int sum = a + b;
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter Numbers ");
//        int a = Sc.nextInt();
//        int b = Sc.nextInt();
//
//        int sum = calculateSum(a,b);
//        System.out.println("sum of twi numbers is " + sum);


//    ---product of two numbers
//    public static int calculateproduct(int a , int b) {
//
//        int product = a * b;
//        return product;
//    }
//
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter Numbers ");
//        int a = Sc.nextInt();
//        int b = Sc.nextInt();
//
//        System.out.println("product of two number is "+ calculateproduct(a,b));

//        int multiply = calculateproduct(a,b);
//        System.out.println("product of two numbers is " + multiply);

//    ---factorial of a number

//    public static void factorial(int n){
//
//        int fact = 1;
//
//        for (int i = n; i>=1; i--)
//        {
//            fact=fact * i;
//
//        }
//        System.out.println(fact);
//
//        return;
//    }
//
//    public static void main(String[] args) {
//        int n =5;
////        Scanner Sc = new Scanner(System.in);
////        int n = Sc.nextInt();
//
//        factorial(n);

//public class functions {

//    code to print average

//    public static int Printaverage(int a,int b,int c)
//    {
//        int sum = a+b+c;
//        int average = sum/3;
//        return average;
//
//    }
//
//    public static void main(String[] args) {
//        int a = 4;
//        int b = 6;
//        int c = 6;
//
//
//        System.out.println("average of number is " + Printaverage(a,b,c));
//    }
//------------------------------
//    code to print all code numbers from 1 to n

//    public static void Oddnumbers(int n){
//        int sum = 0;
//        for (int i =1; i<=n; i++)
//        {
//            if(i%2 == 1) {
//                sum = sum+ i;
//            }
//
//        }
//        System.out.println(sum);
//
////        retu
//
//    }
//
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.print("Enter the number ");
//        int n = Sc.nextInt();
//
//
//        Oddnumbers(n);
//
//
//    }
//    --------------------------------------

//    public static int greaterNumber(int x, int y)
//    {
//        if(x>y){
//            return x;
//        }
//        else {
//            return y;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("enter ist number ");
//        int x = Sc.nextInt();
//        System.out.println("enter 2nd number ");
//        int y = Sc.nextInt();
//
//
//    int isGreater = greaterNumber(x,y);
//        System.out.println("Greater number is " + isGreater);
//
//
//    }

//    public static double COF(double c){
//        double circumference = 2 * 3.14 * c;
//        return circumference;
//    }
//
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter the radius of circle ");
//        double c = Sc.nextDouble();
//
//        double isCircumference =  COF(c);
//        System.out.println("Circumference of circle is "  + isCircumference);
//}
//    ------------------------------

public class functions {
//    public static void main(String[] args) {
//        do {
//            System.out.println("my name is usman");
//        }while (true);
//
//    }
//    ......................
//    fibonacci series

//    public static void FSeries(int n) {
//
//        int firstTerm = 0, secondTerm = 1;
////        System.out.println("Fibonacci Series till " + n + " terms:");
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(firstTerm + ", ");
//
//            // compute the next term
//            int nextTerm = firstTerm + secondTerm; //0+1 = 1 so next term me 1 ha ab
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int n = Sc.nextInt();
//
//        FSeries(n);
//    }
//    public static void Factorial(int n) {
//        int fact = n;
//        int i = 1;
//        {
//            while (i < n) {
//
//                fact = fact * i;
//                i++;
//            }
//            System.out.println(fact);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int n = Sc.nextInt();
//
//        Factorial(n);

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the total number of rows: ");
        int rows = Sc.nextInt();

        System.out.println("Enter the total number of columns: ");
        int cols = Sc.nextInt();

        int[][] TwoD = new int[rows][cols];

        System.out.println("Enter the values in the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                TwoD[i][j] = Sc.nextInt();
            }
        }

        System.out.println("Enter the value to find (x): ");
        int x = Sc.nextInt();

        System.out.println("Finding x now:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (TwoD[i][j] == x) {
                    System.out.print("x found at location (" + i + ", " + j + ")");
                    // Add a newline after printing each location
                    System.out.println();
                }
            }
        }
    }
}



