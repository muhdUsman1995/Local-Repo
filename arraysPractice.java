import java.util.Scanner;

public class arraysPractice {
//    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("enter the number of users ");
//
//        int users = Sc.nextInt();
//        String []names = new String[users];
//        //input
//
//        for (int i = 0; i<users; i++)
//        {
//            names[i] = Sc.nextLine();
//        }
//
//        //output
//
//        for (int i = 0; i<users; i++)
//        {
//            System.out.println(names[i]);
//        }
//
//    }
//public static void main(String[] args) {
//    Scanner Sc = new Scanner((System.in));
//    System.out.println("Enter size of array ");
//
//    int numbs = Sc.nextInt();
//
//    int numberCheck [] = new int[numbs];
//
//    System.out.println("Enter values in the array ");
//
//    for (int i =0; i<numbs; i++){
//        numberCheck[i]= Sc.nextInt();
//
//    }
//
//    for (int i = 0; i<numbs; i++)
//    {
//        System.out.println(numberCheck[i]);
//    }
//
//    int min =  Integer.MAX_VALUE;
//    int max  = Integer.MIN_VALUE;
//
//    for (int i=0; i<numbs; i++)
//    {
//        if(numberCheck[i] > max)
//        {
//            max = numberCheck[i];
//        }
//        if (numberCheck[i] < min)
//        {
//            min = numberCheck[i];
//        }
//    }
//    System.out.println("Largest number from the array  is "+ max);
//    System.out.println("Smallest number from the array is " + min);

//    Two dimensional array

    public static void main(String[] args) {

        Scanner Sc  = new Scanner(System.in);
        System.out.print("Enter rows ");
        int rows = Sc.nextInt();
        System.out.print("Enter columns ");
        int cols = Sc.nextInt();

        int[][] numbers = new int[rows][cols];


        System.out.println("put values in array Now ");

        //input
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = Sc.nextInt();
            }
        }

        //output

        for (int i =0; i<rows; i++)
        {
            for (int j =0; j<cols; j++)
            {

                System.out.print(numbers[i][j] + "  " );
            }
            System.out.println();
        }

    }













}
