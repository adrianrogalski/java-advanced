package day1.homework;

public class Point3D extends Point2D {

    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int[] getXYZ(){
        // ? wykorzystanie metody getXY
        int[] coordinates = {super.getX(), super.getY(), z};
        return coordinates;
    }

    @Override
    public String toString() {
        // ? uzycie super.getX()
        return "(" + super.getX() +", " + super.getY() + ", " + z + ")";
    }
}
