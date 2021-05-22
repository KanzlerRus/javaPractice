package net.kanzler.oop.mySwing.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public static int counter = 0;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        setTitle("Test");
        setBounds(500,500,700,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton plus = new JButton("Start");
        JButton minus = new JButton("End");
        JLabel jLabel = new JLabel(String.valueOf(counter));
        Font font = new Font(Font.SERIF, Font.BOLD, 24);
        plus.setFont(font);
        minus.setFont(font);
        jLabel.setFont(font);
        add(plus, BorderLayout.EAST);
        add(minus,BorderLayout.WEST);
        add(jLabel,BorderLayout.CENTER);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(String.valueOf(++counter));
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(String.valueOf(--counter));
            }
        });

        setVisible(true);
    }
}
