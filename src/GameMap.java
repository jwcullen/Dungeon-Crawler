
public class GameMap {

    GamePiece[][] pieces;
    int rows;
    int cols;
    int playerR, playerC;
    Player player;
    public GameMap(int m, int n) {
        rows = m;
        cols = n;
        pieces = new GamePiece[m][n];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                pieces[i][j] = new Nothing();
            }
        }
        for(int i = 0; i < n; i++) {
          pieces[0][i] = new Wall();
          pieces[m-1][i] = new Wall();
        }
        for(int i = 0; i < m; i++) {
            pieces[i][0] = new Wall();
            pieces[i][n-1] = new Wall();
          }
    }
    
    public void addPlayer(int m, int n) {
        playerR = m;
        playerC = n;
        player = new Player();
        System.out.println("Player added" + player.getHealth());
        pieces[m][n] = player;
    }
    
    public void drawMap() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                try {
                System.out.print(pieces[i][j].getSymbol());
                } catch(NullPointerException ex) { 
                System.out.println(".");
                }
            }
            System.out.print("\n");
        }
        player.drawHUD();//replace with player var
    }
    
    public boolean isOver() {
        //TODO write this
        return false;
    }
    
    public boolean movePlayer(int up, int right) {
        if(pieces[playerR+up][playerC+right] instanceof Nothing) {
            //System.out.println("Player moved");
            pieces[playerR+up][playerC+right] = player;//replace with player var
            pieces[playerR][playerC] = new Nothing();
            playerR = playerR + up;
            playerC = playerC + right;
            
            return true;
        }
        return false;


    }
    
    //public find
    
    
}
