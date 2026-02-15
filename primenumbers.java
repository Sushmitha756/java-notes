class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("prime numbers");

        for (int num = 2 ; num <= 100 ; num++){
            if (isPrime(num)) {
                System.out.println(num+ " ");
            }
        }
    }
    public static boolean isPrime (int n) {
        if (n <= 1)  return false ;
        if (n == 2)  return true ;
        if (n % 2 == 0)  return false ;

        for(int i = 3 ; i * i <= n ; i += 2){
            if(n % i == 0) return false ;
        }
        return true;
    }
}