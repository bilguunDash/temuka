/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussticketsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author dbilguun
 */
public class Register {
    
   
        JFrame frame = new JFrame();
        Register(){
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 650);
		frame.setVisible(true);
                
                
                
        JPanel northPanel = new JPanel();
        JPanel centerPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        JPanel southPanel = new JPanel();
        
        
        northPanel.setBackground(Color.green);
        southPanel.setBackground(Color.red);
        centerPanel.setBackground(Color.blue); 
        
        
        frame.add(northPanel,BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        
        //JLabel JButton JradioButton Jcheckbox Jtextfield
        JLabel reglabel = new JLabel("Registration Form");
        northPanel.add(reglabel);
        reglabel.setFont(new Font("Segoe Script", Font.BOLD, 30));
        reglabel.setForeground(Color.white);
        
        JLabel firstNameLabel = new JLabel("User Name:");
        JLabel lastNameLabel = new JLabel("Password:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel hobbyLabel = new JLabel("Information");
        
        JTextField firstNameText = new JTextField("Enter name");
        JTextField lastNameText = new JTextField("Enter Password");
        
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup group=new ButtonGroup();
        group.add(maleRadio);
        group.add(femaleRadio);
        
        JTextField phoneBox;
        phoneBox = new JTextField("Phone Number");
        
        JTextField eatBox;
        eatBox = new JTextField("Address");
        
        JTextField playBox;
        playBox = new JTextField("Email");
        
        JButton register = new JButton("Register");
        JButton cancelButton = new JButton("Cancel");
        
        
        
        
        centerPanel.add(firstNameLabel);
        centerPanel.add(firstNameText);
        centerPanel.add(lastNameLabel);
        centerPanel.add(lastNameText);
        centerPanel.add(genderLabel);
        centerPanel.add(maleRadio);
        centerPanel.add(new JLabel());
        centerPanel.add(femaleRadio);
        centerPanel.add(hobbyLabel);
        centerPanel.add(phoneBox);
        centerPanel.add(new JLabel());
        centerPanel.add(eatBox);
        centerPanel.add(new JLabel());
        centerPanel.add(playBox);
        centerPanel.add(register);
        centerPanel.add(cancelButton);
        
        
        firstNameText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
        
               firstNameText.setText(null);
         }

            @Override
            public void focusLost(FocusEvent e) {
         
       //  firstNameText.setText
            }
        });
        
        
        phoneBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
        
               phoneBox.setText(null);
         }

            @Override
            public void focusLost(FocusEvent e) {
         
       //  phoneBox.setText
            }
        });
        
        eatBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
        
               eatBox.setText(null);
         }

            @Override
            public void focusLost(FocusEvent e) {
         
       //  eatBox.setText
            }
        });
        
        
                 playBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
        
               playBox.setText(null);
         }

            @Override
            public void focusLost(FocusEvent e) {
         
       //  playBox.setText
            }
        });
                 
                 lastNameText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
        
               lastNameText.setText(null);
         }

            @Override
            public void focusLost(FocusEvent e) {
         
       //  lastNameText.setText
            }
        });
                 
               
                 frame.setVisible(true);
        }
                
    }
    
    
    


