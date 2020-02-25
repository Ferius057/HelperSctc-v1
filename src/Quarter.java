package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quarter extends Menu {
    private ButtonGroup checkBoxGroup;
    private JButton button = new JButton("Продолжить");
    private JButton button1 = new JButton("Назад");
    private JLabel choice = new JLabel("Выберите значение.\n");
    private JRadioButton radio1 = new JRadioButton("sin");
    private JRadioButton radio2 = new JRadioButton("cos");
    private JRadioButton radio3 = new JRadioButton("tg");
    private JRadioButton radio4 = new JRadioButton("ctg");
    private JCheckBox check = new JCheckBox("+", false);
    private JCheckBox check1 = new JCheckBox("-", false);

    public Quarter() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        ButtonGroup group = new ButtonGroup();
        checkBoxGroup = new ButtonGroup();
        container.setLayout(new GridLayout(9, 2, 12, 4));

        container.add(choice);
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        container.add(radio1);
        container.add(radio2);
        container.add(radio3);
        container.add(radio4);

        checkBoxGroup.add(check);
        checkBoxGroup.add(check1);
        container.add(check);
        container.add(check1);


        button.addActionListener(new ButtonEventListener());
        container.add(button);
        button1.addActionListener(new ButtonEventListener1());
        container.add(button1);
    }


    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                if (radio1.isSelected() & check.isSelected()) {
                    dispose();
                    QuarterDegreePsin app = new QuarterDegreePsin();
                    app.setVisible(true);
                } else if (radio2.isSelected() & check.isSelected()) {
                    dispose();
                    QuarterDegreePcos app = new QuarterDegreePcos();
                    app.setVisible(true);
                } else if (radio3.isSelected() & check.isSelected()) {
                    dispose();
                    QuarterDegreePtgCtg app = new QuarterDegreePtgCtg();
                    app.setVisible(true);
                } else if (radio4.isSelected() & check.isSelected()) {
                    dispose();
                    QuarterDegreePtgCtg app = new QuarterDegreePtgCtg();
                    app.setVisible(true);
            }
                if (radio1.isSelected() & check1.isSelected()) {
                    dispose();
                    QuarterDegreeMsin app = new QuarterDegreeMsin();
                    app.setVisible(true);
                } else if (radio2.isSelected() & check1.isSelected()) {
                    dispose();
                    QuarterDegreeMcos app = new QuarterDegreeMcos();
                    app.setVisible(true);
                } else if (radio3.isSelected() & check1.isSelected()) {
                    dispose();
                    QuarterDegreeMtgСtg app = new QuarterDegreeMtgСtg();
                    app.setVisible(true);
                } else if (radio4.isSelected() & check1.isSelected()) {
                    dispose();
                    QuarterDegreeMtgСtg app = new QuarterDegreeMtgСtg();
                    app.setVisible(true);
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
