import java.util.Scanner;

public class breakCOntinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Press the button");
//        int buttons = sc.nextInt();

//
//        switch(buttons){
//            case 1:
//                System.out.println("hello");
//                break;
//            case 2:
//                System.out.println("namaste");
//                break;
//            case 3:
//                System.out.println("salam");
//                break;
//            default :
//                System.out.println("invalid button");
//
//        }

        System.out.println("lets calculate");

        int calculator = sc.nextInt();
        switch(calculator){
            case 1:
                System.out.println("add two numbers");
                int  a= 10;
                int b = 5;
                int sum = a+b;
                System.out.println("sum of two numbers is " +sum);
                break;
            case 2:
                System.out.println("Minus two numbers");
                int x = 4;
                int y = 5;
                int minus = y-x;
                System.out.println("minus numbers ka ha " + minus);
                break;
            default:
                System.out.println("invalid case");



        }
















    }
}
