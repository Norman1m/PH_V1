import java.awt.*;

public class Game {
    public Point spielerPosition;
    public Point schlangePosition;
    public Point goldPosition;
    public Point tuerPosition;

    public Game(Point spielerPosition, Point schlangePosition, Point goldPosition, Point tuerPosition) { // Konstruktor, übergibt Daten. Variable die im Objekt übergeben wird
        this.spielerPosition = spielerPosition;                                                          // GameObjekte benötigen diese Daten, für eine Vervollständigung
        this.schlangePosition = schlangePosition;
        this.goldPosition = goldPosition;
        this.tuerPosition = tuerPosition;
    }


    public void draw() { // Methode die sich Werte von dem Game Objekt zieht. // Methode void gibt nichts zurück, führt nur aus
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 40; x++) {
                Point p = new Point(x, y);
                if (p.equals(spielerPosition))
                    System.out.print("P");
                else if (p.equals(schlangePosition))
                    System.out.print("S");
                else if (p.equals(goldPosition))
                    System.out.print("G");
                else if (p.equals(tuerPosition))
                    System.out.print("T");
                else System.out.print(".");
            }
            System.out.println();
        }
    }
}
