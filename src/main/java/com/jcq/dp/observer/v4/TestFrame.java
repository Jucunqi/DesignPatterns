package com.jcq.dp.observer.v4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends Frame {

    public void launch() {

        Button button = new Button("button");
        button.addActionListener(new MyActionListener());
        this.add(button);
        this.pack();
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        TestFrame frame = new TestFrame();
        frame.launch();
    }
}

class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed");

    }
}