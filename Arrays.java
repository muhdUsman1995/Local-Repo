import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int [] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 67;
//        marks[2] = 88;
//
////        System.out.println(marks[0]);
//        for(int i =0; i<=2; i++)
//        {
//            System.out.println(marks[i]);
//        }

//        int numbers[] = {22,33,44,55,66};
////        System.out.println(numbers[0]);
//
//        for(int i=0; i<5; i++)
//        {
//            System.out.println(numbers[i]);
//        }
//        Scanner Sc = new Scanner(System.in);
//        int size = Sc.nextInt();
//
//        int[] numbers = new int[size];//array initializing
//
//        //input
//        for(int i =0; i<size; i++)
//        {
//            numbers[i] = Sc.nextInt();
//        }
//
//        //output
//
//        for (int i =0; i<size; i++)
//        {
//            System.out.println(numbers[i]);
//        }
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter the size of array ");
//        int size = Sc.nextInt();
//
//        int [] numbers = new int[size];
//
//        System.out.println("Now put the values in array ");
//
//        for (int i = 0; i<size; i++)
//        {
//            numbers[i] = Sc.nextInt();
//        }
//        System.out.println("Now look for x here and enter a value from array which you are looking for "); //performing linear search
//
//        int x = Sc.nextInt();
//
//        for(int i =0; i<size; i++)
//        {
//            if(numbers[i] == x )
//            {
//                System.out.println("x is found at index :  " + i);
//            }
//        }

        for (int i = 0; i<=10; i++)//rows means 10 rows tak jayega
        {
//            System.out.println("value of i is " + i);
            for (int j=0; j<=5; j++) //columns i<=5 means 5 column hongay
            {
                System.out.print(   j  );
            }
            System.out.println();
        }
    }
}
