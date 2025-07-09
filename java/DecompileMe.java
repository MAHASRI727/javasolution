// File: DecompileMe.java
public class DecompileMe {
    public int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        DecompileMe d = new DecompileMe();
        System.out.println("Square of 8 is: " + d.square(8));
    }
}
