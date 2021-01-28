public class Primes {
    public static int countFactors(int n){
        int factors = 0;
        for(int i = 1; i <= n; i++){
          
          if(n % i == 0){
            factors++;
          }
        }
        return factors;
    }

    public static boolean isPrime(int n){
        boolean prime = true;
        if(countFactors(n)>2){
          prime = false;
        }else {
          prime = true;
        }
        return prime;
    }

    public static int countPrimes(int n){
        int numPrimes = 0;
        if(isPrime(n) == false){
          for(int i = 2; i <= n; i++){
          
            if(isPrime(i) == true){
              numPrimes++;
              //System.out.print("numPrimes: " + numPrimes + " i: " + i + " ");
            }
            }
       
        }
     return numPrimes;
  }
}
