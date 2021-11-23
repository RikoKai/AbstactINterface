package AruzhanProject;

public class Main {
    public static void main(String[] args) {
        Avinosets av=new Avinosets("Furi korabil","500","military Attack ",150,50,true);
        System.out.println( av.speed());
        av.burylu();
        av.hashCode();
        av.stop();
        av.swim();
    }
}
