package com.homeworkstudios.renderer;

import com.homeworkstudios.Main;
import com.homeworkstudios.world.object.Object;

import javax.swing.*;
import java.awt.*;

public class Renderer {

    public void update(JFrame frame) {

        Object[] objects = Main.world.getObjects();

        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for (Object object : objects) {
                    Polygon polygon = object.asPolygon();
                    g.setColor(object.getColor());
                    if(object.isFilled()) {
                        g.fillPolygon(polygon);
                    }else{
                        g.drawPolygon(polygon);
                    }
                }

            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1200, 720);
            }
        };

        frame.add(p);

        frame.pack();

        Main.world.update();

    }

}
