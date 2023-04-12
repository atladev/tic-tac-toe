package game;

import java.awt.Component;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Gui_Main_Menu extends javax.swing.JFrame {

    private game_engine engine;
    private Gui_game_play GamePlay;
    private boolean IsTwoPlayerGame;
    private boolean firsttime;

    /**
     * Creates new form 
     * @param player1
    
     */
    public Gui_Main_Menu(game_engine engine,Gui_game_play GamePlay) {
        initComponents();

        firsttime = true;
        this.engine = engine;
        this.GamePlay = GamePlay;
        this.IsTwoPlayerGame = false;
        setExtendedState(JFrame.MAXIMIZED_BOTH);



    }

    