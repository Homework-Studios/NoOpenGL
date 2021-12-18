package com.homeworkstudios.math;

public class Vector2 {

    public float x = 0f;
    public float y = 0f;

    public Vector2() {
        x = 0f;
        y = 0f;
    }

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector3 v) {
        x = v.x;
        y = v.y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void add(float x, float y, float z) {
        this.x += x;
        this.y += y;
    }

    public float distanceSquared(Vector3 v) {
        return (x - v.x) * (x - v.x) + (y - v.y) * (y - v.y);
    }

    public float distance(Vector3 v) {
        return (float) Math.sqrt(distanceSquared(v));
    }

}
