package click.snekhome.graphics;

import asciiPanel.AsciiPanel;
import click.snekhome.characters.Snake;
import click.snekhome.environment.Room;
import click.snekhome.util.Tile;

import java.awt.event.KeyEvent;

public class GameScreen implements Screen {

    private int screenWidth = 79;
    private int screenHeight = 22;
    private Room room = new Room();
    private Snake snake = new Snake(3, 3, 12);

    public GameScreen() {
    }
    public void displayInAP(AsciiPanel ap) {
        ap.writeCenter("This is a test", 12);
        displayRoom(ap);
    }

    private void displayRoom(AsciiPanel ap) {
        for (int x = 0; x < screenWidth; x++) {
            for (int y = 0; y < screenHeight; y++) {
                if (snake.checkNodes(x, y)) {
                    ap.write(Tile.SNAKE.getGlyph(), x, y, Tile.SNAKE.getColor());
                } else {
                    ap.write(room.coordinatePlane[x][y].getGlyph(), x, y, room.coordinatePlane[x][y].getColor());
                }
            }
        }
    }

    public Screen respondToUserInput(KeyEvent key) {
        return this;
    }
}
