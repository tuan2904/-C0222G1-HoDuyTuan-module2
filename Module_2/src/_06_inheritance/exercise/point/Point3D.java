package _06_inheritance.exercise.point;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z)   {
                this.getX();
                this.getY();
                this.z=z;

    }
    public float[] getXYZ(){
        float[] arr1=new  float[3];
        arr1[0]=getX();
        arr1[1]=getY();
        arr1[2]=getZ();
        return arr1;
    }
    @Override
    public String toString() {
        return " x" +
                getX()+
                " y "
                + getY()
                + " z " +
                z;
    }
}
