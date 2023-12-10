import java.util.*;
public class Sorting {
    public static void bubble(int numbers[])
    {
        for (int i =0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] args) {

        //        Bubble Sort  & Insertion Sort & Selection Sort
        int  numbers [] =  {7,8,3,1,2};

        for (int i = 0; i<numbers.length - 1; i++)
        {
            for (int j = 0 ; j< numbers.length-i -  1 ; j++)
            {
                if (numbers[j] > numbers [j+1]) {
//                    swappping
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                }
            }
        }

bubble(numbers);

    }
}
