package click.snekhome.graphics;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public class LoadingScreen implements Screen {
    GameScreen gameScreen;

    public LoadingScreen(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }

    public void displayInAP(AsciiPanel terminal) {
        terminal.writeCenter("Press ENTER to start", 12);
    }

    public Screen respondToUserInput(KeyEvent key) {
        System.out.println(key.getKeyCode());
        switch (key.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                return new GameScreen();
        }
        System.out.println("respond end");
        return this;
    }
}
