package javaone.lesson_seven.online.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class initWindow extends JFrame{

    private static final int WIN_WIDTH = 100;
    private static final int WIN_HEIGHT = 100;
    private  MydrawingPanel  MydrawingPanel;

    // private MydrawingPanel MydrawingPanel;


    initWindow() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEST");
        //setBounds(WIN_POSX, WIN_POSY, WIN_WIDTH, WIN_HEIGHT);
        //setResizable(false);
// Создание меню
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("Главная");
        JMenuItem open = new JMenuItem("Создать сетку");
        JMenuItem exit = new JMenuItem("Выход");

        file.add(open);
        file.add(exit);
        jMenuBar.add(file, BorderLayout.SOUTH);

        setJMenuBar(jMenuBar);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setVisible(true);

        MydrawingPanel = new MydrawingPanel();

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("open");
                MydrawingPanel.setVisible(true);
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        }

    }



