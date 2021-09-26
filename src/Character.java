public abstract class Character {
    private WeaponBehavior weaponBehavior;
    public Character(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon(){
        this.weaponBehavior.UseWeapon();
    }

    public abstract void fight();

    public WeaponBehavior getWeaponBehavior(){
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
}
