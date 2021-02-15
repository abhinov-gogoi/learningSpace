package com.brocode.clockapp;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    public MyFrame(){
        this.setTitle("MyClock");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel = new JLabel();
        timeLabel.setText(time);
        this.add(timeLabel);

        this.setVisible(true);

    }
}
