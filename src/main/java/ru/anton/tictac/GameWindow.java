package ru.anton.tictac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 500;
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;

    Map map;
    SettingsWindow settingsWindow;

    JButton startButton = new JButton("New Game");
    JButton exitButton = new JButton("Exit");

    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Tic-Tac-Game");
        setResizable(false);
        setLocationRelativeTo(null);


        map = new Map();
        settingsWindow = new SettingsWindow(this);

        JPanel jPanel = new JPanel(new GridLayout(1, 2));
        jPanel.add(startButton);
        jPanel.add(exitButton);
        add(jPanel, BorderLayout.SOUTH);
        add(map, BorderLayout.CENTER);
        setVisible(true);


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });
    }


    void startNewGame (int mode, int fsx, int fsy, int vLen) {
        map.startNemGame(mode, fsx, fsy, vLen);
    }
}
