/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.GameScreen;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Expression Tamkien is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class GameController extends ButtonController {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    final int space = 5;
    final int buttonSize = screenSize.height/15;


    public Thread Elapse(GameScreen game) {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    if (game.isRunning()) {//if game is on, time runs
                        int time = game.getTime();
                        game.getLbTime().setText(++time + "");
                        game.setTime(time);
                    }
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println(e);
                    }
                }
            }
        };
        return t;
    }

    public List<Integer> randomNumber(int size) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        //for loop  from 1 to size * size to add number into array list
        for (int i = 1; i <= size * size; i++) {
            listNumber.add(i);
        }
        shuffle(size, listNumber);
        return listNumber;
    }

    public List<Integer> shuffle(int size, List<Integer> listNumber) {//shuffle the list untill playable
        do {
            Collections.shuffle(listNumber);
        } while (!isPlayable(size, listNumber));
        return listNumber;
    }

    public boolean isPlayable(int size, List<Integer> listNumber) {

        int count = 0;
        int empty = 0;
        int max = listNumber.size();

        for (int i = 0; i < max; i++) {
            // danh dau empty position
            if (listNumber.get(i) == max) {
                empty = i;
                continue;
            }
            //count so button > i
            for (int j = i + 1; j < max; j++) {
                if (listNumber.get(j) == max) {
                    continue;
                }
                if (listNumber.get(i) > listNumber.get(j)) {
                    count++;
                }
            }
        }
        // size le can count chan
        if (size % 2 == 1) {
            return count % 2 == 0;
        } else {
            // if size chan can row va count cung chan hoac le
            return ((empty / size + 1 - count) % 2 == 0);
        }
    }

    public void createGameArea(HashMap<Integer, JButton> listButton, GameScreen game) {
        int size = game.getEdge();
        ArrayList<Integer> listNumber = (ArrayList) randomNumber(size);//tao arlist mới
        game.getGameArea().removeAll();//xóa cái cũ
        game.getGameArea().setLayout(new GridLayout(size, size, space, space));//tạo layout
        //create buttons
        for (int i = 0; i < size * size; i++) {
            int num = listNumber.get(i);
            String label = "";
            if (num != size * size) {
                label = num + "";
            } else {
                game.setEmptyPosition(i);
            }
            JButton btn = new JButton(label);
            btn.setPreferredSize(new Dimension(buttonSize, buttonSize));//set button size
            addButtonAction(btn, listButton, game);//tao action cho button
            listButton.put(i, btn);//key tu 0 den het, value la cac buttons ngau nhien
            game.getGameArea().add(btn);
        }
        game.pack();
    }

    public void setSizeGameArea(GameScreen game) {//get size from the combobox
        String sizeString = game.getCbSize().getSelectedItem().toString();
        int num = Integer.parseInt(sizeString.substring(0, sizeString.lastIndexOf("x")));//get the actual size
        game.setEdge(num);
    }

    // Add action for btnNewGame and CbSize
    public void addAction(HashMap<Integer, JButton> listButton, GameScreen game) {
        game.getBtnNewGame().addActionListener((ActionEvent e) -> {
            if (game.isRunning()) {
                game.setRunning(false);//pause 
                int confirm = JOptionPane.showConfirmDialog(game, "Do you really want to start new game?",
                        "Confirm Dialog", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {//reset
                    newGame(listButton, game);
                }
            } else {//
                newGame(listButton, game);
            }
        });
        game.getCbSize().addActionListener((ActionEvent e) -> {
            setSizeGameArea(game);
        });
    }

    public void newGame(HashMap<Integer, JButton> listButton, GameScreen game) {
        game.setRunning(true);
        game.setTime(0);
        game.getLbTime().setText(game.getTime() + "");
        game.setMove(0);
        game.getLbCount().setText(Integer.toString(game.getMove()));
        createGameArea(listButton, game);
    }
}
