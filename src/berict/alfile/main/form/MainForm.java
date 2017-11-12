package berict.alfile.main.form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainForm extends JFrame {

    private JPanel parentPanel;// = new JPanel();
    private JPanel leftPanel;
    private JButton replaceButton;
    private JButton changeCaseButton;
    private JButton insertButton;
    private JButton changeExtensionButton;
    private JButton renumberButton;
    private JRadioButton processAllButton;
    private JRadioButton processSelectedButton;
    private JButton processButton;
    private JPanel centerPanel;
    private JTable table;

    public static int WINDOW_WIDTH = 960;
    public static int WINDOW_HEIGHT = 540;

    public MainForm() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setContentPane(parentPanel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        replaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField oldString = new JTextField();
                JTextField newString = new JTextField();
                final JComponent[] inputs = new JComponent[]{
                        new JLabel("String to replace"),
                        oldString,
                        new JLabel("New string"),
                        newString
                };
                int result = JOptionPane.showConfirmDialog(null, inputs, "Replace", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    System.out.println(oldString + " > to > " + newString);
                } else {
                    System.out.println("Result : " + result);
                }

                if (oldString != null && newString != null) {
                    // TODO add actions to the table
                }
            }
        });
    }

    private void createUIComponents() {
    }
}
