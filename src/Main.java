import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JTextField textField;

    public Main(){
        super("Calculator");

        setLayout(new BorderLayout());

        textField = new JTextField(30);
        textField.setSize(180, 50);

        add(BorderLayout.NORTH, textField);

        add(BorderLayout.SOUTH, getButtonsPanel());

        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private JPanel getButtonsPanel(){

        JPanel centerPanel = new JPanel();

        centerPanel.setLayout(new GridLayout(4,3));


        NumberButtonsListener numbtnlistener = new NumberButtonsListener();

        for(int i = 1; i <= 9; i++){
            JButton b = new JButton("" + i);
            centerPanel.add(b);
            b.addActionListener(numbtnlistener);
        }

        JButton zero = new JButton("0");
        zero.addActionListener(numbtnlistener);

        centerPanel.add(new JPanel().add(zero));

        return centerPanel;
    }

    private class NumberButtonsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){

        }
    }

    public static void main(String[] args){
        new Main();
    }

}