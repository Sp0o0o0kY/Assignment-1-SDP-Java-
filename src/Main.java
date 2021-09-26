public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");
        Knight knight = new Knight();
        knight.fight();
        knight.performWeapon();
        knight.setWeaponBehavior(new KnifeBehavior());
        knight.performWeapon();
        System.out.println("\n\n");

        Troll troll = new Troll();
        troll.fight();
        troll.performWeapon();
        troll.setWeaponBehavior(new BowAndArrowBehavior());
        troll.performWeapon();
        System.out.println("\n\n");

        Queen queen = new Queen();
        queen.fight();
        queen.performWeapon();
        queen.setWeaponBehavior(new AxeBehavior());
        queen.performWeapon();
        System.out.println("\n\n");

        King king = new King();
        king.fight();
        king.performWeapon();
        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.performWeapon();
    }
}
