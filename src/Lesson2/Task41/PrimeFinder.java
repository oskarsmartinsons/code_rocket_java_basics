package Lesson2.Task41;

class PrimeFinder {
    boolean isPrime(int number){
        if (number < 2) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    void findTwinPrimes (int limit) {
        for (int i = 2; i < limit; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }
}
