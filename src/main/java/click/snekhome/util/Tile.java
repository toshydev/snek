package click.snekhome.util;

import asciiPanel.AsciiPanel;

import java.awt.*;

public enum Tile {
    WALL((char)178, AsciiPanel.blue),
    GROUND((char)255, AsciiPanel.brightBlack),
    ITEM((char)233, AsciiPanel.red),
    SNAKE((char)234, AsciiPanel.green);

    private Color color;
    char glyph;

    Tile(char glyph, Color color) {
        this.glyph = glyph;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public char getGlyph() {
        return glyph;
    }
}
