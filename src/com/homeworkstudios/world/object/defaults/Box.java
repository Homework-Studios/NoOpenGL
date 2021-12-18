package com.homeworkstudios.world.object.defaults;

import com.homeworkstudios.Main;
import com.homeworkstudios.math.Vector2;
import com.homeworkstudios.math.Vector3;
import com.homeworkstudios.world.object.Object;

import javax.swing.*;

public class Box extends Object {

    public Box() {
        init(new Vector3[4]);
        this.isFilled = true;
    }

    @Override
    public void update(int frames) {
        this.vertices[0] = new Vector3(-50, -50, 0);
        this.vertices[1] = new Vector3(50, -50, 0);
        this.vertices[2] = new Vector3(50, 50, 0);
        this.vertices[3] = new Vector3( -50, 50, 0);

        this.rotationX += 0.01f;
        this.rotationZ += 0.001f;
    }

}
