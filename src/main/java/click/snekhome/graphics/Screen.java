package click.snekhome.graphics;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public interface Screen {
    void displayInAP(AsciiPanel ap);
    Screen respondToUserInput(KeyEvent key);
}
