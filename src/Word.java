
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Word extends Menu {
    private JButton button = new JButton("Продолжить");
    private JButton button1 = new JButton("Назад");
    private JTextField input1 = new JTextField("", 5);
    private JRadioButton radio1 = new JRadioButton("Верхний регистр (все буквы большие)");
    private JRadioButton radio2 = new JRadioButton("Нижний регистр (все буквы маленькие)");
    private JLabel choice = new JLabel("Введите текст и выберите регистр\n");

    public Word() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        ButtonGroup group = new ButtonGroup();
        container.setLayout(new GridLayout(6, 2, 19, 8));

        group.add(radio1);
        group.add(radio2);
        container.add(choice);
        container.add(input1);
        container.add(radio1);
        container.add(radio2);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
        button1.addActionListener(new ButtonEventListener1());
        container.add(button1);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = new String();
            if (radio1.isSelected()) {
                message += input1.getText();
                message = message.toUpperCase();
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
            } else if (radio2.isSelected()) {
                message += input1.getText();
                message = message.toLowerCase();
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
            } else {

            }
        }
    }

    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
            Soft es = new Soft();
            es.setVisible(true);
        }
    }
}