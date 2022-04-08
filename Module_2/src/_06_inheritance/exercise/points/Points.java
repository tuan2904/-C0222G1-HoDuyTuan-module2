package _06_inheritance.exercise.points;

public class Points {
    private float x;
private float y;

    public Points() {
    }

    public Points(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
            float [] arr=new float[2];
            return arr;
    }

    @Override
    public String toString() {
        return "Points {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
