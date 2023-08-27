public class ex6 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*551)+200;
        int b = (int) (Math.random()*551)+200;
        int c = (int) (Math.random()*551)+200;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("Min : "+Math.min(a, Math.min(b,c)));
    }
}
