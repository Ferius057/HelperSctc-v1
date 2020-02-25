package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Definitions extends Menu {
    private JButton button = new JButton("Продолжить");
    private JButton button1 = new JButton("Назад");
    private JLabel choice = new JLabel("Выберите опеределение чего хотиле узнать?\n");
    private JRadioButton radio1 = new JRadioButton("Синус - \'sin\'.");
    private JRadioButton radio2 = new JRadioButton("Косинус - \'cos\'.");
    private JRadioButton radio3 = new JRadioButton("Тангенс - \'tg\'.");
    private JRadioButton radio4 = new JRadioButton("Котангенс - \'ctg\'.");
    private JRadioButton radio5 = new JRadioButton("Все определения сразу.");


    public Definitions() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        ButtonGroup group = new ButtonGroup();
        container.setLayout(new GridLayout(8, 2, 12, 4));

        container.add(choice);
        container.add(button1);
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        group.add(radio5);
        container.add(radio1);
        container.add(radio2);
        container.add(radio3);
        container.add(radio4);
        container.add(radio5);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
        button1.addActionListener(new ButtonEventListener1());
        container.add(button1);
    }


    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = new String();
            if (radio1.isSelected()) {
                message = "Синус острого угла в прямоугольном треугольнике – это отношение противолежащего катета к гипотенузе.\nСинус угла ( sin α ) - отношение противолежащего этому углу катета к гипотенузе";
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
            } else if (radio2.isSelected()){
                message = "Косинус острого угла в прямоугольном треугольнике – это отношение прилежащего катета к гипотенузе.\nКосинус угла ( cos α ) - отношение прилежащего катета к гипотенузе";
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
            } else if (radio3.isSelected()){
                message = "Функция угла, равная в прямоугольном треугольнике отношению катета, лежащего против данного острого угла, к другому катету.\nТангенс угла ( tg α ) - отношение противолежащего катета к прилежащему";
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
            } else if (radio4.isSelected()){
                message = "Котангенс острого угла в прямоугольном треугольнике называется отношение катета, прилежащего к этому углу (OA), к противолежащему катету (AB)\nКотангенс угла ( ctg α ) - отношение прилежащего катета к противолежащему";
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
            } else if (radio5.isSelected()){
                message += "Синус острого угла в прямоугольном треугольнике – это отношение противолежащего катета к гипотенузе.\nСинус угла ( sin α ) - отношение противолежащего этому углу катета к гипотенузе.";
                message += "\n==================================================================================================================================\n";
                message += "Косинус острого угла в прямоугольном треугольнике – это отношение прилежащего катета к гипотенузе.\nКосинус угла ( cos α ) - отношение прилежащего катета к гипотенузе";
                message += "\n==================================================================================================================================\n";
                message += "Функция угла, равная в прямоугольном треугольнике отношению катета, лежащего против данного острого угла, к другому катету.\nТангенс угла ( tg α ) - отношение противолежащего катета к прилежащему";
                message += "\n==================================================================================================================================\n";
                message += "Котангенс острого угла в прямоугольном треугольнике называется отношение катета, прилежащего к этому углу (OA), к противолежащему катету (AB)\nКотангенс угла ( ctg α ) - отношение прилежащего катета к противолежащему";
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
            }
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