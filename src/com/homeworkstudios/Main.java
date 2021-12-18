package com.homeworkstudios;

import javax.swing.*;

import com.homeworkstudios.control.Keyboard;
import com.homeworkstudios.renderer.Renderer;
import com.homeworkstudios.world.World;

import java.awt.event.KeyEvent;

public class Main {

    public static JFrame frame;
    public static Renderer renderer;
    public static World world;

    public static void main(String[] args) {

        frame = new JFrame("Homework Studios");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 720);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);

        renderer = new Renderer();
        world = new World();
        while (true) {

            if(Keyboard.isKeyPressed(KeyEvent.VK_ESCAPE)) {
                System.exit(0);
            }

            renderer.update(frame);
        }
    }
}
