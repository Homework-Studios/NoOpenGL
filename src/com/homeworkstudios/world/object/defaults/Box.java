package com.homeworkstudios.world.object.defaults;

import com.homeworkstudios.Main;
import com.homeworkstudios.control.Keyboard;
import com.homeworkstudios.math.Vector2;
import com.homeworkstudios.math.Vector3;
import com.homeworkstudios.world.object.Object;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Box extends Object {

    private float size = 200;

    public Box() {
        init(new Vector3[4]);
        this.isFilled = true;

        Main.frame.addMouseWheelListener(e ->
            this.mouseWheelRotation = e.getWheelRotation()
        );

        this.setScreenPosition(new Vector2((float)Main.frame.getWidth() / 2, (float)Main.frame.getHeight() / 2));

    }

    private int mouseWheelRotation = 0;

    @Override
    public void update(int frames) {
        this.vertices[0] = new Vector3(-size, -size, 0);
        this.vertices[1] = new Vector3(size, -size, 0);
        this.vertices[2] = new Vector3(size, size, 0);
        this.vertices[3] = new Vector3(-size, size, 0);

        if(Keyboard.isKeyPressed(KeyEvent.VK_R)) {
            this.resetRotation();
        }

        if(Keyboard.isKeyPressed(KeyEvent.VK_Q)) {
            this.size += 0.7f;
        }

        if(Keyboard.isKeyPressed(KeyEvent.VK_E)) {
            this.size -= 0.7f;
        }

        this.rotationZ = frames * 0.001f;

        // set the color to a colorful gradient that changes over time
        this.color = new Color(
            (int) (Math.sin(frames / 100f) * 127 + 128),
            (int) (Math.sin(frames / 100f + 2) * 127 + 128),
            (int) (Math.sin(frames / 100f + 4) * 127 + 128)
        );
    }

}