
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class Steep extends Menu {
    private JTextField input1 = new JTextField("", 5);
    private JLabel From = new JLabel("Введи свое имя:\n");
    private JButton button = new JButton("<html><h4>Узнать</h4></html>");
    private JButton button1 = new JButton("<html><h4>Назад</h4></html>");
    private JLabel choice = new JLabel("<html><h3>На сколько ты крутой?</h3></html>\n");

    public Steep() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 2, 29, 12));

        container.add(choice);
        container.add(From);
        container.add(input1);


        button.addActionListener(new ButtonEventListener());
        container.add(button);
        button1.addActionListener(new ButtonEventListener1());
        container.add(button1);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = new String();
                int a = 0;
                int b = 100;
                long random_number = (long) (a + (long) (Math.random() * b));
                message += "<html><h3>Ты крутой на <a style=\"color: #32CD32\">" + random_number + "%";
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