package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame {
    public Calculator()  {
        setTitle("Calculator");
        setBounds(50, 50, 300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextField inmputField = new JTextField();
        inmputField.setEditable(false);
        top.add(inmputField, BorderLayout.CENTER);

        JPanel botton = new JPanel();
        botton.setLayout(new GridLayout(5,3));
        add(top, BorderLayout.NORTH);
        add(botton, BorderLayout.CENTER);

        ButtomListener buttomListener = new ButtomListener(inmputField);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(buttomListener);
            botton.add(button);
        }
        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JButton button = (JButton) e.getSource();

                StringBuilder sb = new StringBuilder(inmputField.getText());
                sb.append(button.getText());

                inmputField.setText(sb.toString());
                              }});
        botton.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JButton button = (JButton) e.getSource();

                StringBuilder sb1 = new StringBuilder(inmputField.getText());
                sb1.append(button.getText());

                inmputField.setText(sb1.toString());
            }});
        botton.add(minus);

        JButton clear = new JButton("c");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String[] values = inmputField.getText().split("с");
                return;
            }});

        botton.add(clear);

        JButton calc = new JButton("=");
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String[] values = inmputField.getText().split("\\+");
                int sum = Integer.parseInt(values[0])+Integer.parseInt(values[1]);
                inmputField.setText(String.valueOf(sum));


                String[] values1 = inmputField.getText().split("\\-");
                int sum2 = Integer.parseInt(values1[0])-Integer.parseInt(values1[1]);
                inmputField.setText(String.valueOf(sum2));
            }});



        botton.add(calc);
        JButton SQRT = new JButton("SQRT");
        botton.add(SQRT);

        setVisible(true);
    }

    }