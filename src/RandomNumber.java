
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class RandomNumber extends Menu {
    private JTextField input1 = new JTextField("", 5);
    private JTextField input2 = new JTextField("", 5);
    private JLabel From = new JLabel("От:\n");
    private JLabel Before = new JLabel("До:\n");
    private JButton button = new JButton("<html><h4>Вывести</h4></html>");
    private JButton button1 = new JButton("<html><h4>Назад</h4></html>");
    private JLabel choice = new JLabel("<html><h3>Вывод рандомного числа</h3></html>\n");

    public RandomNumber() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7, 2, 29, 12));

        container.add(choice);
        container.add(From);
        container.add(input1);
        container.add(Before);
        container.add(input2);

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
            float a = Float.parseFloat(input1.getText());
            float b = Float.parseFloat(input2.getText());
            long random_number1 = (long) (a + (long) (Math.random() * b));
            if (a > b) {
                message += "Число \"От\" не может быть больше \"До\"";
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
                return ;
            }
            message += "\n<html><h3>Рандомное число: <a style=\"color: #008000\">" + random_number1 + "</a></h3></html>";
            JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
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