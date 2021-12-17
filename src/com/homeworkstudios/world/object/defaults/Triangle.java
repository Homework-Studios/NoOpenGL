package com.homeworkstudios.world.object.defaults;

import com.homeworkstudios.math.Vector3;
import com.homeworkstudios.world.object.Object;

public class Triangle extends Object {

    public Triangle() {
        Vector3[] vertices = new Vector3[3];

        vertices[0] = new Vector3(0, 0, 0);
        vertices[1] = new Vector3(100, 0, 0);
        vertices[2] = new Vector3(0, 100, 0);

        init(vertices);
    }

    @Override
    public void update() {

        for (Vector3 vertex : vertices) {
            vertex.add(1, 0, 0);
        }

    }
}
