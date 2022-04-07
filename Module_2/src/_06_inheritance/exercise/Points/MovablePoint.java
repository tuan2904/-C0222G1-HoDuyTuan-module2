package _06_inheritance.exercise.Points;

import java.util.Arrays;

public class MovablePoint extends Points {
    private float  xSpeed;
    private float  ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float [] arr2=new float[2];
        return arr2;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public MovablePoint move  (){
      super.setX(getX()+getxSpeed());
      super.setY(getY()+getySpeed());
      return this;
    }
}
