package com.homeworkstudios.world.object.defaults;

import com.homeworkstudios.Main;
import com.homeworkstudios.math.Vector2;
import com.homeworkstudios.math.Vector3;
import com.homeworkstudios.world.object.Object;

import java.awt.*;

public class Box extends Object {

    public Box() {
        init(new Vector3[6]);
        this.isFilled = true;

        Main.frame.addMouseWheelListener(e -> {
            this.mouseWheelRotation += e.getWheelRotation();
        });

    }

    private int mouseWheelRotation = 0;

    @Override
    public void update(int frames) {
        this.vertices[0] = new Vector3(-200, -200, 0);
        this.vertices[1] = new Vector3(200, -200, 0);
        this.vertices[2] = new Vector3(200, 200, 0);
        this.vertices[3] = new Vector3( -200, 200, 0);
        this.vertices[4] = new Vector3(-200, -200, -200);
        this.vertices[5] = new Vector3(200, -200, -200);

        this.rotationZ = this.mouseWheelRotation / 360f;

        Point mouse = Main.frame.getMousePosition();

        if(mouse != null) {
            this.setScreenPosition(new Vector2(mouse.getLocation().x, mouse.getLocation().y));
        }

    }

}
