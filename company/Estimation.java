package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Estimation extends Menu {
    public float percent = 100,answer,percent2;
    private JButton button = new JButton("Продолжить");
    private JButton button1 = new JButton("Назад");
    private JTextField input1 = new JTextField("", 5);
    private JTextField input2 = new JTextField("", 5);
    private JLabel own = new JLabel("Введи сколько у тебя баллов:\n");
    private JLabel total = new JLabel("Введи сколько всего баллов:\n");
    private JCheckBox check = new JCheckBox("Узнать формулу решения", false);

    public Estimation() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7, 2, 19, 8));

        container.add(own);
        container.add(input1);
        container.add(total);
        container.add(input2);
        container.add(check);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
        button1.addActionListener(new ButtonEventListener1());
        container.add(button1);

    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = new String();
            input1.getText();
            input2.getText();
            float f = Float.parseFloat(input1.getText());
            float q = Float.parseFloat(input2.getText());
            if (f >= 51 || q >= 51) {
                message += "Я указал 50max баллов)\nПопробуй еще раз.";
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
                return;
            }
            if (f > q) {
                message += "Всего баллов не может быть меньше твоих баллов.";
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
                return;
            }
            percent2 = percent / q;
            answer = percent2 * f;
            if (answer >= 0 && answer <= 39) {
                message += "<html><h3>Твоя оценка: <a style=\"color: #FF0000\">2</a>.</h3></html>";
            } else if (answer >= 40 && answer <= 64) {
                message += "<html><h3>Твоя оценка: <a style=\"color: #FF4500\">3</a>.</h3></html>";
            } else if (answer >= 65 && answer <= 84) {
                message += "<html><h3>Твоя оценка: <a style=\"color: #32CD32\">4</a>.</h3></html>";
            } else if (answer >= 85 && answer <= 100) {
                message += "<html><h3>Твоя оценка: <a style=\"color: #006400\">5</a>.</h3></html>";
            }
            if (check.isSelected()) {
                message += "\n\nФормула: \n100%/" + input2.getText() + "*" + input1.getText() + "= Ответ в процентах\n";
                message += input2.getText() + "= Всего баллов\n" + input1.getText() + "= Твои баллы";
                message += "\n\nОтвет процентов:\n0-39 = оценка 2\n40-64 = оценка 3\n65-84 = оценка 4\n85-100 = оценка 5\n";
            }
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