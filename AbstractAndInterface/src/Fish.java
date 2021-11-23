public class Fish implements Animal {

    @Override
    public void say() {

    }

    @Override
    public int legsCount() {
        return Animal.legs;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canRun() {
        return false;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
