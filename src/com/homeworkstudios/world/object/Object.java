package com.homeworkstudios.world.object;

import com.homeworkstudios.math.Projection2D;
import com.homeworkstudios.math.Vector2;
import com.homeworkstudios.math.Vector3;
import java.awt.*;

public abstract class Object {

    public Vector3[] vertices;
    protected boolean isPoints = false;
    protected boolean isFilled = true;

    public float rotationX = 0;
    public float rotationY = 0;
    public float rotationZ = 0;

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

    public boolean isPoints() {
        return isPoints;
    }

    public abstract void update(int frames);

    public float getRotationX() {
        return rotationX;
    }

    public float getRotationY() {
        return rotationY;
    }

    public float getRotationZ() {
        return rotationZ;
    }

    public void setRotationX(float rotationX) {
        this.rotationX = rotationX;
    }

    public void setRotationY(float rotationY) {
        this.rotationY = rotationY;
    }

    public void setRotationZ(float rotationZ) {
        this.rotationZ = rotationZ;
    }

    public Polygon asPolygon(){
        Polygon poly = new Polygon();
        for(Vector3 v : vertices){
            if(v != null){

                Vector2 projected = Projection2D.project(v);

                Vector2 rotated = Projection2D.rotate(projected, rotationX, rotationY, rotationZ);

                poly.addPoint((int) rotated.x, (int) rotated.y);
            }
        }
        return poly;
    }

    public Vector2[] asPoints(){
        Vector2[] points = new Vector2[vertices.length];
        for(int i = 0; i < vertices.length; i++){
            if(vertices[i] != null){
                Vector2 projected = Projection2D.project(vertices[i]);
                Vector2 rotated = Projection2D.rotate(projected, rotationX, rotationY, rotationZ);
                points[i] = rotated;
            }
        }
        return points;
    }

}
