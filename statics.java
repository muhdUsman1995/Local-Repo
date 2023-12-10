class Sir{
    String name;
    static String  School;
}


public class statics { //used when you wnt to make something common ,memory is given one tie to static things unlike objects
    public static void main(String[] args) {
        Sir.School  = "fazaia"; //static things can be accessed directly
        Sir fullname = new Sir();
        fullname.name = "Muhammad Usman khalid";
        System.out.println(Sir.School);



    }
}
