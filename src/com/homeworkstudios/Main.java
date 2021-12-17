package com.homeworkstudios;

import javax.swing.*;
import com.homeworkstudios.renderer.Renderer;
import com.homeworkstudios.world.World;

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
            renderer.update(frame);
        }
    }
}
