package ReplitCollections;

public class PrimeNumbers {
    /*
    Count the number of prime numbers less than a non-negative number, n.
    n = 20
    output should be 8
    Other Example:
    Input: 10
    Output: 4
    Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     */
    public static void main(String[] args) {
        int n = 20;
        System.out.println(primeNumbers(20));
    }

    /*
        public static int primeNumbers(int n) {
            // 2, 3, 5, 7, 11, Prime numbers has 2 factors 1 and itself,    factors of 6: 6, 3, 2, 1
            int countPrime = 0;
            for (int p = 2; p < n; p++) {
                int count = 0;
                for (int f = 1; f <= n/2; f++) { // why
                    if (n % f == 0) {
                        count++;
                    }
                    if (count == 2) {
                        countPrime++;
                    }
                }
            }
            return countPrime;
        }

     */
    public static int primeNumbers(int n) {
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;

        int count = 2;
        for (int i = 4; i < n; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}
