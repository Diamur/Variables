import devcat.Animals;
import devcat.Cat;
import devcat.Sportsman;
import devpeaple.Peaple;
import impl.DriverBus;
import impl.Transport;

public class Main {
    static Cat cat ;
    static Peaple peaple ;

    public static void main(String[] args){

//        cat = new Cat(2,"Персидский", "Гарфилд");
//        peaple = new Peaple("Дмитрий","Неелов",40,cat);
//        peaple.getCat().setName("Хрюня");
//
//        System.out.println(peaple);
//        cat.say();
//        peaple.getCat().say();
//
//        Sportsman sportsmen = new Sportsman("Ива","Иванов",35,null);
//        sportsmen.setTypeSport("Тенис");
//        sportsmen.getTypeSport();
//
//        peaple.sayHello();
//        sportsmen.sayHello();

        DriverBus t = new DriverBus();
        System.out.println(t.getSpeed());
        t.setCategory("B");
        t.go();
    }

}
