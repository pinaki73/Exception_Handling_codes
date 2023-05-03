class Exception_Demo {

}
public class Main {
    public static void main(String[] args) {
        try {
           try {
               String n = null;
               String m = null;
               System.out.println(n);
               System.out.println(n.length());
               System.out.println(m.length());
           }catch (NullPointerException n){
               n.printStackTrace();
           }
           int a = 100/0;
            System.out.println(a);
        } catch (ArithmeticException n) {
            n.printStackTrace();
        }

        System.out.println("hello");
    }
}




