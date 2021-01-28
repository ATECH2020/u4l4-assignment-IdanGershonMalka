public class Main {
    public static void main(String[] args) {
       Primes myP = new Primes();
       int factor = myP.countFactors(24);
       System.out.print(factor);
       boolean prime = myP.isPrime(47);
       System.out.print(prime);
       int count = myP.countPrimes(24);
       System.out.print(count);
    }
}
