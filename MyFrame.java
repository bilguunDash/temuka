/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussticketsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JButton myButton;
    JComboBox<String> comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setBounds(100,50,130,30);

        //JLabel firstNameLabel = new JLabel("User Name:");
        String[] HAANAAS = {"Ulaanbaatar", "Zavkhan", "Tov"};
        comboBox = new JComboBox<>(HAANAAS);
        comboBox.addActionListener(this);
        comboBox.setPreferredSize(new Dimension(150, comboBox.getPreferredSize().width));
        
        
        
        String[] HAASHAA = {"OMNOGOVI","SELENGE","HYATAD"};
        comboBox = new JComboBox<>(HAASHAA);
        comboBox.addActionListener(this);
        comboBox.setPreferredSize(new Dimension(150, comboBox.getPreferredSize().height));
        menuBar = new JMenuBar();
 
        
        
        
        
        
        
        
        
        
        
        fileMenu = new JMenu("Booking");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        myButton = new JButton("Confirm");
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        //this.add(firstNameLabel);
        this.add(myButton, BorderLayout.SOUTH);
        this.add(comboBox, BorderLayout.NORTH);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("*beep boop* you loaded a file");
        }
        if (e.getSource() == saveItem) {
            System.out.println("*beep boop* you saved a file");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
        if (e.getSource() == myButton) {
            this.dispose();
            ConfirmOk ok = new ConfirmOk();
        }
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame();
        });
    }
}
