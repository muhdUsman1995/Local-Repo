import java.security.PublicKey;

class Teacher{
    String name;
    int age;

    //same name k functions ko ik e class me create krna is called method OVERLOADING , this code i an example of overloading

    public void TeacherDetails(String name)
        {
            System.out.println(name);

        }
    public void TeacherDetails(int age)
    {
        System.out.println(age);
    }
    public void TeacherDetails(int age , String name)
    {
        System.out.println(name + " " + age);
    }

}

public class polymorphism {
    public static void main(String[] args) {
        Teacher subject = new Teacher();
        subject.name = "physics";
        subject.TeacherDetails(29);


    }
}
