package com.homeworkstudios.world.object;

import com.homeworkstudios.math.Vector3;
import java.awt.*;

public abstract class Object {

    public Vector3[] vertices;
    protected boolean isFilled = true;

    public Vector3[] getVertices() {
        return vertices;
    }

    public void init(Vector3[] vertices) {
        this.vertices = vertices;
    }

    public Color getColor() {
        return Color.BLACK;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public abstract void update(int frames);

    public Polygon asPolygon(){
        Polygon poly = new Polygon();
        for(Vector3 v : vertices){
            poly.addPoint((int)v.x, (int)v.y);
        }
        return poly;
    }

}
