package com.homeworkstudios;

import javax.imageio.ImageIO;
import javax.swing.*;

import com.homeworkstudios.control.Keyboard;
import com.homeworkstudios.renderer.Renderer;
import com.homeworkstudios.world.World;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static JFrame frame;
    public static Renderer renderer;
    public static World world;

    public static void main(String[] args) throws IOException {

        frame = new JFrame("Homework Studios");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 720);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);

        URL url = new URL("https://cdn.discordapp.com/attachments/674239878845825054/921577585270485072/95627604.png");
        Image image = ImageIO.read(url);
        frame.setIconImage(image);

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
