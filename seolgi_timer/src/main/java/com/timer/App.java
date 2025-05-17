package com.timer;

import java.awt.*;
import javax.swing.*;

public class App {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Seolgi Timer");
    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    JPanel panel = new JPanel();
    JButton startButton = new JButton("Start");
    JButton stopButton = new JButton("Stop");
    panel.add(startButton);
    panel.add(stopButton);

    //panel.setBackground(Color.blue);
    frame.add(panel);
  }
}
