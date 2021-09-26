public class King extends Character{
    public King(){
        super(new KnifeBehavior());
    }

    @Override
    public void fight(){
        System.out.println("King leads to the victory!");
    }
}
