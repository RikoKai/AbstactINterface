public class Cow implements Animal{

    @Override
    public void say() {
        System.out.println("mu mu");
    }

    @Override
    public int legsCount() {
        return Animal.max_legs;
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canRun() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
