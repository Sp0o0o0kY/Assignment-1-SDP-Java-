public class Troll extends Character{
    public Troll() {
        super(new AxeBehavior());
    }
    @Override
    public void fight() {
        System.out.println("Troll is not an ally");
    }
}
