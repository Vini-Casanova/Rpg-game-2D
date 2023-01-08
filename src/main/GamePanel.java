package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    //SCREEN SETTINGS
    final int originalTitleSize = 16; // in pixels 16 x 16
    final int scale = 3; // variable to scale sprites

    final int tileSize = originalTitleSize * scale; //
    final int maxScreenWidth = 16;
    final int maxScreenHeight = 12;

    final int ScreenHeight = maxScreenHeight * tileSize;

    final int ScreenWidth = maxScreenWidth * tileSize;

    public GamePanel() {

        this.setPreferredSize(new Dimension(ScreenWidth,ScreenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

    }
}
