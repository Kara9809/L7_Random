public class ex7 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*101);
        System.out.println("num : "+num);
        if (num>50) {
            System.out.println("Greater");
        }else{
            System.out.println("not");
        }
    }
}
