public class ex2 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*10)+1;
        int b = (int) (Math.random()*10)+1;
        int c = (int) (Math.random()*10)+1;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("Avg : "+(a + b +c)/3);
    }
}
