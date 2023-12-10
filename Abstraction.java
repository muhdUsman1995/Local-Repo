abstract class Animal{
    abstract void walk();
     //its just a concept or blue print ,you can not create object of abstract class...
    Animal() //This is constructor chaining ,when you create a constructor of derived class then ist
    // it run constructor of base class then it run constuctor of derived class
    {
        System.out.println("i ama constructor");
    }
}
class Horse extends Animal{

    Horse()
    {
        System.out.println("horse here !");
    }

    public void walk()
    {
        System.out.println("walks on 4 legs ");
    }
}
class Chicken extends Animal{
    public void walk()
    {
        System.out.println("walks on 2 legs");
    }

}


public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse(); //this is object of derived class
        horse.walk();

//        Animal animal = new Animal();
        //this show compile type error
//        animal.walk();

        
    }
}
