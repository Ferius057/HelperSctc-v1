
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame {
    private static final long serialVersionUID = 1L;

    public Menu() {
        super("HELPER SCTC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание строки главного меню
        JMenuBar menuBar = new JMenuBar();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(createFileMenu());
        menuBar.add(createSoftwareMenu());
        menuBar.add(createHelpMenu());
        menuBar.add(createVersionMenu());
        // Подключаем меню к интерфейсу приложения
        setJMenuBar(menuBar);
        // Открытие окна
        setSize(300, 200);
        setVisible(true);
    }


    private JMenu createFileMenu() {
        JMenu file = new JMenu("Файл");
        JMenu tp = new JMenu("Переход на");

        JMenuItem mainMenu = new JMenuItem("Главное меню");
        mainMenu.addActionListener(e -> {
            dispose();
            SimpleGUI app = new SimpleGUI();
            app.setVisible(true);
        });
        JMenuItem definitions = new JMenuItem("<html><i>Определения</i></html>");
        definitions.addActionListener(e -> {
            dispose();
            Definitions app = new Definitions();
            app.setVisible(true);
        });
        JMenuItem chet = new JMenuItem("<html><i>Узнать четверть</i></html>");
        chet.addActionListener( e -> {
            dispose();
            Quarter app = new Quarter();
            app.setVisible(true);
        });
        JMenuItem calculator = new JMenuItem("<html><i>Калькулятор</i></html>");
        calculator.addActionListener( e -> {
            dispose();
            Calculator app = new Calculator();
            app.setVisible(true);
        });
        JMenuItem exit = new JMenuItem("Выход");
        exit.addActionListener(e -> System.exit(0));
        exit.setAccelerator(KeyStroke.getKeyStroke("alt 1"));

        tp.add(mainMenu);
        tp.add(definitions);
        tp.add(chet);
        tp.add(calculator);
        file.add(tp);
        file.addSeparator();
        file.add(exit);
        return file;
    }


    private JMenu createSoftwareMenu() {
        JMenu viewMenu = new JMenu("Допл. софт");
        JMenuItem Soft = new JMenuItem("Выбор софта");
        Soft.addActionListener(e -> {
            dispose();
            Soft es = new Soft();
            es.setVisible(true);
        });
        viewMenu.add(Soft);
        return viewMenu;
    }


    private JMenu createHelpMenu() {
        JMenu help = new JMenu("Помощь");
        JMenuItem test = new JMenuItem("Частые вопросы");
        test.addActionListener(e -> {
            StringBuilder message = new StringBuilder();
            message.toString();
            message.append("На чем написано?\n     = на Java.");
            message.append("\nЗачем эта программа?\n     = просто сделал было интересно что получится.");
            message.append("\n\n<html><h4><i>Остальные вопросы можно задать создателю.</i></h4></html>");
            JOptionPane.showMessageDialog(null, message, "Частые вопросы", JOptionPane.PLAIN_MESSAGE);
        });
        JMenuItem test1 = new JMenuItem("Связаться с создателем");
        test1.addActionListener(e -> {
            String message = new String();
            message += "Vk.\n     = https://vk.com/ferius_057";
            JOptionPane.showMessageDialog(null, message, "Связь с создателем", JOptionPane.PLAIN_MESSAGE);
        });
        JMenuItem test2 = new JMenuItem("Создатель");
        test2.addActionListener(e -> {
            String message = new String();
            message += "Создатель Аян Тайпаров:\n     = https://github.com/Ferius057\n     = https://vk.com/ferius_057";
            JOptionPane.showMessageDialog(null, message, "Создатель", JOptionPane.PLAIN_MESSAGE);
        });
        JMenuItem test3 = new JMenuItem("О программе");
        test3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = new String();
                message += "<html><h1>HELPER SCTC</h1></html>\n";
                message += "<html><h4>Version 1.5.0</h4></html>\n";
                message += "<html><h4>© 2020</h4></html>\n";
                message += "<html><h4>Все права защищены.";
                message += "<html><h4>https://github.com/Ferius057/HelperSctc-v1</h4></html>\n";
                JOptionPane.showMessageDialog(null, message, "О программе", JOptionPane.PLAIN_MESSAGE);
            }
        });

        help.add(test);
        help.addSeparator();
        help.add(test1);
        help.addSeparator();
        help.add(test2);
        help.addSeparator();
        help.add(test3);

        return help;
    }


    private JMenu createVersionMenu() {
        JMenu viewMenu = new JMenu("Версии");

        JMenuItem v1v0 = new JMenuItem("Version 1.0.0");
        v1v0.addActionListener(e -> {
            String message = new String();
            message += "Первая бета версия.";
            JOptionPane.showMessageDialog(null, message, "Версии", JOptionPane.PLAIN_MESSAGE);
        });
        JMenuItem v1v2 = new JMenuItem("Version 1.2.0");
        v1v2.addActionListener(e -> {
            StringBuilder message = new StringBuilder();
            message.append("1)Исправлены ошибки");
            message.append("\n2)Теперь возможно использовать функции которые были недоступны");
            message.append("\n3)У программы теперь есть название \"HELPER SCTC\"");
            message.append("\n4)Добавлены новые инструменты");
            JOptionPane.showMessageDialog(null, message, "Версии", JOptionPane.PLAIN_MESSAGE);
        });
        JMenuItem v1v5 = new JMenuItem("Version 1.5.0");
        v1v5.addActionListener(e -> {
            StringBuilder message = new StringBuilder();
            message.append("1)Улучшение софта с рандом выводом чисел");
            message.append("\n2)Добавлен софт \"Конвертер регистров\"");
            message.append("\n3)Добавлен \"Простой калькулятор\" в главное меню");
            message.append("\n3)Добавлен софт(тест) \"На сколько сколько ты крутой\"");
            message.append("\n4)Переделано меню софта");
            message.append("\n5)Исправлены ошибки");
            JOptionPane.showMessageDialog(null, message, "Версии", JOptionPane.PLAIN_MESSAGE);
        });

        viewMenu.add(v1v0);
        viewMenu.add(v1v2);
        viewMenu.add(v1v5);

        return viewMenu;
    }
}