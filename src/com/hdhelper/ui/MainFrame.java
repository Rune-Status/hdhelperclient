package com.hdhelper.ui;

import com.hdhelper.Context;
import com.hdhelper.Main;
import com.hdhelper.peer.RSClient;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private static final int WIDTH = 765 + 4;
    private static final int HEIGHT = 545 + 4;

    public MainFrame() {
        super("HD Helper");
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width / 2) - (WIDTH / 2), (dim.height / 2) - (HEIGHT / 2));
    }


    public void start() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                Context c = null;

                try {
                    c = Context.create();
                    Main.client = (RSClient) c.applet;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(-1);
                }

                setContentPane(c.applet);

                pack();
                revalidate();
                setVisible(true);

            }
        });
    }

}



