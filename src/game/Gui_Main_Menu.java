/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author advance
 * github profile : https://github.com/Saurabh1999
 */
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        play_with_computer = new javax.swing.JButton(); //play with computer
        play_with_human = new javax.swing.JButton(); //play with other person
        GetSourceCode = new javax.swing.JButton(); 
        welcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(224, 187, 149));

        jPanel1.setBackground(new java.awt.Color(240, 242, 241));

        play_with_computer.setText("Play with computer"); //
        play_with_computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_with_computerActionPerformed(evt);
            }
        });

        play_with_human.setText("Play with Human");
        play_with_human.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_with_humanActionPerformed(evt);
            }
        });

        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(play_with_human, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(play_with_computer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GetSourceCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(play_with_computer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(play_with_human, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(GetSourceCode, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        welcome.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(233, 132, 132));
        welcome.setText("Welcome to Unbeatable TIC TAC TOE ");
        welcome.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(welcome)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void play_with_computerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_with_computerActionPerformed
        // TODO add your handling code here:
        
        SoundEffect.CLICK.play();
        engine.player1.set_name("COMPUTER");
        setVisible(false);
        GamePlay.setVisible(true);
        IsTwoPlayerGame = false;
        
        if(firsttime){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "1.Click on Start Game Button to play the Game\n" 
                                           + "2.Current Turn will be displyed at the top of the game window\n");
            firsttime = false;
        }
        
    }//GEN-LAST:event_play_with_computerActionPerformed

    private void play_with_humanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_with_humanActionPerformed
        // TODO add your handling code here:
        SoundEffect.CLICK.play();
        engine.player1.set_name("OPPONENT");
        this.setVisible(false);
        GamePlay.setVisible(true);
        IsTwoPlayerGame = true;
        if(firsttime){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "1.Click on Start Game Button to play the Game\n" 
                                           + "2.Current Turn will be displyed at the top of the game window\n");
            firsttime = false;
        }
    }//GEN-LAST:event_play_with_humanActionPerformed

    private void GetSourceCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetSourceCodeActionPerformed
        // TODO add your handling code here:
        SoundEffect.CLICK.play();
        if(Desktop.isDesktopSupported())
        {
            try {
                Desktop.getDesktop().browse(new URI("https://www.google.com"));
            } catch (IOException ex) {
                Logger.getLogger(Gui_Main_Menu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Gui_Main_Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_GetSourceCodeActionPerformed

    public boolean get_IsTwoPlayerGame(){
        return IsTwoPlayerGame;
        
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetSourceCode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton play_with_computer;
    private javax.swing.JButton play_with_human;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
