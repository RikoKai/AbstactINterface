package AruzhanProject;

public interface Korabl {

    void swim();
    void stop();
    void burylu();
    String speed();

    static String typeShip(){
        return "Military";
    }
    default int speedShip(int sped){
        return sped;
    }
}
