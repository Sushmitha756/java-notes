public class Swap{
    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;
        System.out.println("Before swap" );
        System.out.println("Value of a:" +a);
        System.out.println("Value of b:" +b);

        a = a + b;
        b = a - b;
        a = a - b;
         System.out.println("After swap" );
        System.out.println("Value of a:" +a);
        System.out.println("Value of b:" +b);
    }
    
}