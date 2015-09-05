public class Rat extends Monster {

    public Rat() {
        health = 6;
        damage = 1;
        hitChance = .5;
        experience = 1;
    }

    public char getSymbol() {
        return 'r';
    }
}
