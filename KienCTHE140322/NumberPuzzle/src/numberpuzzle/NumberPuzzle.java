/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpuzzle;

import GUI.GameScreen;
import Controller.*;
import java.util.HashMap;
import javax.swing.JButton;

/**
 *
 * @author tamkien
 */
public class NumberPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameScreen game = new GameScreen();
        game.setVisible(true);
        game.setResizable(false);
        HashMap<Integer, JButton> listButton = new HashMap<>();
        GameController gc = new GameController();
        Thread t = gc.Elapse(game);
        t.start();
        gc.addAction(listButton, game);
        gc.createGameArea(listButton, game);
        ButtonController bc = new ButtonController();
        bc.removeButtonAction(listButton);//not allow playing at start
    }

}
