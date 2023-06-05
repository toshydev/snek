package click.snekhome.environment;

import asciiPanel.AsciiPanel;
import click.snekhome.characters.Item;
import click.snekhome.util.Tile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Room {
    public Tile[][] coordinatePlane;
    public int width = 79;
    public int height = 22;
    private List<Item> items;

    public Room() {
        items = new ArrayList<>();
        setCoordinatePlane(width, height);
        generateRandomRoomItems();
        populateCoordinatePlane();
    }

    private void generateRandomRoomItems() {
        for (int i = 0; i < 5; i++) {
            addItem(new Item((char)233, AsciiPanel.red));
        }
    }

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void populateCoordinatePlane() {
        //System.out.println("populating plane");
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                if (y < 2 || y > getHeight() - 3) {
                    coordinatePlane[x][y] = Tile.WALL;
                } else if (x < 2 || x > getWidth() - 3) {
                    coordinatePlane[x][y] = Tile.WALL;
                } else {
                    coordinatePlane[x][y] = Tile.GROUND;
                }
                for (Item item : items) {
                    if (item.posX == x && item.posY == y) {
                        coordinatePlane[x][y] = Tile.ITEM;
                    }
                }
            }
        }
        //System.out.println("Generated items: " + items.toString());
    }

    public void setCoordinatePlane(int w, int h) {
        this.coordinatePlane = new Tile[w][h];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Room testRoom = new Room();
        System.out.println(Arrays.deepToString(testRoom.coordinatePlane));
    }
}
