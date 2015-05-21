package com.hillel.java.Swing;

import javax.swing.*;

/**
 * Created by EKarpenko on 21.05.2015.
 */
public class FirstForm extends JFrame {
    private JPanel panel;
    private JButton exitButton;
    private JButton print;
    private JTextField textField1;
    private JTextField textField2;

    public FirstForm() {
        setContentPane(panel);
//        setSize(300, 100);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        QuitAction quitAction = new QuitAction();
        exitButton.addActionListener(quitAction);
    }

    public static void main(String[] args) {
        new FirstForm();
    }

    private void createUIComponents() {

    }
}
