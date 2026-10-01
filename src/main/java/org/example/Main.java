package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String error1="Exception in thread main java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3 \n" +
            "at Main.main(Main.java:12)";
    static String error2="Exception in thread main java.util.ConcurrentModificationException \n" +
            "at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013) \n" +
            "at Main.main(Main.java:20)";
    static String error3="Error: Could not find or load main class Main \n" +
            "Caused by: java.lang.ClassNotFoundException: Main";
    static String error4="Exception in thread main java.lang.OutOfMemoryError: Java heap space \n" +
            "at Main.main(Main.java:35)";

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("DEVFIX APP");
        frame.getDefaultCloseOperation();
        frame.setBounds(500,500,500,500);
        frame.setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        JTextField input = new JTextField();
        input.setBounds(50,50,400,50);
        input.setForeground(Color.BLACK);
        frame.add(input);

        JButton submit = new JButton();
        submit.setBounds(195,120,100,50);
        submit.setText("SUBMIT!");

        JTextArea area = new JTextArea();
        area.setBounds(50,200,400,250);
        area.setEditable(false);
        area.setForeground(Color.RED);
        frame.add(area);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usererror= input.getText();
                if(usererror.equals(error1)) {
                    area.setText("Possible problems: \n"+ "ArrayIndexOutOfBoundsException");
                }else if(usererror.equals(error2)) {
                    area.setText("Possible problems: \n"+ "ConcurrentModificationException");
                }else if(usererror.equals(error3)){
                    area.setText("Possible problems: \n"+ "Could not find or load main class");
                }else if(usererror.equals(error4)){
                    area.setText("Possible problems: \n"+ "OutOfMemoryError");
                }

            }
        });

        frame.add(submit);

        JTabbedPane Tabs = new JTabbedPane();
        frame.setVisible(true);
    }
}