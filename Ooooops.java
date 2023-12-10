//class Pen{
//    String color;
//    String type;
//
//    public  void write()
//    {
//        System.out.println("writing something !");
//    }
//    public  void printcolor()
//    {
//        System.out.println(this.color = color);
//    }
//}
class Student{
    String name;
    int age;

    public void info()
    {
        System.out.println(this.age);
        System.out.println(this.name);
    }
//    Student()
//    {
//        this.name = name;
//        this.age = age;
//    }
    Student( )
    {
//        this.age = sportsman.age;
//        this.name = sportsman.name;
    }
    Student(Student race)
    {
        this.age = race.age;
        this.name = race.name;

    }



}
public class Ooooops {
    public static void main(String[] args) {
        Student Male = new Student();
        Male.name = "khalid ";
        Male.age = 57;

//        Student sportsman = new Student(Male);
        Student race = new Student(Male);
        race.info();

//        Male.name = "Usman khalid";
//        Male.age = 27;


//        sportsman.info();

//        Pen ballpoint = new Pen();
//        ballpoint.color = "black ";
//        ballpoint.type = "gell pen ";
//
//        Pen inkpen = new Pen();
//        inkpen.color = "blue";
//
//        inkpen.printcolor();
//        ballpoint.printcolor();
//
//        ballpoint.write();
//    }
    }
}

