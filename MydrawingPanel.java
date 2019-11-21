package javaone.lesson_seven.online.homework;

import javax.swing.*;
import java.awt.*;

public class MydrawingPanel extends JPanel {

    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_HEIGHT = 300;
    private static final int FIELD_SIZE_X = 3;
    private static final int FIELD_SIZE_Y = 3;
    private  initWindow initWindow;

      MydrawingPanel(initWindow initWindow){
        this.initWindow = initWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        initWindow.setResizable(false);
        initWindow.setTitle("Игровое поле");

    }

    public MydrawingPanel() {

    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        int x1;
        int x2;
        int y1;
        int y2;
        int delta;

        // вертикаль
        delta =  WINDOW_WIDTH /FIELD_SIZE_X ;
        for (int i =1; i < FIELD_SIZE_X; i++){
            x1= delta*i;
            x2 = x1+delta;
            g.drawLine(x1,0,x2,WINDOW_HEIGHT);
        }
        //горизонталь
        delta =  WINDOW_HEIGHT /FIELD_SIZE_Y ;
        for (int i =1; i < FIELD_SIZE_Y; i++){
            y1= delta*i;
            y2 = y1+delta;
            g.drawLine(0,y1,WINDOW_WIDTH,y2);
        }

    }
}
