package util;

import java.awt.*;
import java.awt.event.InputEvent;

public class LimpaTela {

    public static void click() throws AWTException, InterruptedException {
        Robot bot = new Robot();
        bot.mouseMove(75, 950);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(0600);
    }
}