package com.homeworkstudios.math;

import javax.swing.*;

public class Projection2D {

    private static final float[][] orthographicMatrix = {
            {1, 0, 0},
            {0, 1, 0}
    };

    private static float[][] rotationX(float angle){
        return new float[][]{
                {1, 0, 0},
                {0, (float) Math.cos(angle), (float) Math.sin(angle)},
                {0, (float) -Math.sin(angle), (float) Math.cos(angle)}
        };
    }

    private static float[][] rotationY(float angle){
        return new float[][]{
                {(float) Math.cos(angle), 0, (float) -Math.sin(angle)},
                {0, 1, 0},
                {(float) Math.sin(angle), 0, (float) Math.cos(angle)}
        };
    }

    private static float[][] rotationZ(float angle){
        return new float[][]{
                {(float) Math.cos(angle), (float) Math.sin(angle), 0},
                {(float) -Math.sin(angle), (float) Math.cos(angle), 0},
                {0, 0, 1}
        };
    }

    public static Vector2 project(Vector3 vector) {
        JFrame jFrame = new JFrame();
        float middleX = (float)jFrame.getWidth() / 2;
        float middleY = (float)jFrame.getHeight() / 2;
        vector.add(-middleX, -middleY, 0);
        Vector2 projected = matrixMultiply(vector);
        projected.add(middleX, middleY, 0);
        return projected;
    }

    public static Vector2 rotate(Vector2 vector, float angleX, float angleY, float angleZ) {
        JFrame jFrame = new JFrame();
        float middleX = (float)jFrame.getWidth() / 2;
        float middleY = (float)jFrame.getHeight() / 2;
        vector.add(-middleX, -middleY, 0);
        Vector2 x = matrixMultiply2D(vector, rotationX(angleX));
        Vector2 y = matrixMultiply2D(x, rotationY(angleY));
        Vector2 z = matrixMultiply2D(y, rotationZ(angleZ));
        z.add(middleX, middleY, 0);
        return z;
    }

    private static Vector2 matrixMultiply(Vector3 vector) {
        float x = Projection2D.orthographicMatrix[0][0] * vector.getX() + Projection2D.orthographicMatrix[0][1] * vector.getY() + Projection2D.orthographicMatrix[0][2] * vector.getZ();
        float y = Projection2D.orthographicMatrix[1][0] * vector.getX() + Projection2D.orthographicMatrix[1][1] * vector.getY() + Projection2D.orthographicMatrix[1][2] * vector.getZ();
        return new Vector2(x, y);
    }

    private static Vector2 matrixMultiply2D(Vector2 vector, float[][] matrix) {
        float x = matrix[0][0] * vector.getX() + matrix[0][1] * vector.getY();
        float y = matrix[1][0] * vector.getX() + matrix[1][1] * vector.getY();
        return new Vector2(x, y);
    }

}
