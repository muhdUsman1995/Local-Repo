

interface BigAnimal{
    public void walks();
}
interface herbivore{

}
class BigHorse implements BigAnimal , herbivore{ //multiple inheritance ,its done with the help of interfaces in java
    public void walks()
    {
        System.out.println("walks on 4 legs ");
    }

}

public class Interfacess {
    public static void main(String[] args) {
        BigHorse zebra = new BigHorse();
        zebra.walks();


    }
}
