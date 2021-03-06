package com.hdhelper.client.ui;

import com.hdhelper.agent.CNI;
import com.hdhelper.agent.event.VariableEvent;
import com.hdhelper.agent.event.VariableListener;
import com.hdhelper.agent.services.RSClient;
import com.hdhelper.agent.services.RSWidget;
import com.hdhelper.client.ClientNative;
import com.hdhelper.client.Main;
import com.hdhelper.client.api.Combat;
import com.hdhelper.client.api.action.ActionAdapter;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;

public class MainFrame extends JFrame {

    private static final int WIDTH = 781;
    private static final int HEIGHT = 563;

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

                setJMenuBar(new Bar());

                final Applet a = bootModClient();


                setContentPane(a);

                pack();

                setVisible(true);

               
            }
        });
    }

    void dump(RSWidget w) {
        if(w == null) return;
        if(w.getChildren() != null) {
            for(RSWidget c : w.getChildren()) {
                dump(c);
            }
        }


    }


    private static Applet bootModClient() {
        try {
            CNI cni = ClientNative.get();
            cni.initAndStartGame();
            RSClient c = cni.get();
            Main.client = c;
            return (Applet) c;
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return null;
    }



    private void build() {


    }

}



