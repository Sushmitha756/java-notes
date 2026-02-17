public class Task2 {
    public static void main(String[] args) {
        int a = 5;
        if (isPrime(a)) {
            System.out.println(a + " is prime");
        }
        else {
            System.out.println(a + "  is not prime");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num%2 == 0) return false;
        for( int i =3;i*i <=num; i+=2){
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
