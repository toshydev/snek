package click.snekhome.engine;

import asciiPanel.AsciiPanel;

import javax.swing.*;
import java.awt.*;

public class Main  {

/*    public static void main(String[] args) {
        int counter = 0;
        Window f = new Window(null);
        AsciiPanel ap = new AsciiPanel();
        ap.writeCenter("Let's count...", 10);
        f.add(ap);
        f.pack();
        f.setVisible(true);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (counter < 101) {
            try {
                Thread.sleep(100);
                counter++;
                ap.writeCenter(Integer.toString(counter), 12);
                f.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ap.clear();
        ap.writeCenter("Done! - Goodbye...", 12);
    }
*/
    public static void main(String[] args) {
        Panel panel = new Panel();
        Panel panel2 = new Panel();
        AsciiPanel ap = new AsciiPanel();
        AsciiPanel ap2 = new AsciiPanel(12, 12);
        ap.writeCenter("Hello World!", 12);
        ap2.writeCenter("Hello there!", 5);
        panel.add(ap);
        panel.add(panel2);
        panel.setVisible(true);
        panel2.add(ap2);
        panel2.setVisible(true);
        Window w = new Window(null);
        w.add(panel);
        w.pack();
        w.setVisible(true);
    }
}
