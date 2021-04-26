import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    double num,ans;
    int calculation;

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
    private JLabel operationLabel;


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
        commaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText(calculatorTextField.getText() + ".");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               num = Double.parseDouble(calculatorTextField.getText());
               calculation=1;
               calculatorTextField.setText("");
               operationLabel.setText(num + "+");
            }
        });
        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calculatorTextField.getText());
                calculation=2;
                calculatorTextField.setText("");
                operationLabel.setText(num + "-");
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calculatorTextField.getText());
                calculation=3;
                calculatorTextField.setText("");
                operationLabel.setText(num + "*");
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calculatorTextField.getText());
                calculation=4;
                calculatorTextField.setText("");
                operationLabel.setText(num + "/");
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorTextField.setText("");
            }
        });
        arrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int length = calculatorTextField.getText().length();
              int number = calculatorTextField.getText().length()-1;
              String store;

              if(length>0){
                  StringBuilder back = new StringBuilder(calculatorTextField.getText());
                  back.deleteCharAt(number);
                  store= back.toString();
                  calculatorTextField.setText(store);
              }
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmeticOperation();
                operationLabel.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator("Calculator");
        calculator.setVisible(true);
    }

    public void arithmeticOperation(){
        switch (calculation){
            case 1:
                ans = num + Double.parseDouble(calculatorTextField.getText());
                calculatorTextField.setText(Double.toString(ans));
                break;
            case 2:
                ans = num - Double.parseDouble(calculatorTextField.getText());
                calculatorTextField.setText(Double.toString(ans));
                break;
            case 3:
                ans = num * Double.parseDouble(calculatorTextField.getText());
                calculatorTextField.setText(Double.toString(ans));
                break;
            case 4:
                ans = num / Double.parseDouble(calculatorTextField.getText());
                calculatorTextField.setText(Double.toString(ans));
                break;
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
