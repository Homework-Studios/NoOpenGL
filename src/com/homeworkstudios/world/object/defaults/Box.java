package com.homeworkstudios.world.object.defaults;

import com.homeworkstudios.Main;
import com.homeworkstudios.math.Vector2;
import com.homeworkstudios.math.Vector3;
import com.homeworkstudios.world.object.Object;

public class Box extends Object {

    public Box() {
        init(new Vector3[5]);
        this.isFilled = true;
        this.setScreenPosition(new Vector2((float)Main.frame.getWidth() / 2, (float)Main.frame.getHeight() / 2));
    }

    @Override
    public void update(int frames) {
        this.vertices[0] = new Vector3(-200, -200, 0);
        this.vertices[1] = new Vector3(200, -200, 0);
        this.vertices[2] = new Vector3(200, 200, 0);
        this.vertices[3] = new Vector3( -200, 200, 0);
        this.vertices[4] = new Vector3(-200, -200, -200);

        this.rotationX += 0.001f;
        this.rotationZ += 0.01f;
    }

}
