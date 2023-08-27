public class ex8 {
    public static void main(String[] args) {
        int length = (int) (Math.random()*10)+1;
        int width = (int) (Math.random()*10)+1;
        if (width>length) {
            int tmp = length;
            length = width;
            width = tmp;
        }
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
        System.out.println("Area :"+length*width);
        System.out.println("Perimeter : "+2*(length+width));
    }
}
