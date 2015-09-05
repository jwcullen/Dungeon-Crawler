
public class Player extends GamePiece{

    int curHealth;
    int maxHealth;
    int mana;
    
    public Player() {
        maxHealth = 100;
        curHealth = 100;
        mana = 100;
    }
    public char getSymbol() {
        return 'P';
    }
    
    public int getHealth() {
        return curHealth;
    }
    
    public void drawHUD() {
        System.out.println("♥: " + curHealth + "/" + maxHealth);
        System.out.print(mana);
    }
    //public boolean isAlive() {
        //TODO do this for real;
      //  return true;
    //}
}
