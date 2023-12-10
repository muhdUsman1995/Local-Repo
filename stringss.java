import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class stringss {
    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.print("enter your name : ");
//        String  name = Sc.nextLine();
//        System.out.println("you name is " + name);

        //concatenation
//        String firstname = " usman ";
//        String lastname = "khan";
//
//        String fullname = firstname + lastname;
//        System.out.println(fullname.length());


//comparing strigs

//        String name1 = "muhammad";
//        String name2 = "muhammad";

        //using .compareTo()
//        if (name1.compareTo(name2) == 0 )
//        {
//            System.out.println("strings are equal");
//        }
//        else {
//            System.out.println("string are not equal");
//    }
//        if (name1 == name2)
//        {
//            System.out.println("strings are equal");
//        }
//        else {
//            System.out.println("string are not equal");
//        }

        //string builder
//        StringBuilder sb = new StringBuilder("usman");
//        System.out.println(sb);
//
////char at index 0
//
//        System.out.println(sb.charAt(0));
//
//        //Setcharat --> replace the index with new ....
//
//
//        sb.setCharAt(0, 'p');
//        System.out.println(sb);
//
//        sb.insert(0,'s');
//        StringBuilder sb = new StringBuilder("Usman");
//        for (int i = 0 ; i<sb.length()/2; i++){
//
//            int front = i;
//            int back =(sb.length()-1) - i;
//
//            char frontchar = sb.charAt(front);
//            char backchar =  sb.charAt(back);
//
//            sb.setCharAt(front,backchar);
//            sb.setCharAt(back, frontchar);
//        }
//        System.out.println(sb);
//    }
        String Name = "My name is usman and i am a software test engineer!";
        System.out.println(Name.charAt(9));
        System.out.println(Name.length());
        System.out.println(Name.getBytes(StandardCharsets.UTF_8) );



    }

}
