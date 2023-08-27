public class ex4 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*51)+30;
        System.out.println("num : "+num);
        if (num%2==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
