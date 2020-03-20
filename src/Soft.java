
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Soft extends Menu
{
    private static final long serialVersionUID = 1L;
    public String[] elements = new String[] {"Не выбрано","Посчитать оценку","Вывод рандомного числа","Конвертер регистров",
                                             "На сколько ты крутой",};

    private JLabel choice = new JLabel("<html><h1>Что хотите выбрать?</h1></html>\n");
    private JLabel choice1 = new JLabel("                                                                                                                                                                                                                                                                                                                                                ");
    private JComboBox<String> cbFirst;
    private DefaultComboBoxModel<String> cbModel;

    public Soft() {
        this.setBounds(500, 100, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cbModel = new DefaultComboBoxModel<String>();
        for (int i = 0; i < elements.length; i++)
            cbModel.addElement((String)elements[i]);
        cbFirst = new JComboBox<String>(cbModel);

        cbFirst.setPrototypeDisplayValue("                                                          ");

        JButton btnAdd = new JButton("Продолжить");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (elements[0] == cbModel.getSelectedItem()) {
                    String message = "Ты ничего не выбрал.";
                    JOptionPane.showMessageDialog(null, message, "Ответ", JOptionPane.PLAIN_MESSAGE);
                }
                if (elements[1] == cbModel.getSelectedItem()) {
                    dispose();
                    Estimation es = new Estimation();
                    es.setVisible(true);
                }
                if (elements[2] == cbModel.getSelectedItem()) {
                    dispose();
                    RandomNumber es = new RandomNumber();
                    es.setVisible(true);
                }
                if (elements[3] == cbModel.getSelectedItem()) {
                    dispose();
                    Word es = new Word();
                    es.setVisible(true);
                }
                if (elements[4] == cbModel.getSelectedItem()) {
                    dispose();
                    Steep es = new Steep();
                    es.setVisible(true);
                }
            }
        });

        JPanel contents = new JPanel();
        contents.add(choice);
        contents.add  (cbFirst );
        contents.add(choice1);
        contents.add  (btnAdd  );
        setContentPane(contents);
    }
}