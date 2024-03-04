package com.mycompany.moviebookingsystem;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.*;
import javax.swing.*;
/**
 * @author Ghala
 * Simple Graphic user interface Class 
 */
public class GUI extends JFrame {

  /**
   * No argument Constructor 
   */
  public GUI()
  {
  
    JFrame frame1 = new JFrame(); // create a frame
    frame1.setSize(500,350); // set frame sizes
    frame1.setTitle("Movie Ticket Booking System"); // set frame title
    frame1.setResizable(false); // can't change the size 
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit when hit the close button

    JPanel controlPanel = new JPanel();
    frame1.add(controlPanel); 
    controlPanel.setLayout(null);

    JLabel  movieLabel = new JLabel("Movie");
    movieLabel.setBounds(150, 20, 80, 25);
    controlPanel.add(movieLabel);

    final JTextField movieText = new JTextField(10);
    movieText.setBounds(200, 20, 150, 25); 
    controlPanel.add(movieText); 

    JLabel seatLabel  = new JLabel("Seat");
    seatLabel.setBounds(150, 50, 80, 25);
    controlPanel.add(seatLabel); 

    final JTextField seatText = new JTextField(10);
    seatText.setBounds(200, 50, 150, 25);
    controlPanel.add(seatText); 

    JLabel popcorn = new JLabel("Popcorn");
    popcorn.setBounds(150, 80,300,25);
    controlPanel.add(popcorn);

    ButtonGroup sizes = new ButtonGroup();

    JRadioButton small = new JRadioButton("small"); 
    small.setBounds(200, 80,300,25);

    JRadioButton medium = new JRadioButton("medium"); 
    medium.setBounds(200, 100,200,25);

    JRadioButton large = new JRadioButton("large"); 
    large.setBounds(200, 120,100,25);
    
    frame1.add(small); 
    frame1.add(medium);
    frame1.add(large);
    // choose only one option 
    sizes.add(small);
    sizes.add(medium); 
    sizes.add(large);

    JButton button1 = new JButton("Book"); // create button
    button1.setBounds(200,165,100,30);

    JLabel informLabel = new JLabel("");
    informLabel.setBounds(170,200,300,50);

    JLabel statusLabel = new JLabel("");
    statusLabel.setBounds(200,220,300,50);

    JLabel statusLabel2 = new JLabel("");
    statusLabel2.setBounds(200,240,300,50);

    JLabel statusLabel3 = new JLabel("");
    statusLabel3.setBounds(200,260,300,50);

    button1.addActionListener(new ActionListener() {
      /**
       * Make the button "book" print the booking information
       */
      public void actionPerformed(ActionEvent e) {     
        String movie = "Movie: " + movieText.getText();
        String seat = "Seat: " + seatText.getText();
        statusLabel.setText(movie);
        statusLabel2.setText(seat);

        informLabel.setText("Your Booking information:");
  
      if(small.isSelected()){
      statusLabel3.setText("Popcorn: Small"); 
      }else if(medium.isSelected()){
        statusLabel3.setText("Popcorn: Medium"); 
      }else if(large.isSelected()){
          statusLabel3.setText("Popcorn: Large");
        }
    }}); 
   
  
    frame1.add(controlPanel);
    controlPanel.add(informLabel);
    controlPanel.add(statusLabel);
    controlPanel.add(statusLabel2);
    controlPanel.add(statusLabel3);

    controlPanel.add(button1);
    frame1.setVisible(true); // make the frame visible


    }

  }
