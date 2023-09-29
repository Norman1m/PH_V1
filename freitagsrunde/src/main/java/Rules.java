import java.awt.*;

public class Rules {

    public Game game;


    public Rules(Game game) {
        this.game = game;
    }

    public boolean goldfound(Point spielerPosition, Point goldPostition, boolean weiter) {

        boolean goldEingesammelt;
        goldEingesammelt = false;

        if (spielerPosition.equals(game.goldPosition)) {
            game.goldPosition = new Point(-1, -1);

        }

        return true;
    }


    public boolean checkwin(boolean weiter, boolean goldEingesammelt) {
        if (game.spielerPosition.equals(game.tuerPosition) && goldEingesammelt) {


            System.out.println("Congratulations!!!");
        }
        return true;
    }


    public boolean checkloose(boolean weiter) {
        if (game.schlangePosition.equals(game.spielerPosition)) {


            System.out.println("You lose....");

        }
        return true;
    }
}