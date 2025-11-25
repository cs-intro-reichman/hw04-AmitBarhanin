public class Primes {
    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]);
        boolean[] checkPrime = new boolean[range + 1];
        AllTrue(checkPrime);
        checkPrime[0] = false;
        checkPrime[1] = false;
        System.out.printf("Prime numbers up to %d:\n", range);
        for (int i = 2; i < Math.sqrt(range); i++) {
            for (int j = i + 1; j < checkPrime.length; j++) {
                if (IsDivide(j, i)) {
                    checkPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < checkPrime.length; i++) {
            if (checkPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        double percent = ((double) count / (double) range) * 100;
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)\n", count, range, (int) percent);

    }


    public static boolean IsDivide(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void AllTrue(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
    }
}
