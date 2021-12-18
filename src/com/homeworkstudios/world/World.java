package com.homeworkstudios.world;

import com.homeworkstudios.Main;
import com.homeworkstudios.world.object.Object;
import com.homeworkstudios.world.object.defaults.Box;

import java.awt.*;

public class World {

    private Object[] objects;

    public World() {
        objects = new Object[1];
        objects[0] = new Box();
    }

    public Color backgroundColor = Color.BLACK;

    public void add(Object object) {
        objects[0] = object;
    }

    public void remove(Object object) {
        objects[0] = null;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void update(int frames) {
        for (Object object : objects) {
            object.update(frames);
        }
    }

}
