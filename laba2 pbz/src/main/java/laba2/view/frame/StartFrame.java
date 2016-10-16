package laba2.view.frame;


import laba2.enumeration.view.ConstForView;
import laba2.view.panel.StartPanel;

import javax.swing.*;
import java.awt.*;

public class StartFrame extends JFrame {

    public StartFrame(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle(ConstForView.MAIN_WINDOW);
        setSize(250, 250);
        setLocation(screenWidth / 4, screenHeight / 4);

        add(new StartPanel());

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
