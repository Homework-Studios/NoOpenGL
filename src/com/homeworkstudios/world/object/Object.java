package com.homeworkstudios.world.object;

import com.homeworkstudios.math.Projection2D;
import com.homeworkstudios.math.Vector2;
import com.homeworkstudios.math.Vector3;
import java.awt.*;

public abstract class Object {

    public Vector3[] vertices;
    protected boolean isFilled = true;

    public float rotationX = 0;
    public float rotationY = 0;
    public float rotationZ = 0;

    public Vector2 screenPosition = new Vector2();

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

    public void resetRotation(){
        rotationX = 0;
        rotationY = 0;
        rotationZ = 0;
    }

    public Vector2 getScreenPosition() {
        return screenPosition;
    }

    public void setScreenPosition(Vector2 screenPosition) {
        this.screenPosition = screenPosition;
    }

    public Polygon asPolygon(){
        Polygon poly = new Polygon();
        for(Vector3 v : vertices){
            if(v != null){

                Vector2 projected = Projection2D.project(v);

                Vector2 rotated = Projection2D.rotate(projected, rotationX, rotationY, rotationZ);

                Vector2 screenPosition = this.getScreenPosition();

                poly.addPoint((int) rotated.x + (int) screenPosition.x, (int) rotated.y + (int) screenPosition.y);
            }
        }
        return poly;
    }

}
