package com.company.task1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class
Task1 extends JFrame {
    private final JPanel contentPane;
    private JTextField textFieldClassFullName;
    private JTextArea classDataArea;
    private JButton analClassButton;
    private JButton exitButton;
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            try {
                Task1 frame = new Task1();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println( ClassAnalyzer.newBuilder(Readable.class)
                .addPackageName()
                .addInterfaces()
                .addClassName()
                .addFiles()
                .addConstructor()
                .addMethods()
                .build()
                .toString());


    }


    public Task1() {
        setResizable(false);
        textFieldClassFullName = new JTextField(40);
        classDataArea = new JTextArea();
        analClassButton = new JButton("Start");
        exitButton = new JButton("Exit");
        exitButton.addActionListener(i -> System.exit(-1));
        analClassButton.addActionListener(l -> {
            try {
                classDataArea.setText(
                        ClassAnalyzer.newBuilder(textFieldClassFullName.getText())
                                .addPackageName()
                                .addInterfaces()
                                .addClassName()
                                .addFiles()
                                .addConstructor()
                                .addMethods()
                                .build()
                                .toString()
                );
            } catch (ClassNotFoundException e) {
                classDataArea.setText(e.toString());
            }
        });

        setTitle("Class Analyzer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));

        setContentPane(contentPane);

        JPanel panelNorth = new JPanel();
        panelNorth.add(new Label("полне ім'я класа"));
        panelNorth.add(textFieldClassFullName);
        contentPane.add(panelNorth,BorderLayout.NORTH);
        JScrollPane jScrollPane = new JScrollPane(classDataArea);
        contentPane.add(jScrollPane,BorderLayout.CENTER);
        JPanel panelButtons = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panelButtons.getLayout();
        flowLayout.setHgap(15);
        panelButtons.add(analClassButton);
        panelButtons.add(exitButton);

        contentPane.add(panelButtons,BorderLayout.SOUTH);

    }
}
