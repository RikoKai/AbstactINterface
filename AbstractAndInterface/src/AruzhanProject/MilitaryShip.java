package AruzhanProject;

public abstract class MilitaryShip implements Korabl {
 private   String name,
     vmestimost,
    type;
  private   int speed,
    gunCount;
    boolean typeShipAttack=true;

    public MilitaryShip(String name, String vmestimost, String type, int speed, int gunCount, boolean typeShipAttack) {
        this.name = name;
        this.vmestimost = vmestimost;
        this.type = type;
        this.speed = speed;
        this.gunCount = gunCount;
        this.typeShipAttack = typeShipAttack;
    }

    abstract int dalnostRaket(int dalnost);

    public String getName() {
        return name;
    }
}
