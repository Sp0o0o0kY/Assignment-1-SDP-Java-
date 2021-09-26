public class Queen extends Character{
    public Queen() {
        super(new BowAndArrowBehavior());
    }
    @Override
    public void fight() {
        System.out.println("Queen is a Archer ");
    }
}

