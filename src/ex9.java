public class ex9 {
    public static void main(String[] args) {
        int radius = (int) (Math.random() * 10) + 1;
        System.out.println("Radius : " + radius);
        System.out.println("Area : " + Math.PI * Math.pow(radius, 2));
        System.out.println("Perimeter : " + 2 * Math.PI * radius);
    }
}
