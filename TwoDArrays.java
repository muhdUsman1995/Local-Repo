import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("enter Total rows : ");
        int rows = Sc.nextInt();

        System.out.println("enter total columns");
        int cols = Sc.nextInt();

        int [][] TwoD = new int[rows][cols];

        System.out.println("enter the values in 2D array");

         for (int i = 0; i<rows; i++)
        {
            for (int j = 0; j<cols; j++)
            {
                 TwoD [i][j] = Sc.nextInt();
            }
        }
        System.out.println("find X now : ");

         int x = Sc.nextInt();

         for (int i = 0; i<rows; i++ )
         {
             for (int j=0; j<cols; j++)
             {
                 if (TwoD[i][j] == x)
                 {
                     System.out.print("x found at location (" + i +" ," + j +")");
                 }
                 System.out.println();
             }
         }


    }
}
