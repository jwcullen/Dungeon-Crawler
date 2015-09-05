import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GameMap map = new GameMap(25, 50);
        Scanner sc = new Scanner(System.in);
        map.addPlayer(12, 25);
        map.drawMap();
        //map.drawHUD();
        
        while (!map.isOver()) {
            String cmd = sc.nextLine();

            if (cmd.equals("w")) {
                map.movePlayer(-1, 0);
            }

            if (cmd.equals("s")) {
                map.movePlayer(1, 0);
            }

            if (cmd.equals("d")) {
                map.movePlayer(0, 1);
            }

            if (cmd.equals("a")) {
                map.movePlayer(0, -1);
            }
            
            map.drawMap();
            
            if(cmd.equals("quit")) {
                break;
            }
        }

    }

}
