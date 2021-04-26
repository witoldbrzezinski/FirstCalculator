import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JFrame calculatorFrame;
    private JPanel calculatorJPanel;
    private JTextField calculatorTextField;
    private JButton arrowButton;
    private JButton cButton;
    private JButton addButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton subtractionButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton multiplicationButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton divisionButton;
    private JButton zeroButton;
    private JButton commaButton;
    private JButton equalsButton;


    public Calculator(String title){
        super("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(calculatorJPanel);
        this.pack();

        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "1");
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "2");
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "3");
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "4");
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "5");
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "6");
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "7");
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "8");
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "9");
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + "0");
            }
        });
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator("Calculator");
        calculator.setVisible(true);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
