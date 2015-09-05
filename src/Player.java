
public class Player extends GamePiece{

    int curHealth;
    int maxHealth;
    int mana;
    int experience;
    
    public Player() {
        maxHealth = 100;
        curHealth = 5;
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
    
    public int getLevel() {
        return (int) Math.floor(Math.log(experience)/Math.log(2));//log base 2
    }
    
    public void loseHealth(int x) {
        curHealth -= x;
    }
    
    public void fight(GamePiece g) {
        Monster enemy = (Monster) g;
        
    }
      //  return true;
    //}
}
