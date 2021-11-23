public interface Animal {
   public static final int max_legs=4;
    int legs=0;
    abstract void say();
    int legsCount();
    boolean canSwim();
    boolean canRun();
    boolean canFly();
    static  int run(){
        return 51;
    }
    default String fun(){
        return "asads";
    }

}
