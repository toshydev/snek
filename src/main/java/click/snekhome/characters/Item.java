package click.snekhome.characters;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Item {
    public int posX;
    public int posY;
    private char glyph;
    private Color color;

    public Item(char glyph, Color color) {
        this.glyph = glyph;
        this.color = color;
        this.posX = ThreadLocalRandom.current().nextInt(2, 75-5);
        this.posY = ThreadLocalRandom.current().nextInt(2, 25-5);
    }
}
