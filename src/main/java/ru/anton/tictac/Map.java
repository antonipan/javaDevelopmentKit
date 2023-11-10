package ru.anton.tictac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JPanel {
    private int panelWidth;
    private int panelHeight;
    private int cellWidth;
    private int cellHeight;


    Map () {
        setBackground(Color.darkGray);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }

    void startNemGame(int mod, int fsx, int fsy, int vLen) {
        System.out.println("there are already");
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render (Graphics g) {
        panelWidth = getWidth();
        panelHeight = getHeight();
        cellWidth = panelWidth / 3;
        cellHeight = panelHeight / 3;
        
        g.setColor(Color.BLACK);
        for (int w = 0; w < 3; w++) {
            int x = w * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }
        for (int h = 0; h < 3; h++) {
            int y = h*cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }

    }

    private void update (MouseEvent e) {
        repaint();
    }
}
