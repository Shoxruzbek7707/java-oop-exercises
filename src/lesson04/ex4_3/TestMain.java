package lesson04.ex4_3;

public class TestMain {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        System.out.println("Konstruktor testi: " + p1.getX() + ", " + p1.getY() + ", " + p1.getZ());

        Point3D p2 = new Point3D();
        float[] xyz2 = p2.getXYZ();
        System.out.println("Default konstruktor testi: " + xyz2[0] + ", " + xyz2[1] + ", " + xyz2[2]);

        p2.setXYZ(4, 5, 6);
        float[] xyz3 = p2.getXYZ();
        System.out.println("setXYZ testi: " + xyz3[0] + ", " + xyz3[1] + ", " + xyz3[2]);

        Point3D p3 = new Point3D(7, 8, 9);
        float[] xyz4 = p3.getXYZ();
        System.out.println("getXYZ testi: " + xyz4[0] + ", " + xyz4[1] + ", " + xyz4[2]);

        Point3D p4 = new Point3D(10, 11, 12);
        System.out.println("toString testi: " + p4);
    }
}
