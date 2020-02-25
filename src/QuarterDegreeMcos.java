package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuarterDegreeMcos extends Menu {
    private ButtonGroup checkBoxGroup;
    private JTextField input = new JTextField();
    private JButton button = new JButton("Продолжить");
    private JButton button1 = new JButton("Назад");
    public JLabel choice = new JLabel("Введите гдарусы(max:5400):\n");

    public QuarterDegreeMcos() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        checkBoxGroup = new ButtonGroup();
        container.setLayout(new GridLayout(9, 2, 12, 4));

        container.add(choice);
        container.add(input);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
        button1.addActionListener(new ButtonEventListener1());
        container.add(button1);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = new String();
            input.getText();
            float sin = Float.parseFloat(input.getText());
            if (sin >=0 && sin <= 90 | sin >=361 && sin <=450 | sin >=721 && sin <=810 | sin >=1081 && sin <=1170 | sin >=1441 && sin <=1530 | sin >=1801 && sin <=1890 | sin >=2161 && sin <=2250 | sin >=2521 && sin <=2610 | sin >=2881 && sin <=2970 | sin >=3241 && sin <=3330 | sin >=3601 && sin <=3690 | sin >= 3961 && sin <=4050 | sin >=4321 && sin <=4410 | sin >=4681 && sin <=4770 | sin >=5041 && sin <=5130) {
                message += "Число в первой четверти, знак = [+].";
            } else if(sin >=91 && sin <= 180 | sin >=451 && sin <=540 | sin >=811 && sin <=900 | sin >=1171 && sin <=1260 | sin >=1531 && sin <=1620 | sin >=1891 && sin <=1980 | sin >=2251 && sin <=2340 | sin >=2611 && sin <=2700 | sin >=2971 && sin <=3060 | sin >=3331 && sin <=3420 | sin >=3691 && sin <=3780 | sin >=4051 && sin <=4140 | sin >=4411 && sin <=4500 | sin >=4771 && sin <=4860 | sin >=5131 && sin <=5220) {
                message += "Число во второй четверти, знак = [-].";
            } else if(sin >=181 && sin <=270 | sin >=541 && sin <=630 | sin >=901 && sin <=990 | sin >=1261 && sin <=1350 | sin >=1621 && sin <=1710 | sin >=1981 && sin <=2070 | sin >=2341 && sin <=2430 | sin >=2701 && sin <=2790 | sin >=3061 && sin <=3150 | sin >=3421 && sin <=3510 | sin >=3781 && sin <=3870 | sin >=4141 && sin <=4230 | sin >=4501 && sin <=4590 | sin >=4861 && sin <=4950 | sin >=5221 && sin <=5310) {
                message += "Число в третей четверти, знак = [-].";
            } else if(sin >=271 && sin <=360 | sin >=631 && sin <=720 | sin >=991 && sin <=1080 | sin >=1351 && sin <=1440 | sin >=1711 && sin <=1800 | sin >=2071 && sin <=2160 | sin >=2431 && sin <=2520 | sin >=2791 && sin <=2880 | sin >=3151 && sin <=3240 | sin >=3511 && sin <=3600 | sin >=3871 && sin <3960 | sin >=4231 && sin <=4320 | sin >=4591 && sin <=4680 | sin >=4951 && sin <= 5040 | sin >=5311 && sin <=5400) {
                message += "Число в четвертой четверти, знак = [+].";
            } else {
                message += "Ты вел не то значение.";
            }
            JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
            Quarter app = new Quarter();
            app.setVisible(true);
        }
    }
}