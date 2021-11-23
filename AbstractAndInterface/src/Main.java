import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        Animal random=null;
        if(r.nextBoolean())
            random=new Fish();
        else random=new Cow();

        System.out.println("Animal:");
        System.out.print(random.canSwim()?"zhuzedy ":" zhuzbeidy");
        System.out.print(random.canFly()?" ushu":" ushpau");
        System.out.print(random.canRun()?" zhuru":" zhugyrmeidy");

    }
}
