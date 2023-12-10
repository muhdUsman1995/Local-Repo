import bank.Bank;
import java.util.*;

class cricket{

    //single level inheritance
    String Worldcup;
    String Triseries;
    String BieteralSeries;
    String championsTrophy;
    String TestChampionship;

    public void letsPlay()
    {
        System.out.println("let play cricket ! ");
    }

    public void friendly() {
    }
}
class T20 extends cricket{
    public void friendly()
    {
        System.out.println("pakistan will take on india today for a t20 match");
        System.out.println(this.Triseries);
    }

}
//multilevel inheritance

class TestCricket extends T20{
    public void classic()
    {
        System.out.println("its pak vs india t20 series ");
    }

}


public class Inheritance {
    public static void main(String[] args) {
//        cricket Matches = new cricket();
//        Matches.Triseries = "pak vs India";
        T20 game = new T20();
        game.Triseries = "pak vs india triseries";

        TestCricket season = new TestCricket();
        season.classic();

        bank.Account account1 = new bank.Account();
        account1.name = "customer";




        game.friendly();



    }
}
