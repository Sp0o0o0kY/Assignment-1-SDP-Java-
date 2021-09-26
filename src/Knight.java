public class Knight extends Character{
    public Knight() {
        super(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Knight is for justice");
    }
}
