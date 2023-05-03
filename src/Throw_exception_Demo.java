public class Throw_exception_Demo {
    public static void carSelection(boolean n){
         if(n == true){
             System.out.println("The car can be bought");
         }else {
             throw new RuntimeException("The car is not suitable for buying");
         }
    }

    public static void main(String[] args) {
        carSelection(false);
    }
}
