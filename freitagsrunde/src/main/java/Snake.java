import java.awt.*;
import java.util.Scanner;
import java.util.Random;


public class Snake {

    public void play() { // Methode

        Movement movement = new Movement();
        Random random = new Random();
        Point point = new Point();
        Scanner scan = new Scanner(System.in);

        Point spielerPosition = new Point(39, 9);

        Point schlangePosition = new Point(0, 0);

        int px = random.nextInt(40);
        int py = random.nextInt(10);
        Point goldPosition = new Point(px, py);

        px = random.nextInt(40);
        py = random.nextInt(10);
        Point tuerPosition = new Point(px, py);


        Game game = new Game(spielerPosition, schlangePosition, goldPosition, tuerPosition);
        Rules rules = new Rules(game);
        boolean weiter = true;

        while (weiter) {

            game.draw();

            movement.bewegeSpieler(spielerPosition);
            movement.bewegeSchlange(schlangePosition, spielerPosition);

            rules.goldfound(spielerPosition, goldPosition, weiter);
            if (rules.checkwin(weiter, rules.goldfound(spielerPosition, goldPosition, weiter))) {
                weiter = false;
            }
            if (rules.checkloose(weiter)) {
                weiter = false;
            }
        }
    }


}
