import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
//        System.out.println("enter you age ");
//        Scanner sc = new Scanner(System.in);
//
//        int age  = sc.nextInt();
////enhanced switch
//        switch (age) {
//            case 18 -> System.out.println("you are going to become an adult ");
//            case 28 -> System.out.println("you are going to get a job very soon IA");
//            case 29 -> System.out.println("you are going to get married this year IA");
//            default -> System.out.println("enjoy you life bro ,have fun ,take care of your health");
//        }

//        int a  = 10;
//    if ( a == 11) {
//        System.out.println("i am 11");
//    }
//    else
//        {
//            System.out.println("i am not 11");
//        }

//Scanner sc  = new Scanner(System.in);
//        System.out.println("enter marks obtained in maths ");
//        int maths =  sc.nextInt();
//        System.out.println("enter marks obtained in physics ");
//        int physics = sc.nextInt();
//        System.out.println("enter marks obtained in urdu ");
//        int urdu = sc.nextInt();
//       float percentage = (float)(maths + physics + urdu) / 300 * 100;
//       System.out.println("your percentage is " + percentage);
//       if (percentage >= 40 && urdu>=33 && maths>=33 && physics >=33)
//       {
//           System.out.println("Congrats ! You passed your exam!");
//       }
//       else {
//           System.out.println(("you failed because your marks in one subject is less than 33 or overall percenage is less than 40!"));
//       }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter you income per month ");
//        float income = sc.nextFloat();
//
//        if (income <= 250)
//        {
//            System.out.println("you are free of tax");
//        } else if (income >250 && income <=500) {
//            float tax  = income * 0.05f;
//            System.out.println("you have to pay tax amount as  " +tax);
//
//        } else if (income >500 && income <=1000) {
//            float tax  = income * 0.2f;
//            System.out.println("you tax is " +tax);
//
//        }

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        System.out.println("enter the day ");


//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//        }
//        System.out.println("enter the day number");

//        System.out.println("Enter the year ");
//        int year  = sc.nextInt();
//        if (year % 4 == 0)
//        {
//            System.out.println("this is leap year");
//        }
//
//        else
//        {
//            System.out.println("This is not a leap year");
//        }

         ;
//        System.out.println("enter the type of website");
//         String website = sc.next();
//         if(website.endsWith(".org"))
//         {
//             System.out.println("its a orgnization website ");
//         } else if (website.endsWith(".com")) {
//             System.out.println("its a commercial website");
//
//         } else if (website.endsWith(".pk")) {
//             System.out.println("its a pakistani website");
//
//         }
        Scanner Sc = new Scanner((System.in));
        int button = Sc.nextInt();

        switch (button){
//            case 1:
//                System.out.println("print hello");
//                break;
//            case 2:
//                System.out.println("bonjour");
//                break;
//            case 3:
//                System.out.println("Namaste");
//                break;
//            default:
//                System.out.println("invalid button");

//            using enhanced switchStatement

                case 1 -> System.out.println("Hello there! ");

                case 2 -> System.out.println("Bonjour ");
                case 3 -> System.out.println("Namaste ");
                default -> System.out.println("invalid button");



        }



    }
}
