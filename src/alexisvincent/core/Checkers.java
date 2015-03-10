package alexisvincent.core;

import applicationFramework.core.Application;
import applicationFramework.ui.GUI;
import swing.components.AColor;
import swing.components.ASwopPane;

import javax.swing.*;
import java.awt.*;


/**
 * Main Application
 */
public class Checkers extends Application {

    static {
        INSTANCE = new Checkers();
    }

    private Checkers() {
        super();
    }

    public static Application getINSTANCE() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        getINSTANCE();
    }

    @Override
    protected void initGUI() {
        //Init Gui
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                gui = new GUI("Checkers").setDimensions(new Dimension(900, 600)).setGoodDefaults();
                gui.getFrame().setContentPane(new ApplicationPane());
                gui.show();
            }
        });
    }

    /**
     * Application GUI Containing A Menu and the Sorting Image
     */
    private class ApplicationPane extends ASwopPane {

        public ApplicationPane() {
            super();
            setName("ApplicationPane");
            setBackground(AColor.DarkGreen);

            setLayout(new GridBagLayout());

        }
    }
}
