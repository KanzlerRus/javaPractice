package net.kanzler.oop.mySwing.ex2;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

    private int counter = 0;

    public GUI() {
        setTitle("My First GUI");
        setBounds(500,500,1000,1000);
        setLayout(new FlowLayout(FlowLayout.LEFT, 50,50));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField();
        jTextField.setText("Counter is " + counter);

        JButton btnMinus = new JButton("Minus");
        btnMinus.addActionListener((el) -> jTextField.setText("Counter is " + --counter));

        JButton btnPlus = new JButton("Plus");
        btnPlus.addActionListener((el) -> jTextField.setText("Counter is " + ++counter));

        add(btnMinus);
        add(btnPlus);
        add(jTextField);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

}
