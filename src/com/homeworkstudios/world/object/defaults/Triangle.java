package com.homeworkstudios.world.object.defaults;

import com.homeworkstudios.math.Vector3;
import com.homeworkstudios.world.object.Object;

import java.awt.*;
import java.awt.event.MouseAdapter;

public class Triangle extends Object {

    public Triangle() {
        Vector3[] vertices = new Vector3[3];

        vertices[0] = new Vector3();
        vertices[1] = new Vector3();
        vertices[2] = new Vector3();

        init(vertices);
    }

    @Override
    public void update(int frames) {

        float mouseX = MouseInfo.getPointerInfo().getLocation().x;
        float mouseY = MouseInfo.getPointerInfo().getLocation().y;

        // move the triangle in a circle
        Vector3[] vertices = getVertices();

        vertices[0].x = (float) (100 * Math.cos(frames / 100.0)) + mouseX;
        vertices[0].y = (float) (100 * Math.sin(frames / 100.0)) + mouseY;

        vertices[1].x = (float) (100 * Math.cos(frames / 100.0 + (Math.PI / 2))) + mouseX;
        vertices[1].y = (float) (100 * Math.sin(frames / 100.0 + (Math.PI / 2))) + mouseY;

        vertices[2].x = (float) (100 * Math.cos(frames / 100.0 + Math.PI)) + mouseX;
        vertices[2].y = (float) (100 * Math.sin(frames / 100.0 + Math.PI)) + mouseY;
    }

}
