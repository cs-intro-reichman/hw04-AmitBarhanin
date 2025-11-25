public class Primes {
    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]);
        boolean[] checkPrime = new boolean[range + 1];
        AllTrue(checkPrime);
        checkPrime[0] = false;
        checkPrime[1] = false;
        System.out.printf("Prime numbers up to %d:\n", range);
        int i = 2;
        while (i * i <= range) {
            if (checkPrime[i]) {
                for (int j = i * i; j <= range; j += i) {
                    checkPrime[j] = false;
                }
            }
            i++;
        }
        int count = 0;
        for (i = 0; i < checkPrime.length; i++) {
            if (checkPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        double percent = ((double) count / (double) range) * 100;
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)\n", count, range, (int) percent);

    }

    public static void AllTrue(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
    }
}
