package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class RandomNumber extends Menu {
    private JButton button = new JButton("<html><h4>Вывести</h4></html>");
    private JButton button1 = new JButton("<html><h4>Назад</h4></html>");
    private JLabel choice = new JLabel("<html><h3>Вывод рандомного числа</h3></html>\n");

    public RandomNumber() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 29, 12));

        container.add(choice);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
        button1.addActionListener(new ButtonEventListener1());
        container.add(button1);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = new String();
            int a = 0;
            int b = 1000000;
            int random_number1 = a + (int) (Math.random() * b);
            message += "Рандомное число: " + random_number1;
            message += "\nВ данный момент она выводит число от 0 до 1.000.000\nв следующих версиях будет возможно выводить свои числа.";
            JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
            SimpleGUI app = new SimpleGUI();
            app.setVisible(true);
        }
    }
}