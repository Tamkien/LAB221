/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.GameScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Expression Tamkien is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class ButtonController {
    public void addButtonAction(JButton btn, HashMap<Integer, JButton> listButton, GameScreen game) {
        btn.addActionListener((ActionEvent e) -> {
            game.setRunning(true);
            String txt = btn.getText();
            if (swapable(txt, listButton, game)) {
                swap(listButton, game);
                updateCount(game);
                checkStatus(listButton, game);
            }
        });
    }

    public void removeButtonAction(HashMap<Integer, JButton> listButton) {
        for (Map.Entry<Integer, JButton> entry : listButton.entrySet()) {
            JButton value = entry.getValue();
            for (ActionListener e : value.getActionListeners()) {
                value.removeActionListener(e);
            }
        }
    }

    public void updateCount(GameScreen game) {
        int current = game.getMove();
        game.setMove(++current);
        game.getLbCount().setText(current + "");
    }

    public void swap(HashMap<Integer, JButton> listButton, GameScreen game) {
        int current = game.getCurentPosition();
        int empty = game.getEmptyPosition();
        String txt = listButton.get(current).getText();
        listButton.get(empty).setText(txt);
        listButton.get(current).setText("");
        game.setEmptyPosition(current);
    }

    public boolean swapable(String text, HashMap<Integer, JButton> listButton, GameScreen game) {
        return canDown(text, listButton, game) || canUp(text, listButton, game)
                || canRight(text, listButton, game) || canLeft(text, listButton, game);
    }

    public boolean canDown(String text, HashMap<Integer, JButton> listButton, GameScreen game) {
        int size = game.getEdge();
        int empty = game.getEmptyPosition();
        int position = empty - size;
        if (position >= 0) {
            String txt = listButton.get(position).getText();
            if (txt.equals(text)) {
                game.setCurentPosition(position);
                return true;
            }
        }
        return false;
    }

    public boolean canUp(String text, HashMap<Integer, JButton> listButton, GameScreen game) {
        int size = game.getEdge();
        int empty = game.getEmptyPosition();
        int position = empty + size;
        if (position < size * size) {
            String txt = listButton.get(position).getText();
            if (txt.equals(text)) {
                game.setCurentPosition(position);
                return true;
            }
        }
        return false;
    }

    public boolean canLeft(String text, HashMap<Integer, JButton> listButton, GameScreen game) {
        int size = game.getEdge();
        int empty = game.getEmptyPosition();
        int position = empty + 1;
        if (position % size != 0) {
            String txt = listButton.get(position).getText();
            if (txt.equals(text)) {
                game.setCurentPosition(position);
                return true;
            }
        }
        return false;
    }

    public boolean canRight(String text, HashMap<Integer, JButton> listButton, GameScreen game) {
        int size = game.getEdge();
        int empty = game.getEmptyPosition();
        int position = empty - 1;
        if (position >= 0 && position % size != size - 1) {
            String txt = listButton.get(position).getText();
            if (txt.equals(text)) {
                game.setCurentPosition(position);
                return true;
            }
        }
        return false;
    }

    public void checkStatus(HashMap<Integer, JButton> listButton, GameScreen game) {
        if (isWon(listButton)) {
            game.setRunning(false);
            JOptionPane.showMessageDialog(game, "LOL you won how nice", "Congratulation", 1);
            game.getLbTime().setText(Integer.toString(game.getTime()));
            removeButtonAction(listButton);
        }
    }

    public boolean isWon(HashMap<Integer, JButton> listButton) {
        for (Map.Entry<Integer, JButton> entry : listButton.entrySet()) {
            Integer key = entry.getKey();
            JButton value = entry.getValue();
            String txt = value.getText();
            if (!txt.equals("")) {
                int num = Integer.parseInt(txt);
                if (num - 1 != key) {
                    return false;
                }
            }
        }
        return true;
    }
}
