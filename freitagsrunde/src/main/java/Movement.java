import java.awt.*;
import java.util.Scanner;

public class Movement {

    public void bewegeSpieler(Point spielerPosition) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        if (input.equals("w")) {
            if (spielerPosition.y > 0)
                spielerPosition.y--;

        } else if (input.equals("s")) {
            if (spielerPosition.y < 9)
                spielerPosition.y++;

        } else if (input.equals("a")) {
            if (spielerPosition.x > 0)
                spielerPosition.x--;

        } else if (input.equals("d")) {
            if (spielerPosition.x < 39)
                spielerPosition.x++;
        }
    }

    public void bewegeSchlange(Point schlangePosition, Point spielerPosition) {
        if (spielerPosition.x < schlangePosition.x)
            schlangePosition.x--;
        else if (spielerPosition.x > schlangePosition.x)
            schlangePosition.x++;
        if (spielerPosition.y < schlangePosition.y)
            schlangePosition.y--;
        else if (spielerPosition.y > schlangePosition.y)
            schlangePosition.y++;
    }
}
