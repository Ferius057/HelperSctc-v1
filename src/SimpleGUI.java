

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class SimpleGUI extends Menu {
    private JButton button = new JButton("<html><h3>Продолжить</h3></html>");
    private JLabel choice = new JLabel("<html><h1>Что хотите выбрать?</h1></html>\n");
    private JRadioButton radio1 = new JRadioButton("<html><h3>1 - [<i>Определение sin,cos,tg,ctg</i>]</h3></html>");
    private JRadioButton radio2 = new JRadioButton("<html><h3>2 - [<i>Знаки Тригонометрических функций</i>]</h3></html>");
    private JRadioButton radio3 = new JRadioButton("<html><h3>3 - [<i>Узнать четверть</i>]</html></h3>");

    public SimpleGUI() {
        this.setBounds(500, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        ButtonGroup group = new ButtonGroup();
        container.setLayout(new GridLayout(5, 2, 29, 12));

        container.add(choice);
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        container.add(radio1);
        container.add(radio2);
        container.add(radio3);

        button.addActionListener(new ButtonEventListener());
        container.add(button);

    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = new String();
            if (radio1.isSelected()) {
                dispose();
                Definitions app = new Definitions();
                app.setVisible(true);
            } else if (radio2.isSelected()) {
                message += ("(sin α)" + "                   (cos α)" + "                    (tg α)" + "                    (ctg α)");
                String[][] matrice = {{" \n+", "|", "+", "                       ", "-", "|", "+", "                        ", "-", "|", "+", "                      ", "-", "|", "+",},
                        {"   \n -", "|", "-", "                        ", "-", "|", "+", "                       ", "+", "|", "-", "                      ", "+", "|", "-",}};
                for (int i = 0; i < matrice.length; i++) {
                    for (int j = 0; j < matrice[i].length; j++) {
                        message += (matrice[i][j] + " ");
                    }
                }
                JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
            } else if (radio3.isSelected()) {
                dispose();
                Quarter app = new Quarter();
                app.setVisible(true);
            } else {

            }
        }
    }
}
