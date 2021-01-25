public class Primes {
    public static int countFactors(int n){
        int factors = 0;
        for(int i = 1; i <= n; i++){
          
          if(n % i == 0){
            factors++;
          }
        }
        System.out.println(factors);
        return factors;
    }

    public static boolean isPrime(int n){
        boolean prime = true;
        if(countFactors(n)>2){
          prime = false;
        }else {
          prime = true;
        }
        System.out.println(prime);
        return prime;
    }

    public static int countPrimes(int n){
        int numPrimes = 1;
        if(isPrime(n) == false){
          for(int i = 1; i <= n; i++){
          
          
            int count = n/i;
            if(count > 2){
              numPrimes++;
            }
            }
       
        }
     System.out.println(numPrimes);
     return numPrimes;
  }
}
