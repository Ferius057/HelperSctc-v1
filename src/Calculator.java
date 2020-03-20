
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends Menu {
    public float percent = 100,answer,percent2;
    private JButton button = new JButton("Продолжить");
    private JButton button1 = new JButton("Назад");
    private JTextField input1 = new JTextField("", 5);
    private JTextField input2 = new JTextField("", 5);
    private JLabel own = new JLabel("Введи первое число:\n");
    private JLabel total = new JLabel("Введи второе число:\n");
    private JCheckBox Plus = new JCheckBox("Плюс [+]", false);
    private JCheckBox Minus = new JCheckBox("Минус [-]", false);
    private JCheckBox Multiplications = new JCheckBox("Умножение [*]", false);
    private JCheckBox Division = new JCheckBox("Деление [/]", false);


    public Calculator() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        ButtonGroup group = new ButtonGroup();
        container.setLayout(new GridLayout(5, 2, 19, 8));

        group.add(Plus);
        group.add(Minus);
        group.add(Multiplications);
        group.add(Division);
        container.add(own);
        container.add(input1);
        container.add(total);
        container.add(input2);
        container.add(Plus);
        container.add(Minus);
        container.add(Multiplications);
        container.add(Division);


        button.addActionListener(new ButtonEventListener());
        container.add(button1);
        container.add(button);
        button1.addActionListener(new ButtonEventListener1());

    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = new String();
            float answer;
            input1.getText();
            input2.getText();
            float f = Float.parseFloat(input1.getText());
            float q = Float.parseFloat(input2.getText());
            if (Plus.isSelected()) {
                answer = f + q;
                message += "<html><h3>Ответ: <a style=\"color:#008000\">" + answer;
            } else if (Minus.isSelected()) {
                answer = f - q;
                message += "<html><h3>Ответ: <a style=\"color:#008000\">" + answer;
            } else if (Multiplications.isSelected()) {
                answer = f * q;
                message += "<html><h3>Ответ: <a style=\"color:#008000\">" + answer;
            } else if (Division.isSelected()) {
                answer = f / q;
                message += "<html><h3>Ответ: <a style=\"color:#008000\">" + answer;
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