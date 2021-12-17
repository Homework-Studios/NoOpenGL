package com.homeworkstudios.world;

import com.homeworkstudios.world.object.Object;
import com.homeworkstudios.world.object.defaults.Triangle;

public class World {

    private Object[] objects;

    public World() {
        objects = new Object[1];
        objects[0] = new Triangle();
    }

    public void add(Object object) {
        objects[0] = object;
    }

    public void remove(Object object) {
        objects[0] = null;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void update() {
        for (Object object : objects) {
            object.update();
        }
    }

}
