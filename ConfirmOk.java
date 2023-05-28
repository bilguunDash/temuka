/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussticketsystem;

import java.awt.*;
import javax.swing.*;
public class ConfirmOk {

 JFrame frame = new JFrame();
 JLabel label = new JLabel("URGELJ SURALTS ZALUU MIN");
 
 ConfirmOk(){
  
  label.setBounds(0,0,800,600);
  label.setFont(new Font(null,Font.PLAIN,25));
  
  frame.add(label);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(420,420);
  frame.setLayout(null);
  frame.setVisible(true);
 }
}